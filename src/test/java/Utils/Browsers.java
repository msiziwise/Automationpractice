package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers
{
    public  static WebDriver driver=null;

    public  WebDriver browserchoice(String browsec,String url )
    {
        if("chrome".equalsIgnoreCase(browsec))
        {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions= new ChromeOptions();
            chromeOptions.addArguments("--Allow remote access.*");
            driver= new ChromeDriver(chromeOptions);
        }
        else if("firefox".equalsIgnoreCase(browsec))
        {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else
        {
            WebDriverManager.edgedriver().setup();
            EdgeOptions edgeOptions= new EdgeOptions();
            edgeOptions.addArguments("--Allow remote access.*");
            driver= new EdgeDriver(edgeOptions);
        }
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }
}
