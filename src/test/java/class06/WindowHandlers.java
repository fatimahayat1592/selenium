package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.Set;

public class WindowHandlers extends CommonMethods {
    public static void main(String[] args) {
        String url="https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
       WebElement helpBtn= driver.findElement(By.linkText("Help"));
    helpBtn.click();
    WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));
    privacyBtn.click();
    String mainPageHandle=driver.getWindowHandle();
        System.out.println("main page handle is "+mainPageHandle);
        Set<String> allHandles= driver.getWindowHandles();
        for(String handle:allHandles){
            driver.switchTo().window(handle);
           String title= driver.getTitle();
           if(title.equalsIgnoreCase("Google Account Help")){
               break;
           }
            //System.out.println("The title associated with "+handle+" is "+title);

        }
        System.out.println("the current page under focus is "+driver.getTitle());
        driver.switchTo().window(mainPageHandle);
        System.out.println("The focus is on "+driver.getTitle());

    }
}
