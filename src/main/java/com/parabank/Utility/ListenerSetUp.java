package com.parabank.Utility;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.parabank.Testbase.TestBase;

public class ListenerSetUp extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	logger.info("Test is Started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	logger.info("Test is completed"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test is failed"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test is skipped"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}



	}


