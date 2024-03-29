import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities

System.setProperty("webdriver.chrome.driver", "C:\\Users\\BaPpY\\chromedriver_win32\\chromedriver.exe")

//System.setProperty("webdriver.chrome.driver", "G:/Katalon Studio/Katalon_Studio_Windows_64-6.3.3/configuration\resources/drivers/chromedriver_win32/chromedriver.exe")

ChromeOptions chromeOptions = new ChromeOptions()

chromeOptions.addExtensions(new File("C:/Users/BaPpY/laookkfknpbbblfpciffpaejjkokdgca/1.12.6_0.crx"))

DesiredCapabilities desiredCapabilities = new DesiredCapabilities()

desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions)

WebDriver webDriver = new ChromeDriver(desiredCapabilities)

//WebUI.openBrowser("")

DriverFactory.changeWebDriver(webDriver)

WebUI.navigateToUrl("https://www.google.com")

//WebUI.closeWindowUrl("https://www.google.com")

//webDriver.close()

WebUI.closeBrowser()