import org.testng.annotations.BeforeClass
import org.testng.annotations.Test

internal class RemoteChromeCdpTest {

    @BeforeClass
    fun setupTest() {
//        getRuntime().addShutdownHook(
//            thread { browser.driver?.quit() }
//        )
    }

    @Test
    fun test() {

        browser.open("https://the-internet.herokuapp.com/basic_auth")

    }
}