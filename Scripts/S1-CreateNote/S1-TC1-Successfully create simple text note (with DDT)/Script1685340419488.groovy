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

'Load app using custom keyword with status info text'
statusText = CustomKeywords.'common.manageApp.loadApp'(GlobalVariable.appId)

'Verify Mobile App ID is specified'
println(statusText + GlobalVariable.appId)

Mobile.tap(findTestObject('Object Repository/ColorNote-CreateNote/homePage_AddButton'), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote-CreateNote/homePage_ChooseNoteType'), 0)

Mobile.setText(findTestObject('Object Repository/ColorNote-CreateNote/note_EditMode_TextField'), noteText, 0)

'Hide keyboard in mobile to indicate finish typing'
Mobile.hideKeyboard()

Mobile.pressBack()

'Verify if note is successfully saved indicated by note title in read mode | Parameterized noteText'
Mobile.verifyElementExist(findTestObject('ColorNote-CreateNote/note_ReadMode_Title', [('noteText') : noteText]), 0)

Mobile.pressBack()

'Verify saved note is exist in note list | Parameterized noteText'
Mobile.verifyElementExist(findTestObject('ColorNote-CreateNote/homePage_Note_List', [('noteText') : noteText]), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

