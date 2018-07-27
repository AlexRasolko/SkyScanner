import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Collection;

public class TestCase1 {

    //run the app
    @Test
   public static void Test1(){
    Collection Logo = DriverSingleton.driver.findElements(By.id(Locators.LogoIcon));

    CommonMethods.OpenSite();
        CommonMethods.VerifyIfExist(1, Logo, "The main page hasn't been loaded.");


}
}
