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

// Implementation #01
//for (def rowCounter = 1; rowCounter<4; rowCounter++) {
//	
//	WebUI.openBrowser('')
//	
//	WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
//	
//	WebUI.setText(findTestObject('Object Repository/DD_HRM/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), findTestData("Data Files/Data Driven/User Automation Test Data").getValue(1, 1))
//	
//	WebUI.setText(findTestObject('Object Repository/DD_HRM/Page_OrangeHRM/input_Username_txtPassword'), findTestData("Data Files/Data Driven/User Automation test Data").getValue(2, 1))
//	
//	WebUI.click(findTestObject('Object Repository/DD_HRM/Page_OrangeHRM/input_Password_Submit'))
//	
//	WebUI.closeBrowser()
//
//}


// Implementation #02
WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

for (def rowCounter = 1; rowCounter<=findTestData("Data Files/Data Driven/User Automation Test Data").getRowNumbers(); rowCounter++) {
	
	WebUI.setText(findTestObject('Object Repository/DD_HRM/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), findTestData("Data Files/Data Driven/User Automation Test Data").getValue(1, rowCounter))
	Thread.sleep(2000)
	WebUI.setText(findTestObject('Object Repository/DD_HRM/Page_OrangeHRM/input_Username_txtPassword'), findTestData("Data Files/Data Driven/User Automation test Data").getValue(2, rowCounter))
	Thread.sleep(2000)
}

WebUI.click(findTestObject('Object Repository/DD_HRM/Page_OrangeHRM/input_Password_Submit'))

WebUI.closeBrowser()