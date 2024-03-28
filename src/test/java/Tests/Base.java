package Tests;

import Pages.LandingPage;
import Utils.Browsers;
import Utils.ReadExcell;
import Utils.TakeScreenShot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Base
{

    Browsers browsers= new Browsers();

    final  WebDriver driver= browsers.browserchoice("CHROME","http://automationpractice.pl/");

    LandingPage landingPage= PageFactory.initElements(driver,LandingPage.class);

    ReadExcell readExcell= PageFactory.initElements(driver, ReadExcell.class);

    List<String> values = readExcell.searchValues();

    TakeScreenShot takeScreenShot=PageFactory.initElements(driver, TakeScreenShot.class);


}
