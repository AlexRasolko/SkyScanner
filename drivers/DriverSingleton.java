import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

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
            driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(DEFAULT_IMPLICITLY, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}


