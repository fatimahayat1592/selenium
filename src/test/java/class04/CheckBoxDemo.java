package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class CheckBoxDemo extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
       WebElement c1= driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
       if(!c1.isSelected()) {
           c1.click();
       }
        List<WebElement>  options=driver.findElements(By.xpath("//input[@class='cb1-element']"));
       for(WebElement option:options){
           String value=option.getAttribute("value");
           if(value.equals("Option-3")){
               option.click();
               break;
           }
       }
    }
}
