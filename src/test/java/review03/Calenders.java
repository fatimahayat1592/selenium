package review03;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.io.IOException;
import java.util.List;

public class Calenders extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url = "https://www.delta.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement calender = driver.findElement(By.xpath("//div[@role='button']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", calender);
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        boolean found = false;
        while (!found) {
            String currentMonth = month.getText();
            if (currentMonth.equals("September")) {
                js.executeScript("arguments[0].style.border='2px solid pink'",month);
            found = true;
        }else{
            WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
            nextBtn.click();
        }
    }
        List<WebElement> dates= driver.findElements(By.xpath("//tabla/tbody/tr/td"));
        for(WebElement date:dates){
            String dd=date.getText();
            if(dd.equals("17")){
                date.click();
                break;
            }
        }
        takeScreenShot("selectedDate");
}
}