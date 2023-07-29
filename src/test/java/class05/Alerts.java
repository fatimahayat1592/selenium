package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
       WebElement alertBtn= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
       alertBtn.click();
       Thread.sleep(2000);
        Alert confirmationAlert1=driver.switchTo().alert();
        confirmationAlert1.accept();
        WebElement alert2Btn= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2Btn.click();
        Thread.sleep(5000);
        Alert confirmationAlert2=driver.switchTo().alert();
        confirmationAlert2.dismiss();
        WebElement alert3Btn=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3Btn.click();
        Thread.sleep(5000);
        Alert confirmationAlert3=driver.switchTo().alert();
        confirmationAlert3.sendKeys("syntax");
        Thread.sleep(5000);
        confirmationAlert3.accept();


    }
}
