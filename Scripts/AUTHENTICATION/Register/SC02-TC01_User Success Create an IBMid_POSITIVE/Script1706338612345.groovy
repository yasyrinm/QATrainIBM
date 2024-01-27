import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

WebUI.openBrowser('https://www.ibm.com/account/us-en/')

WebUI.maximizeWindow()

//User success create an IBMid

WebUI.doubleClick(findTestObject('Object Repository/AUTHENTICATION/LOGIN_Register/Click Cookies 2'))

WebUI.click(findTestObject('Object Repository/AUTHENTICATION/LOGIN_Register/Click Login Button'))

WebUI.click(findTestObject('Object Repository/AUTHENTICATION/LOGIN_Register/Click Create an IBMid'))
	
WebUI.setText(findTestObject('Object Repository/AUTHENTICATION/LOGIN_Register/Input Email_regis'), 'prawirasemesta@gmail.com')	
	
WebUI.setText(findTestObject('Object Repository/AUTHENTICATION/LOGIN_Register/Input Nama Depan'), 'Asep')

WebUI.setText(findTestObject('Object Repository/AUTHENTICATION/LOGIN_Register/Input Nama Belakang'), 'Darojat')

WebUI.setText(findTestObject('Object Repository/AUTHENTICATION/LOGIN_Register/Input Password_Regis'), 'Akujagobanget123@')

WebUI.click(findTestObject('Object Repository/AUTHENTICATION/LOGIN_Register/Click Dropdown Negara atau wilayah tempat tinggal'))

WebUI.click(findTestObject('Object Repository/AUTHENTICATION/LOGIN_Register/Click Dropdown Negara bagian atau Provinsi'))

WebUI.click(findTestObject('Object Repository/AUTHENTICATION/LOGIN_Register/Click Berikutnya_regis'))

//Verify Account Created

def Result = WebUI.getText(findTestObject('Object Repository/AUTHENTICATION/LOGIN_Register/Verify Account Created')).toString()

assert Result.equals('Verification token')


