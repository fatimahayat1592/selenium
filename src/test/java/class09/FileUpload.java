package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) {
        String url="https://the-internet.herokuapp.com/upload";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement fileUploadBtn= driver.findElement(By.xpath("//input[@id='file-upload']"));
        fileUploadBtn.sendKeys("C:\\Users\\asamc\\OneDrive\\Desktop\\Test  scenarios  for gmail login.docx");
    }
}
