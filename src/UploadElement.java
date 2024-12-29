import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UploadElement {


    public static void main(String[] args) throws IOException {
        //open the website
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/upload");
        driver.manage().window().maximize();

        System.out.println("The browser is opened");



            //Click the click here file
            WebElement ChooseFile = driver.findElement(By.xpath("//input[@id='fileInput']"));

            //passValues
            ChooseFile.sendKeys("/Users/preethianil/Downloads/Selenium/ScreenShots/img.png");

            //Click the click here file
            WebElement uploadButton = driver.findElement(By.xpath("//button[@id='fileSubmit']"));
            uploadButton.click();

            System.out.println("File upload element works fine");

            //Taking Screenshot
            //Step 1 initialise the object for screenshot and assign to driver
            //Cast the type the driver
            TakesScreenshot scrObj = (TakesScreenshot) driver;

            //Step2 Assign the Object file to methode getScreenshotAs() and assign it to a File Outputtype
            File ScrFile = scrObj.getScreenshotAs(OutputType.FILE);

            //Getting the current system date and assign it to string timeStamp
            //Determine the date and assign it to new date
            String timeStamp = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
            String fileName = "IMG"+timeStamp+".png";

            //Step 3:
            //copy the image file into real file image
            FileUtils.copyFile(ScrFile, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/" +fileName));
            System.out.println("Screenshot is taken and its named as "+fileName);
            driver.quit();


    }

}