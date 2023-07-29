package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class JSEExecutorDemo extends CommonMethods {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
       WebElement userName= driver.findElement(By.id("txtUsername"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
      //  js.executeScript("arguments[0].style.backgroundColor='green'",userName);
        js.executeScript("arguments[0].style.border='2px solid red'",userName);
    }
}
