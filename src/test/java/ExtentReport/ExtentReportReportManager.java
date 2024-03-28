package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class ExtentReportReportManager {
    private static String Report_Dir = System.getProperty("user.dir") + "/Reports/ExtentReportReportManager.html";
    private static ExtentReports extentReports;
    private static ExtentSparkReporter extentSparkReporter;

    public static ExtentReports extentSetup() {
        extentReports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(new File(Report_Dir));
        extentReports.attachReporter(extentSparkReporter);

        extentSparkReporter.config().setDocumentTitle("Extent Report");
//        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setReportName("Sauce Demp Report");
        extentReports.setSystemInfo("OS", System.getProperty("os.name"));
        extentReports.setSystemInfo("Execution Machine", System.getProperty("user.name"));

        return extentReports;

    }

}
