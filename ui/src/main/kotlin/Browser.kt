import org.openqa.selenium.HasAuthentication
import org.openqa.selenium.UsernameAndPassword
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.Augmenter
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.URL


private val browsers = ThreadLocal<Browser>()

val browser
    get() = browsers.get() ?: run { Browser() }.also { browsers.set(it) }

class Browser {

    val driver: WebDriver?

    init {

        val options = ChromeOptions()
        val selenoidOpts = mapOf(
            "enableVNC" to true
        )
        options.apply {
            browserVersion = "122"
            addArguments("start-maximized")
            setCapability("selenoid:options", selenoidOpts)
        }

        driver = RemoteWebDriver(
            URL("http://localhost:4444/wd/hub"), options
        )

        (driver.toAugment as HasAuthentication).register { UsernameAndPassword("admin", "admin") }

    }

    private val WebDriver.toAugment
        get() = Augmenter().augment(this)

    fun open(url: String) = driver!!.navigate().to(url)
}