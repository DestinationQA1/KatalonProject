import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.chrome.ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory

//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe")
System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath())

ChromeDriver driver = new ChromeDriver()
driver.get('https://google.com')

// this won't work and exception would be thrown

WebUI.setText(findTestObject('Object Repository/Page_Google/input_Show me_q'), 'selenium')

DriverFactory.changeWebDriver(driver)

// now, it is working as expected

WebUI.setText(findTestObject('Object Repository/Page_Google/input_Show me_q'), 'selenium')