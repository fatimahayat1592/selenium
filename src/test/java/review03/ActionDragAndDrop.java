package review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class ActionDragAndDrop extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.switchTo().frame(0);
      WebElement dragAble= driver.findElement(By.id("draggable"));
      WebElement dropAble= driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(dragAble).moveToElement(dropAble).release().build().perform();

    }
}
