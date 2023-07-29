package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class MultiDo extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
       WebElement DD= driver.findElement(By.xpath("//select[@name='States']"));
        Select sel=new Select(DD);
        boolean isMultiple=sel.isMultiple();
        System.out.println("The drop down is multi select "+isMultiple);
        sel.selectByVisibleText("California");
        sel.selectByValue("Ohio");
        sel.selectByIndex(7);
        sel.deselectByVisibleText("ohio");
    }
}
