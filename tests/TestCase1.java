import org.testng.annotations.Test;

public class TestCase1 {

    //run the app
    @Test
    public static void OpenSite() {
        DriverSingleton.getDriver();
        DriverSingleton.driver.navigate().to("https://www.skyscanner.com");
    }

}
