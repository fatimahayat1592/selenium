package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    /**
     * task:
     * navigate to google.com
     */
    public static void main(String[] args) throws InterruptedException {
        //declare the instance
        WebDriver driver=new ChromeDriver();
        //use .ger(url) to navigate to the desired url
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String currentUrl=driver.getCurrentUrl();
        System.out.println("the current url of website is "+currentUrl);
        String title=driver.getTitle();
        System.out.println("the title of page is : "+title);
        Thread.sleep(5000);

        driver.quit();
    }
}
