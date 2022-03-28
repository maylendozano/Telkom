import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
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

WebUI.openBrowser(GlobalVariable.Url)

WebUI.waitForElementPresent(findTestObject('Register_Login/btnMasukDaftarHomePage'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Register_Login/btnMasukDaftarHomePage'))

WebUI.click(findTestObject('Register_Login/btnLogin'))

WebUI.setText(findTestObject('Register_Login/inputLoginID'), Email)

if (Condition == 'Invalid Email') {
	WebUI.back()
	WebUI.comment('Invalid Email')
	
} else if (Condition == 'Click Coba Lagi') {
	WebUI.click(findTestObject('Register_Login/btnMasuk'))
	WebUI.click(findTestObject('Register_Login/btnCobaLagi'))	
	WebUI.back()
	WebUI.comment("Click Coba Lagi")
	
} else if (Condition == 'Click Daftar') {
	WebUI.click(findTestObject('Register_Login/btnMasuk'))
	WebUI.click(findTestObject('Register_Login/btnDaftarLagi'))
	WebUI.back()
	WebUI.comment("Click Daftar")
	
} else {
	WebUI.click(findTestObject('Register_Login/btnMasuk'))
	WebUI.setText(findTestObject('Register_Login/inputPassword'), Password)
	WebUI.click(findTestObject('Register_Login/btnLanjut'))
	WebUI.comment("Wrong Password")
}


	
	
	