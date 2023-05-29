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

'Open a note from home page | Parameterized checklistTitle'
Mobile.tap(findTestObject('ColorNote-EditChecklist/homePage_NoteList', [('checklistTitle') : checklistTitle]), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote-EditChecklist/note_ReadMode_EditButton'), 0)

'Open a checklist content to edit | Parameterized checklistContent'
Mobile.tap(findTestObject('ColorNote-EditChecklist/note_EditMode_ChecklistContent', [('checklistContent') : checklistContent]), 
    0)

Mobile.setText(findTestObject('Object Repository/ColorNote-EditChecklist/note_EditMode_ChecklistContent_SetText'), newChecklistContent, 
    0)

'Click OK button to save'
Mobile.tap(findTestObject('Object Repository/ColorNote-EditChecklist/note_EditMode_ChecklistContent_SetText_OK'), 0)

Mobile.pressBack()

'Verify whether checklist content is updated | Parameterized newChecklistContent'
Mobile.verifyElementExist(findTestObject('ColorNote-EditChecklist/note_ReadMode_TapChecklist', [('newChecklistContent') : newChecklistContent]), 
    0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

