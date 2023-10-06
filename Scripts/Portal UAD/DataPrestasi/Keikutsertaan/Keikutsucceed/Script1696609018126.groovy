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

WebUI.navigateToUrl('https://portal.uad.ac.id/')

WebUI.setText(findTestObject('Object Repository/Page_Selamat Datang di Portal Akademik Univ_c64131/input_Username_login'), 
    '1800018300')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Selamat Datang di Portal Akademik Univ_c64131/input_Password_password'), 
    '+6rFExLOzA3XjDxirDKaeQ==')

WebUI.click(findTestObject('Object Repository/Page_Selamat Datang di Portal Akademik Univ_c64131/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Selamat Datang di Portal Akademik Univ_c64131/a_Kemahasiswaan'))

WebUI.click(findTestObject('Object Repository/Page_Selamat Datang di Portal Akademik Univ_c64131/a_Kemahasiswaan'))

WebUI.click(findTestObject('Object Repository/Page_Selamat Datang di Portal Akademik Univ_c64131/a_Prestasi Mahasiswa'))

WebUI.click(findTestObject('Object Repository/Page_Prestasi Mahasiswa  Portal Akademik/a_Tambah'))

WebUI.setText(findTestObject('Object Repository/Page_Prestasi Mahasiswa  Portal Akademik/input_concat(id(, , s2id_autogen1_search, ,_801a2d'), 
    'Lomba Karya Tulis')

