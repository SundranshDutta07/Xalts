import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

try {
     WebUI.comment('Navigating to the webpage')
     CustomKeywords.'com.xalts.SignUp.SignUp.naviagting_WebPage'(v_URL,v_ScreenshotPath)
	 String header_OCN= CustomKeywords.'com.xalts.SignUp.SignUp.header_OpenCapitalNetwork'(v_ScreenshotPath)
	 assert WebUI.verifyMatch(header_OCN, v_OCN, false)
	 CustomKeywords.'com.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 WebUI.comment('Click on SignIn')
	 CustomKeywords.'com.xalts.SignUp.SignUp.signIn_Button'(v_ScreenshotPath)
	 String img= CustomKeywords.'com.xalts.SignUp.SignUp.image_Xalts'(v_ScreenshotPath)
	 assert WebUI.verifyMatch(img, 'true', false)
	 CustomKeywords.'com.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 WebUI.comment('Enter Details- SignUp')
	 CustomKeywords.'com.xalts.SignUp.SignUp.input_SignUp'(v_Email, v_Password,v_ConfirmPassword,v_ScreenshotPath)
	 CustomKeywords.'com.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	 
	 WebUI.comment('Click submit- SignUp')
	 CustomKeywords.'com.xalts.SignUp.SignUp.signUp_Button'(v_ScreenshotPath)
	 String SignIn_Verify = CustomKeywords.'com.xalts.SignUp.SignUp.signIn_Verify'(v_ScreenshotPath)
	 assert WebUI.verifyMatch(SignIn_Verify, 'true', false)
	 CustomKeywords.'com.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
}

finally {
	WebUI.comment('Logout')
	CustomKeywords.'com.xalts.SignUp.SignUp.signOut_Button'(v_ScreenshotPath)
	String SignOut_Verify = CustomKeywords.'com.xalts.SignUp.SignUp.signOut_Verify'(v_ScreenshotPath) 
	assert WebUI.verifyMatch(SignOut_Verify, 'true', false)
	CustomKeywords.'com.utils.Screenshot.captureScreenShot'(v_ScreenshotPath)
	
	WebUI.closeBrowser()
}