import org.openqa.selenium.WebDriver;

public class DriverSingleton {

    private static String CHROME_DRIVER = "webdriver.chrome.driver";
    private static String CHROME_PATH = ".\\WebDriver\\chromedriver_win32\\chromedriver.exe";
    private static int PAGE_LOAD_TIMEOUT = 60;
    private static int DEFAULT_IMPLICITLY = 10;

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null)
        {
            System.setProperty(CHROME_DRIVER, CHROME_PATH);
            driver.manage().window().maximize();
        }

        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}


