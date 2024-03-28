package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sign_In_Page
{


    @FindBy(xpath = "//a[@class='login'][contains(.,'Sign in')]")
    WebElement xpath_username;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement xpath_password;

    @FindBy(xpath = "//span[contains(.,'Sign in')]")
    WebElement xpath_btn_signin;

    public  void Sign_in()
    {

    }
    public  void  Username()
    {

    }
    public  void  Password()
    {

    }
}
