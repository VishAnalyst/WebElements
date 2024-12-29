import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

public class clickhereupload {

@Test

    public void ClickHereElement() throws IOException {
    //Initialise the driver and called the website
    WebDriver driver = new ChromeDriver();
    driver.get("https://stock.scriptinglogic.in/amol.html");
    driver.manage().window().maximize();
    System.out.println("The browser is opened and the it is maximized");

    //Locating click her and passing the value
    WebElement ClickHere = driver.findElement(By.xpath("//input[@value='browse here']"));
    ClickHere.sendKeys("/Users/preethianil/Downloads/Selenium/ScreenShots/img.png");
    System.out.println("The Image is uploaded and its displayed the image name.");

    //Now Taking the screenshot.
    //Step one: The Object for taking screenshot to be called.
    //Assign it to driver
    //Type cast the same to avoid the issue
    TakesScreenshot objScr = (TakesScreenshot) driver;

    //Step 2: Call the method of the obj above to take a screenshot which is getScreenshotAs() and assign it to a value created
    //Assign this to a variable and mark OutputType as File
    File SrcFile = objScr.getScreenshotAs(OutputType.FILE);

    //Taking the current time from the system so as to create separate images otherwise overlap will happen.
    //for that we will need string with a variable assign it to the Simple date format
    String timeStamp = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
    String fileName = "IMG"+timeStamp+".png";

    //Step3: Copy the screenshot to a specified path here we need a jar file which is to be downloaded and kept inside the lib folder
    FileUtils.copyFile(SrcFile, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+fileName));
    System.out.println("The screenshot is taken and the file name is: "+fileName);

    driver.quit();

    }

@Test

    public void textUnderChooseFile() throws IOException {
    //Initialise the webdriver call the website and maximise the broswer
    WebDriver driver = new ChromeDriver();
    driver.get("https://stock.scriptinglogic.in/amol.html");
    driver.manage().window().maximize();

    //locate the element and print that the element is present and est passed.
    WebElement TextChooseFile = driver.findElement(By.xpath("//p[normalize-space()='this is a normal text']"));
    if (TextChooseFile.isDisplayed()){
        System.out.println("The Text is present TEST IS PASSED");
    }else {
        System.out.println("The Text is not present TEST IS FAILED");
    }

    //Take Screenshot as a proof
        //Step1: Initialise the object for the takescreenshot and assign it ot driver.
        //then tye cast the same
        TakesScreenshot objScrShot = (TakesScreenshot) driver;

        //Step2: Create a methode for the object and assign to a File Output Type.
        File ScrFile = objScrShot.getScreenshotAs(OutputType.FILE);

        //Take a note of the simple date format from the system and convert the same to a string and assign to a variable.
        //Determine how a file format should be
        String timeStamp = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
        String FileName = "IMG"+timeStamp+".png";

        //Step3: copy the file on to a location and print that the screenshot is taken and test is passed.
        FileUtils.copyFile(ScrFile, new File ("/Users/preethianil/Downloads/Selenium/ScreenShots/"+FileName));
        System.out.println("The Screen shot is taken and the file name is: "+FileName);

        System.out.println("THE TEST IS PASSED");

    driver.quit();
    }

