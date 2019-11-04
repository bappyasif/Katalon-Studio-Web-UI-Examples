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

WebUI.navigateToUrl(URL_Address)

WebUI.setText(findTestObject('Object Repository/Data Sources/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), u_Name)

WebUI.setEncryptedText(findTestObject('Object Repository/Data Sources/Page_OrangeHRM/input_Username_txtPassword'), u_Password)

WebUI.click(findTestObject('Object Repository/Data Sources/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Data Sources/Page_OrangeHRM/a_Welcome Admin'))

WebUI.waitForElementPresent(findTestObject('Data Sources/Page_OrangeHRM/a_Logout'), 2)

WebUI.click(findTestObject('Object Repository/Data Sources/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()
