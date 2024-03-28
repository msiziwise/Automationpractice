package Pages;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LandingPage
{

    @FindBy(xpath = "//input[@id='search_query_top']")
    WebElement xpath_search;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Search')]")
    WebElement xpath_btn_search;

    @FindBy(xpath = "(//a[@class='product-name'][contains(.,'Faded Short Sleeve T-shirts')])[2]")
    WebElement xpath_verify_search;

    @FindBy(xpath = "(//a[@href='http://www.automationpractice.pl/index.php?id_product=7&controller=product&search_query=Chiffon&results=2'])[4]")
    WebElement xpath_verify_search3;

    @FindBy(xpath = "(//a[@href='http://www.automationpractice.pl/index.php?id_product=5&controller=product&search_query=Printed+Summer+Dress&results=3'])[4]")
    WebElement xpath_verify_search2;

    @FindBy(xpath = "//a[@class='login'][contains(.,'Sign in')]")
    WebElement xpath_sign_in;




    public WebDriver driver=null;


    public  LandingPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void  search(String search_phrase)
    {
        xpath_search.sendKeys(search_phrase);
    }
    public  void  btn_search()
    {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(xpath_search));
        xpath_btn_search.click();

        xpath_search.clear();
    }
    public  void verifysearch()
    {
        Assert.assertEquals(xpath_verify_search.getText(), "Faded Short Sleeve T-shirt");
        Assert.assertEquals(xpath_verify_search2.getText(),"Printed Summer Dres");
        Assert.assertEquals(xpath_verify_search3.getText(),"Printed Chiffon Dres");
    }
}
