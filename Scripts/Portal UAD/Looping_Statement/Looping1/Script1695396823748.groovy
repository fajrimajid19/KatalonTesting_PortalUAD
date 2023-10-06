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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://portal.uad.ac.id/login')

for (int i=1; i<3; i++) {
	WebUI.setText(findTestObject('Object Repository/Portal UAD/Page_Login Portal  Portal Akademik/input_Username_login'), '1800018300')
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Portal UAD/Page_Login Portal  Portal Akademik/input_Password_password'), '+6rFExLOzA3XjDxirDKaeQ==')
	
	WebUI.click(findTestObject('Object Repository/Portal UAD/Page_Login Portal  Portal Akademik/button_Login'))
	
	WebUI.click(findTestObject('Object Repository/Portal UAD/Page_Selamat Datang di Portal Akademik Univ_c64131/img_view all_img-circle'))
	
	WebUI.click(findTestObject('Object Repository/Portal UAD/Page_Selamat Datang di Portal Akademik Univ_c64131/a_Log Out'))
	
	WebUI.click(findTestObject('Object Repository/Portal UAD/Page_Selamat Datang di Portal Akademik Univ_c64131/button_OK'))
}

WebUI.closeBrowser()

