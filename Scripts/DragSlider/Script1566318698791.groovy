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
import jdk.nashorn.internal.runtime.GlobalConstants

import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://jqueryui.com/slider/')
//WebUI.switchToFrame(findTestObject('Page_Slider  jQuery UI/demo-frame'), 3)
WebUI.maximizeWindow()
WebUI.waitForElementPresent(findTestObject('Page_Slider  jQuery UI/SliderBar'), 2)
maxWidth = WebUI.getElementWidth(findTestObject('Page_Slider  jQuery UI/SliderBar'))

WebUI.dragAndDropByOffset(findTestObject('Page_Slider  jQuery UI/Slider'), maxWidth, 0)
WebUI.dragAndDropByOffset(findTestObject('Page_Slider  jQuery UI/Slider'), -maxWidth, 0)
WebUI.closeBrowser()

