import io.qameta.allure.Allure
import org.testng.annotations.Test
import java.lang.Thread.sleep

class UiTests {

    @Test
    fun firstUiTest() {
        Allure.step {
            sleep(5_000L)
            println("#1 UI Test")
        }

    }

    @Test
    fun secondApiTest() {
        Allure.step {
            sleep(5_000L)
            println("#2 UI Test")
        }
    }
}