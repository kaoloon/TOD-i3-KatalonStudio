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
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import java.lang.String as String

//SETUP
WebUI.openBrowser('http://192.168.1.104/sekolah/siswa.html')
TestData data = findTestData('datasiswa')
String baseUrl = 'http://192.168.1.104/sekolah/siswa.html'
def driver = DriverFactory.getWebDriver()
selenium = new WebDriverBackedSelenium(driver, baseUrl)
WebUI.takeScreenshot('screenshoot\\StartInsert.jpg')
//BOT
for (def index : (0..data.getRowNumbers() - 1)) {
    selenium.click('link=Tambah')
    selenium.click('name=nama')
    selenium.type('name=nama', data.internallyGetValue("nama", index))
    selenium.click('name=jenis_kelamin')
    selenium.type('name=jenis_kelamin', data.internallyGetValue("jenis_kelamin", index))
    selenium.click('name=telepon')
    selenium.type('name=telepon', data.internallyGetValue("telepon", index))
    selenium.click('name=alamat')
    selenium.type('name=alamat', data.internallyGetValue("alamat", index))
    selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Alamat\'])[1]/following::button[1]')
}
WebUI.takeScreenshot('screenshoot\\FinishInsert.jpg')