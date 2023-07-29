package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class JavaScriptExecutor2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.amazon.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, -500)");
       WebElement dd= driver.findElement(By.xpath("//select[@name='url']"));
       Thread.sleep(3000);
        js.executeScript("arguments[0].click();",dd);
    }
}
