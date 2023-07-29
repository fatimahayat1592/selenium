package class0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       // WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}