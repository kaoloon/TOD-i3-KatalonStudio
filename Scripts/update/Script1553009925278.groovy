import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('http://localhost/sekolah/siswa.html')
def driver = DriverFactory.getWebDriver()
String baseUrl = "http://localhost/sekolah/siswa.html"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("http://localhost/sekolah/siswa.html")
selenium.click("link=Edit")
selenium.click("name=nama")
selenium.type("name=nama", "Fikri")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Jl.G'])[1]/following::button[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Jl.F'])[1]/following::a[1]")
selenium.click("name=nama")
selenium.type("name=nama", "Andre")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Jl.F'])[1]/following::button[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Jl.E'])[1]/following::a[1]")
selenium.click("name=nama")
selenium.type("name=nama", "Andre")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Jl.E'])[1]/following::button[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Jl.D'])[1]/following::a[1]")
selenium.click("name=nama")
selenium.type("name=nama", "Fadhullah")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Jl.D'])[1]/following::button[1]")
WebUI.takeScreenshot('C:\\Program Files\\Katalon\\screenshoot\\FinishUpdate.jpg')
