package com.crm.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started : " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success : " + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failure : " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped : " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext result) {
		System.out.println("Test Completed : " + result.getName());
	}

}
