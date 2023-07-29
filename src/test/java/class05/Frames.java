package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class Frames extends CommonMethods {
    public static void main(String[] args) {
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.switchTo().frame(1);
       WebElement animal= driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());
      WebElement dd=  driver.findElement(By.xpath("//select[@id='animals']"));
    Select sel=new Select(dd);
    sel.selectByVisibleText("Baby Cat");
    driver.switchTo().defaultContent();
    driver.switchTo().frame("frame1");
    WebElement txtBox=driver.findElement(By.xpath("//input"));
txtBox.sendKeys("abracadabra");
      WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
   driver.switchTo().frame(frame3);
   driver.findElement(By.id("a")).click();


    }

}
