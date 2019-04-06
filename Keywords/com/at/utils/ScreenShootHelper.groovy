package com.at.utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ScreenShootHelper {

	public void takeWebElementScreenshot(TestObject object) {
		WebElement element = WebUiCommonHelper.findWebElement(object, 20)
		WebDriver driver = DriverFactory.getWebDriver();
		String fileName = new SimpleDateFormat("yyyyMMddHHmmSSS").format(new Date())
		Screenshot screenshot = new AShot().takeScreenshot(driver, element)
		try {
			if (DriverFactory.getExecutedBrowser().getName()=='HEADLESS_DRIVER'){
				ImageIO.write(screenshot.getImage(),'PNG', new File("C:/Users/path_to_working_directory/ErrorScreenshots/HeadlessElementScreenshot"+"_"+fileName+".png"))
			} else {
				ImageIO.write(screenshot.getImage(),'PNG', new File(System.getProperty("user.dir")+"/ErrorScreenshots/ElementScreenshot"+"_"+fileName+".png"))
			}
	
		} catch (Exception e) {
			e.printStackTrace()
		}

}
