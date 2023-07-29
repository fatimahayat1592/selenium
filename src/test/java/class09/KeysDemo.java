package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class KeysDemo extends CommonMethods {
    public static void main(String[] args) {
        String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
       WebElement userName= driver.findElement(By.id("ctl00_MainContent_username"));
       userName.sendKeys("Tester", Keys.TAB);
       WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
       password.sendKeys("test",Keys.ENTER);
    }
}
