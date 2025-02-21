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
WebUI.navigateToUrl('https://www.tokopedia.com/4gungs/atasan-wanita-classic-modern-trendi-1730888029653796641')

WebUI.verifyElementText(findTestObject('Object Repository/Main/mainTitle'), 'Atasan wanita classic modern trendi')

// Daftar variant dan teks yang sesuai


String[][] variants = [
	['variantChips3', 'colourHitam', 'Hitam'],
	['variantChips6', 'colourPutih', 'Putih'],
	['variantChips1', 'colourBiru', 'Biru'],
	['variantChips2', 'colourBiruMuda', 'Biru Muda'],
	['variantChips7', 'colourMerah', 'Merah'],
	['variantChips5', 'colourMerahMuda', 'Merah Muda'],
	['variantChips8', 'colourOrange', 'Orange'],
	['variantChips9', 'colourUngu', 'Ungu'],
	['variantChips4', 'colourKuning', 'Kuning']
]

// Loop untuk memilih dan memverifikasi semua varian
for (String[] variant : variants) {
	WebUI.click(findTestObject('Main/' + variant[0]))
	WebUI.verifyElementText(findTestObject('Object Repository/Main/' + variant[1]), variant[2])
}

WebUI.closeBrowser()


