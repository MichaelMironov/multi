import io.qameta.allure.Allure
import org.testng.annotations.Test
import java.lang.Thread.sleep

class ApiTests {

    @Test
    fun firstApiTest() {
        Allure.step {
            sleep(5_000L)
            println("#1 API Test")
        }

    }

    @Test
    fun secondApiTest() {
        Allure.step {
            sleep(5_000L)
            println("#2 API Test")
        }
    }
}