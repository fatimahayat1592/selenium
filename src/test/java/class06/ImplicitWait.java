package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.time.Duration;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {
      String url="https://www.facebook.com/";
      String browser="chrome";
      openBrowserAndLaunchApplication(url,browser);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        sendText("fatima", firstName);
    }
}
