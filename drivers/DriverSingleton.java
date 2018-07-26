import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.util.concurrent.TimeUnit;

public class DriverSingleton {

    private static final String CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String CHROME_PATH = ".\\WebDriver\\chromedriver_win32\\chromedriver.exe";
    private static final String NORMAL_PARAMETER = "normal";
    private static final int PAGE_LOAD_TIMEOUT = 60;
    private static final int DEFAULT_IMPLICITLY = 10;

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null)
        {
            System.setProperty(CHROME_DRIVER, CHROME_PATH);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments(CapabilityType.PAGE_LOAD_STRATEGY, NORMAL_PARAMETER);
            driver = new ChromeDriver(options);
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


