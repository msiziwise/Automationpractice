package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


@Test
public class runTest extends Base {


    public String searchCriteria = "Fade,Printed Summer Dress,Chiffon";
    ExtentReports extent;

    ExtentTest logger;
    String[] criteria = searchCriteria.split(",");

    @Severity(SeverityLevel.BLOCKER)
    @Description("")
    @Test
    public void search() {
        int count = 0;
        for (String value : values) {
            landingPage.search(value);
            takeScreenShot.takeascreenshort(driver, "search" + count++);
            landingPage.btn_search();

            landingPage.verifysearch();
        }

        //
    }

//    public void search2() {
//        int count = 0;
//        for (int i = 0; i < criteria.length; i++) {
//            landingPage.search(criteria[i]);
//            takeScreenShot.takeascreenshort(driver, "search" + count++);
//            landingPage.btn_search();
//
//            landingPage.verifysearch();
//        }

        //
    //}




}
