package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();
        WebElement userNameTextBox=driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Admin");
       // driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        Thread.sleep(2000);
        userNameTextBox.clear();
        userNameTextBox.sendKeys("Admin");
       WebElement web= driver.findElement(By.name("txtPassword"));
       web.sendKeys("Hum@nhrm123");
       WebElement logBtn=driver.findElement(By.className("button"));
       logBtn.click();
      WebElement message= driver.findElement(By.linkText("Welcome Admin"));
      String text=message.getText();
        System.out.println(text);
        driver.findElement(By.partialLinkText("Recru")).click();

    }
}