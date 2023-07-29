package review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class ActionsReview extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
         openBrowserAndLaunchApplication(url,browser);

        WebElement name = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        name.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
       Actions actions=new Actions(driver);
       actions.click(loginBtn).perform();
       WebElement leaveTab=driver.findElement(By.id("menu_leave_viewLeaveModule"));
       actions.moveToElement(leaveTab).perform();

    }
}