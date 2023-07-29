package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class RadioButtons extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser="chrome";
       openBrowserAndLaunchApplication(url,browser);
      WebElement r= driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
       r.click();
       boolean r1isSelected=r.isSelected();
        System.out.println("Button male selected "+r1isSelected);
       boolean r1isDisplayed= r.isDisplayed();
        System.out.println("Displayed "+r1isDisplayed);
        boolean r1isEnabled=r.isEnabled();
        System.out.println("Enabled "+r1isEnabled);
        WebElement r2= driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
        r2.click();
        r1isSelected=r.isSelected();
        System.out.println("Male radio button selected "+r1isSelected);

    }
}
