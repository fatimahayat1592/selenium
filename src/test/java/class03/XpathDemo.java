package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement name=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        name.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
       WebElement loginBtn= driver.findElement(By.xpath("//input[contains(@id,'login')]"));
       loginBtn.click();


        WebElement pimTab=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimTab.click();


    }
}
