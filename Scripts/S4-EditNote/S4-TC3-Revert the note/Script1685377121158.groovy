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

'Open a note from home page | Parameterized noteText'
Mobile.tap(findTestObject('ColorNote-EditNoteRevert/homePage_NoteList', [('noteText') : noteText]), 0)

'Verify note is correctly selected | Parameterized noteText'
Mobile.tap(findTestObject('ColorNote-EditNoteRevert/note_ReadMode_Title', [('noteText') : noteText]), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote-EditNoteRevert/note_ReadMode_EditButton'), 0)

Mobile.setText(findTestObject('Object Repository/ColorNote-EditNoteRevert/note_EditMode_SetText'), newNoteText, 0)

'Click revert button to undo text'
Mobile.tap(findTestObject('Object Repository/ColorNote-EditNoteRevert/note_EditMode_RevertButton'), 0)

Mobile.hideKeyboard()

Mobile.pressBack()

'Verify reverted note is saved | Parameterized noteText'
Mobile.verifyElementExist(findTestObject('ColorNote-EditNoteRevert/note_ReadMode_Title', [('noteText') : noteText]), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

