public class TestCase1 {

    //run the app
    public static void OpenSite() {
        DriverSingleton.getDriver();
        DriverSingleton.driver.navigate().to("https://www.skyscanner.com");
    }

}
