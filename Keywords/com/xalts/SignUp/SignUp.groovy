package com.xalts.SignUp

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Alert
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.utils.ExceptionHandling
import com.utils.Screenshot
import internal.GlobalVariable

public class SignUp {	
		private static final KeywordLogger logger = KeywordLogger.getInstance(SignUp.class)
		Screenshot SS = new Screenshot()
		
		@Keyword
		def naviagting_WebPage(v_URL,v_ScreenshotPath) {
			try {
				WebUI.openBrowser(v_URL)
				WebUI.maximizeWindow()				
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in naviagting_WebPage'+e.message)
			}
		}
	
		@Keyword
		def getStarted_Button(v_ScreenshotPath) {
			try {
				WebUI.click(findTestObject('Object Repository/Dashboard/button_GetStarted'))
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in getStarted_Button'+e.message)
			}
		}

		@Keyword
		def image_Xalts(v_ScreenshotPath) {
			try {
				boolean IMG= WebUI.waitForElementPresent(findTestObject('Object Repository/Sign In/img_Xalts'), 5)
				String img= IMG.toString()
				return img
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in image_Xalts'+e.message)
			}
		}
		
		@Keyword
		def signUp_Button(v_ScreenshotPath) {
			try {
				WebUI.click(findTestObject('Object Repository/Sign In/button_SignUp'))
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in signIn_Button'+e.message)
			}
		}
		
		@Keyword
		def signIn_Button(v_ScreenshotPath) {
			try {
				WebUI.click(findTestObject('Object Repository/Dashboard/button_SignIn'))
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in signIn_Button'+e.message)
			}
		}
		
		@Keyword
		def signOut_Button(v_ScreenshotPath) {
			try {
				WebUI.click(findTestObject('Object Repository/Dashboard/button_SignOut'))
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in signOut_Button'+e.message)
			}
		}
		
		@Keyword
		def signIn_Verify(v_ScreenshotPath) {
			try {
				boolean SignOut =WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/button_SignOut'), 5)
				String so= SignOut.toString()
				return so
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in signIn_Verify'+e.message)
			}
		}
		
		@Keyword
		def signOut_Verify(v_ScreenshotPath) {
			try {
				boolean SignIn= WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/button_SignIn'), 5)
				String si= SignIn.toString()
			//	WebUI.closeBrowser()
				return si
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in signOut_Verify'+e.message)
			}
		}
		
		@Keyword
		def docs_Button(v_ScreenshotPath) {
			try {
				WebUI.click(findTestObject('Object Repository/Dashboard/button_DOCS'))
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in docs_Button'+e.message)
			}
		}
		
		@Keyword
		def clickHere_SignIn_Button(v_ScreenshotPath) {
			try {
				WebUI.click(findTestObject('Object Repository/Sign In/button_clickhere_SignIn'))
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in clickHere_SignIn_Button'+e.message)
			}
		}
		
		@Keyword
		def clickHere_SignUp_Button(v_ScreenshotPath) {
			try {
				WebUI.click(findTestObject('Object Repository/Sign In/button_clickhere_SignUp'))
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in clickHere_SignUp_Button'+e.message)
			}
		}
		
		@Keyword
		def input_SignUp(v_Email, v_Password, v_ConfirmPassword, v_ScreenshotPath) {
			try {
				WebUI.sendKeys(findTestObject('Object Repository/Sign In/input_Email'), v_Email)
				WebUI.sendKeys(findTestObject('Object Repository/Sign In/input_Password'), v_Password)
				WebUI.sendKeys(findTestObject('Object Repository/Sign In/input_ConfirmPassword'), v_ConfirmPassword)
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in input_SignIn'+e.message)
			}
		}
		
		@Keyword
		def input_SignIn(v_Email, v_Password, v_ScreenshotPath) {
			try {
				WebUI.sendKeys(findTestObject('Object Repository/Sign In/input_Email'), v_Email)
				WebUI.sendKeys(findTestObject('Object Repository/Sign In/input_Password'), v_Password)
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in input_SignIn'+e.message)
			}
		}
		
		@Keyword
		def header_GettingStarted(v_ScreenshotPath) {
			try {
				WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/header_GetStarted'), 5)
				String GettingStarted= WebUI.getText(findTestObject('Object Repository/Dashboard/header_GetStarted'))
				return GettingStarted
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in header_GettingStarted'+e.message)
			}
		}
		
		@Keyword
		def header_OpenCapitalNetwork(v_ScreenshotPath) {
			try {
				WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/heading_OpenCapitalNetwork'), 5)
				String OCP= WebUI.getText(findTestObject('Object Repository/Dashboard/heading_OpenCapitalNetwork'))
				return OCP
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in header_OpenCapitalNetwork'+e.message)
			}
		}
		
		@Keyword
		def error_ConfirmPassword(v_ScreenshotPath) {
			try {
				WebUI.waitForElementPresent(findTestObject('Object Repository/Sign In/error_ConfirmPassword'), 5)
				String NoMatch = WebUI.getText(findTestObject('Object Repository/Sign In/error_ConfirmPassword'))
				return NoMatch
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in error_ConfirmPassword'+e.message)
			}
		}
		
		@Keyword
		def error_Password(v_ScreenshotPath) {
			try {
				WebUI.waitForElementPresent(findTestObject('Object Repository/Sign In/error_Password'), 5)
				String Password = WebUI.getText(findTestObject('Object Repository/Sign In/error_Password'))
				return Password
			}catch(Exception e) {
				ExceptionHandling EH = new ExceptionHandling()
				EH.Exception_Handling(v_ScreenshotPath, e)
				logger.logFailed('Error in error_Password'+e.message)
			}
		}
		
		@Keyword
		def error_Alert(v_ScreenshotPath) {
			try {
		         // Switch to the alert
				WebUI.waitForAlert(5)
			//	SS.captureScreenShot(v_ScreenshotPath)
				
				WebDriver driver = DriverFactory.getWebDriver()
				Alert alert = driver.switchTo().alert()
				String text =alert.getText()
				return text		
			}catch(Exception e) {
			//	ExceptionHandling EH = new ExceptionHandling()
			//	EH.Exception_Handling(v_ScreenshotPath, e.Message)
			//	logger.logFailed('Error in error_Alert'+e.message)
			}
		}
}