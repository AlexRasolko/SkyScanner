import org.openqa.selenium.*;
import org.testng.Assert;

import java.util.Collection;

public class CommonMethods {

    public static void VerifyIfExist(int ExpectedSize, Collection ActualSize, String message)
    {
        Assert.assertEquals(ExpectedSize, ActualSize.size(), message);
    }

    public static void OpenSite() {
        DriverSingleton.getDriver();
        DriverSingleton.driver.navigate().to("https://www.skyscanner.com");
    }

}
