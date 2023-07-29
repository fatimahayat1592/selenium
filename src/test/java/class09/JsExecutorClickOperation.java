package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class JsExecutorClickOperation extends CommonMethods {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
       WebElement loginBtn= driver.findElement(By.xpath("//input[@id='btnLogin']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",loginBtn);
    }
}
