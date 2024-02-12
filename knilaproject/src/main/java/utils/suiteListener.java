package utils;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

import base.basetest;

public class suiteListener implements ITestListener,  IAnnotationTransformer{
	public void onTestFailure (ITestResult result) {
		String filename = System.getProperty("user.dir")+ File.separator+"screenshot"+File.separator+result.getMethod().getMethodName();
		File f = ((TakesScreenshot)basetest.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File(filename+ ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void transfrom(ITestAnnotation annotation , Class testclass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
		
	}

	}
