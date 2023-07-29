package review03;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import utils.CommonMethods;

import java.io.File;
import java.io.IOException;

public class KeysDemo extends CommonMethods {
    public static void main(String[] args) throws InterruptedException, IOException {
        String url = "https://the-internet.herokuapp.com/key_presses";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement textBox=driver.findElement(By.id("target"));
        textBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        textBox=driver.findElement(By.id("target"));
        textBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        textBox=driver.findElement(By.id("target"));
        textBox.sendKeys(Keys.ARROW_DOWN);
//        TakesScreenshot ts=(TakesScreenshot) driver;
//        File ss=ts.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(ss,new File(System.getProperty("user.dir")+"/screenShot/abc.png"));
takeScreenShot("MySS");
    }
}
