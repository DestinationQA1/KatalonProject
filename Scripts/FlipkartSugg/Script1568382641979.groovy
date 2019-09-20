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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.util.concurrent.TimeUnit as TimeUnit

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.click(findTestObject('Object Repository/Page_FlipkartHomePage/CloseLoginPopup'))

WebUI.setText(findTestObject('Object Repository/Page_FlipkartHomePage/SearchProductText'), 'iphone')

println(WebUI.takeScreenshot())


List<WebElement> Autosugg = WebUI.findWebElements(findTestObject
	('Object Repository/Page_FlipkartHomePage/AutoSuggestions'), 3)

println(Autosugg.size())

Autosugg.each({ def it ->
        println('Sugg: ' + it.getText())
    })

//for (def index : (0..Autosugg.size()-1)) {
//	println(index + "="+ Autosugg.get(index).getText())
//}
//WebUI.rightClick(findTestObject('Page_FlipkartHomePage/AutoSuggestions'))
WebUI.closeBrowser()

