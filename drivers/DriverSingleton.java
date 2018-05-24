import org.openqa.selenium.WebDriver;

public class DriverSingleton {

    private static String CHROME_DRIVER = "webdriver.chrome.driver";
    private static int PAGE_LOAD_TIMEOUT = 60;
    private static int DEFAULT_IMPLICITLY = 10;

    private static WebDriver driver;

    public static WebDriver getDriver() {

        return driver;
    }
}


