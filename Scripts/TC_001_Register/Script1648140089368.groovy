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

WebUI.click(findTestObject('Register_Login/btnDaftar'))

WebUI.waitForElementPresent(findTestObject('Register_Login/inputFullName'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register_Login/inputFullName'), Name)

WebUI.setText(findTestObject('Register_Login/inputPhone'), Phone)

WebUI.setText(findTestObject('Register_Login/inputEmail'), Email)

WebUI.setText(findTestObject('Register_Login/inputPassword'), Password)

WebUI.click(findTestObject('Register_Login/btnDaftarSekarang'))

if (WebUI.waitForElementVisible(findTestObject('Register_Login/txtBlankName'), 5)) {
    WebUI.back()
    WebUI.comment('Blank Full Name')
	
} else if (WebUI.waitForElementVisible(findTestObject('Register_Login/txtBlankPhone'), 5)) {
    WebUI.back()
    WebUI.comment('Blank Phone')
	
} else if (WebUI.waitForElementVisible(findTestObject('Register_Login/txtBlankEmail'), 5)) {
    WebUI.back()
    WebUI.comment('Blank Email')
	
} else if (WebUI.waitForElementVisible(findTestObject('Register_Login/txtBlankPassword'), 5)) {
    WebUI.back()
    WebUI.comment('Blank Email')
	
} else {
	WebUI.waitForElementVisible(findTestObject('Register_Login/txtPilihMetodeAktivasi'), 5)
	WebUI.back()
    WebUI.comment('OTP')
}