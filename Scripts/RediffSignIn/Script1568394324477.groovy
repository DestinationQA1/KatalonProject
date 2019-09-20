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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://businessemail.rediff.com/')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_RediffMail/span_Login'))

WebUI.setText(findTestObject('Page_RediffMail/input_Email Address_handle'), 
    'abc@rediff.com')

WebUI.setEncryptedText(findTestObject('Page_RediffMail/input_Password_clpass'), 
    'uVIKd+tVB2g=')

WebUI.click(findTestObject('Page_RediffMail/button_Sign in'))
WebUI.verifyElementText(findTestObject('Page_RediffMail/ErrMsg_Username or Password is incorrect'), 'Username or Password is incorrect.')

println(WebUI.getText(findTestObject('Page_RediffMail/ErrMsg_Username or Password is incorrect')))

WebUI.closeBrowser()

