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

WebUI.navigateToUrl('https://www.tokopedia.com/')

WebUI.click(findTestObject('Flight Component/buttonFlight'))

WebUI.verifyElementText(findTestObject('Flight Component/titleAsal'), 'Asal')

WebUI.delay(3)

WebUI.verifyElementAttributeValue(findTestObject('Flight Component/fieldAsal'), 'placeholder', 'Jakarta (CGK)', 0)

WebUI.verifyElementText(findTestObject('Object Repository/Flight Component/titleTujuan'), 'Tujuan')

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Flight Component/fieldTujuan'), 'placeholder', 'Denpasar (DPS)', 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Flight Component/titleBerangkat'), 'Berangkat')

WebUI.verifyElementText(findTestObject('Object Repository/Flight Component/titlePulang'), 'Pulang')

WebUI.verifyElementText(findTestObject('Object Repository/Flight Component/titleJumlahPenumpang'), 'Jumlah Penumpang')

WebUI.verifyElementPresent(findTestObject('Object Repository/Flight Component/fieldBerangkat'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Flight Component/fieldPenumpang'), 0)

