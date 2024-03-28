package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot
{
   public static  String screenshot_dir= System.getProperty("user.dir")+"/Screenshot";

   public void takeascreenshort(WebDriver driver,String screeshotName)
   {
       TakesScreenshot tc=(TakesScreenshot) driver;
       File src=tc.getScreenshotAs(OutputType.FILE);

       File destination= new File(screenshot_dir,screeshotName+".png");

       try {
           FileUtils.copyFile(src,destination);
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
   }
}
