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

// Daftar warna dan elemen yang sesuai
String[][] variants = [
	['variantChips3', 'p_Terpilih Hitam', 'Hitam'],
	['variantChips6', 'p_Terpilih Putih', 'Putih'],
	['variantChips1', 'p_Terpilih Biru', 'Biru'],
	['variantChips2', 'p_Terpilih Biru Muda', 'Biru Muda'],
	['variantChips7', 'p_Terpilih Merah', 'Merah'],
	['variantChips5', 'p_Terpilih Merah Muda', 'Merah Muda'],
	['variantChips8', 'p_Terpilih Orange', 'Orange'],
	['variantChips9', 'p_Terpilih Ungu', 'Ungu'],
	['variantChips4', 'p_Terpilih Kuning', 'Kuning']
]

// Loop untuk memilih warna dan verifikasi teksnya
for (String[] variant : variants) {
	 WebUI.click(findTestObject('Object Repository/Main/' + variant[0]))
	 
	 WebUI.waitForElementVisible(findTestObject('Object Repository/Main/' + variant[1]), 5)
	 

    // Ambil teks dari elemen dan hilangkan newline
    String actualText = WebUI.getText(findTestObject('Object Repository/Main/' + variant[1])).replace("\n", "").trim()
	
	
    // Verifikasi teks yang sudah dibersihkan
    WebUI.verifyMatch(actualText, 'Terpilih:' + variant[2], false)
}

WebUI.closeBrowser()

