package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Listners //implements ITestListener
{
//	private static ExtentReports extent = ExtentManager.createInstance("extent.html");
//	public static ThreadLocal parentTest = new ThreadLocal();
//    private static ThreadLocal test = new ThreadLocal();
//	
//	public void onTestStart(ITestResult result) 
//	{
//		ExtentTest child = parentTest.get().createNode(result.getMethod().getMethodName());
//        test.set(child);
//	}
//
//	public void onTestSuccess(ITestResult result) 
//	{
//		test.get().pass("Test passed");
//	}
//
//
//	public void onTestFailure(ITestResult result) 
//	{
//		test.get().fail(result.getThrowable());
//	}
//
//	public void onTestSkipped(ITestResult result) 
//	{
//		test.get().skip(result.getThrowable());
//	}
//
//
//	public void onTestFailedWithTimeout(ITestResult result) 
//	{
//	    onTestFailure(result);
//	}
//
//	public void onStart(ITestContext context) 
//	{
//		ExtentTest parent = extent.createTest(getClass().getName());
//        parentTest.set(parent);
//	}
//
//	public void onFinish(ITestContext context) 
//	{
//		extent.flush();
//	}
//	

}