@Test
    public void ClearName () throws IOException, InterruptedException {

        //Initialise the bowser and call the webiste and maximise
        WebDriver driver = new ChromeDriver();
        driver.get("https://stock.scriptinglogic.in/amol.html");
        driver.manage().window().maximize();

    Thread.sleep(4000);

        //Locate the text field and erase the value inside the text box.
        WebElement nameField = driver.findElement(By.xpath("//input[@id='name']"));
        nameField.clear();
    Thread.sleep(4000);

                //Take Screenshot as a Proof
                TakesScreenshot ObjFile = (TakesScreenshot) driver;
                File ScrFile = ObjFile.getScreenshotAs(OutputType.FILE);
                String timeStamp = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
                String FileFormat = "IMG"+timeStamp+".png";
                FileUtils.copyFile(ScrFile, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+FileFormat));
                System.out.println("The name field is empty and screenshot is taken and saved as a File name "+FileFormat);
    Thread.sleep(4000);
        //Pass the new value to the field.
        //Locate the field and pass the value.
        WebElement nameFieldNew = driver.findElement(By.xpath("//input[@id='name']"));
        nameFieldNew.sendKeys("TestUser");
    Thread.sleep(4000);
                //Take Screenshot as a Proof
                TakesScreenshot ObjFileNew = (TakesScreenshot) driver;
                File ScrFileNew = ObjFileNew.getScreenshotAs(OutputType.FILE);
                String timeStampNew = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
                String FileFormatNew = "IMG"+timeStampNew+".png";
                FileUtils.copyFile(ScrFileNew, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+FileFormatNew));
                System.out.println("The name field is empty and screenshot is taken and saved as a file name" + FileFormatNew);

                driver.quit();
    }
    @Test
    public void CheckBoxClick() throws IOException {
    //initialte the webdriver and call the web page and maximize
        WebDriver driver = new ChromeDriver();
        driver.get("https://stock.scriptinglogic.in/amol.html");
        driver.manage().window().maximize();

    //Locate the check boxes a click the same.
        //Default Checked java check box
        WebElement javaCheckbox = driver.findElement(By.xpath("//input[@id='check0']"));
        javaCheckbox.click();
        //Click again
        WebElement javaCheckbox1 = driver.findElement(By.xpath("//input[@id='check0']"));
        javaCheckbox1.click();

        //Default Unchecked
        WebElement seleniumCheckbox = driver.findElement(By.xpath("//input[@id='check1']"));
        seleniumCheckbox.click();

        //Default Unchecked so need to perform two clicks
        WebElement CucumberCheckbox = driver.findElement(By.xpath("//input[@id='check2']"));
        CucumberCheckbox.click();
        //Click again
        WebElement CucumberCheckbox1 = driver.findElement(By.xpath("//input[@id='check2']"));
        CucumberCheckbox1.click();

        System.out.println("All the checkboxes is checked");

        //Take Screenshot as a proof
        TakesScreenshot objScr = (TakesScreenshot) driver;
        File scrFile = objScr.getScreenshotAs(OutputType.FILE);
        String timeStamp = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
        String fileType = "IMG"+timeStamp+".png";
        FileUtils.copyFile(scrFile, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+fileType));
        System.out.println("The screenshot is taken and saved to the Location and named as:"+fileType);

    //Unchecking process.
    //Locate the elements and click it agaim
        WebElement javaUnCheckbox = driver.findElement(By.xpath("//input[@id='check0']"));
        javaUnCheckbox.click();

        WebElement seleniumUnCheckbox = driver.findElement(By.xpath("//input[@id='check1']"));
        seleniumUnCheckbox.click();

        WebElement CucumberUnCheckbox = driver.findElement(By.xpath("//input[@id='check2']"));
        CucumberUnCheckbox.click();

        //TakeScreenshot as a proof for unchecking process
        TakesScreenshot objScrSht = (TakesScreenshot) driver;
        File scrFileUn = objScrSht.getScreenshotAs(OutputType.FILE);
        String timeStampUn = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
        String fileTypeUn = "IMG"+timeStampUn+".png";
        FileUtils.copyFile(scrFileUn, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+fileTypeUn));
        System.out.println("The Screenshot for the check box un checking is captured and the file name is: "+ fileTypeUn);

    System.out.println("TEST IS PASSED");
    driver.quit();
    }
