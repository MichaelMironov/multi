import io.qameta.allure.Allure
import org.testng.Assert
import org.testng.annotations.Test
import java.lang.Thread.sleep

class ApiTests {

    private var counter = 1

    @Test
    fun firstApiTest() {
        Allure.step {
            sleep(5_000L)
            if (counter == 0) {
                println("#1 API Test")
            } else {
                --counter
                Assert.fail()
            }
        }

    }

    @Test
    fun secondApiTest() {
        Allure.step {
            sleep(5_000L)
            --counter
            if (counter == 0) {
                println("#2 API Test")
            } else {
                --counter
                Assert.fail()
            }
        }
    }
}