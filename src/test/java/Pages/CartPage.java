package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage
{
    @FindBy(xpath = "//i[contains(@class,'icon-plus')]")
    WebElement  xpath_;

    @FindBy(xpath = "(//td[contains(@class,'total')])[2])")
    WebElement  xpath_7;

    @FindBy()
    WebElement  xpath_8;
}