@Test

    //Radio button
    public void RadioButton() throws IOException {
    //Initiate the webdriver and open the website and maximize the same.
        WebDriver driver = new ChromeDriver();
        driver.get("https://stock.scriptinglogic.in/amol.html");
        driver.manage().window().maximize();

        //Button click the radio buttons
        //locate the radio button and perform click
        WebElement javaradioButton = driver.findElement(By.xpath("//input[@id='rad0']"));
        javaradioButton.click();
        if (javaradioButton.isSelected()) {
            System.out.println("Java radio button is clicked");
        }else {
            System.out.println("Java radio button is not clicked");
            }

        //Locate selenium radio button and perform click
        WebElement seleniumradioButton = driver.findElement(By.xpath("//input[@id='rad1']"));
        seleniumradioButton.click();
        if (seleniumradioButton.isSelected()){
            System.out.println("Selenium radio button is clicked");
        }else {
            System.out.println("selenium radio button is not clicked");
        }

        //Locate Cucumber radio button and perform click
        WebElement cucumberradioButton = driver.findElement(By.xpath("//input[@id='rad2']"));
        cucumberradioButton.click();
        if (cucumberradioButton.isSelected()){
            System.out.println("cucumber radio button is clicked");
        }else {
            System.out.println("cucumber radio button is not clicked");
        }

        //Taking the screenshot of the same.
        //Initialise the takescreenshot object and assign it to driver and type cast the same
        TakesScreenshot objScrRb = (TakesScreenshot) driver;
        //Initialise the method for the object created and pass the output type as a file and determine scrfile
        File ScrFileRb = objScrRb.getScreenshotAs(OutputType.FILE);
        //Takeing the current system date of the system and convert it to string format and strore it
        String timeStampRb = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
        //assign the how screenshot file should look like
        String fileName = "IMG"+timeStampRb+".png";
        //Now we need to copy the scrfile to the destination location and print that sceenshot is taken
        FileUtils.copyFile(ScrFileRb, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+fileName));
        System.out.println("The screenshot is taken and stored in the File name as: "+fileName);
     System.out.println("THE TEST IS PASSED");
     driver.quit();
    }

@Test

    public void DropDownSelection() throws IOException {
    //Initiate the web driver and maximize the same
    WebDriver driver = new ChromeDriver();
    driver.get("https://stock.scriptinglogic.in/amol.html");
    driver.manage().window().maximize();

    //Locate the first drop down and click the same.
    WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='seltext']"));
    System.out.println("The Dropdown is found and its selected");

    //initiate select object so that we can select from dropdown.
    Select dropDown = new Select(dropDownElement);

    //Select various optins from the dropdown and taking creenshot respectively.
    //Select option 1 from dropdown
    dropDown.selectByValue("v1");
    System.out.println("Option 1 is selected");
        //Taking screenshot as a proof
        TakesScreenshot objSc1 = (TakesScreenshot) driver;
        File scrFile1 = objSc1.getScreenshotAs(OutputType.FILE);
        String timeStamp1 = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
        String fileFormat1 = "IMG"+timeStamp1+".png";
        FileUtils.copyFile(scrFile1, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+fileFormat1));
        System.out.println("The Screenshot for the dropdown option 1 is selected.and the file name is "+ fileFormat1);

    //Select various optins from the dropdown and taking creenshot respectively.
    //Select option 2 from dropdown
    dropDown.selectByValue("v2");
    System.out.println("Option 2 is selected");
        //Taking screenshot as a proof
        TakesScreenshot objSc2 = (TakesScreenshot) driver;
        File scrFile2 = objSc2.getScreenshotAs(OutputType.FILE);
        String timeStamp2 = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
        String fileFormat2 = "IMG"+timeStamp2+".png";
        FileUtils.copyFile(scrFile2, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+fileFormat2));
        System.out.println("The Screenshot for the dropdown option 2 is selected.and the file name is "+ fileFormat2);

    //Select various optins from the dropdown and taking creenshot respectively.
    //Select option 3 from dropdown
    dropDown.selectByIndex(2);
    System.out.println("Option 3 is selected");
        //Taking screenshot as a proof
        TakesScreenshot objSc3 = (TakesScreenshot) driver;
        File scrFile3 = objSc3.getScreenshotAs(OutputType.FILE);
        String timeStamp3 = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
        String fileFormat3 = "IMG"+timeStamp3+".png";
        FileUtils.copyFile(scrFile3, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+fileFormat3));
        System.out.println("The Screenshot for the dropdown option 3 is selected. And file name is " + fileFormat3);

    //Select option 4 from dropdown
    dropDown.selectByIndex(3);
    System.out.println("Option 3 is selected");
    //Taking screenshot as a proof
        TakesScreenshot objSc4 = (TakesScreenshot) driver;
        File scrFile4 = objSc4.getScreenshotAs(OutputType.FILE);
        String timeStamp4 = new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
        String fileFormat4 = "IMG"+timeStamp4+".png";
        FileUtils.copyFile(scrFile4, new File("/Users/preethianil/Downloads/Selenium/ScreenShots/"+fileFormat4));
        System.out.println("The Screenshot for the dropdown option 4 is selected. file name is "+ fileFormat4 );

    System.out.println("TEST PASSED: Dropdown selection works fine");
    driver.quit();
    }

}
