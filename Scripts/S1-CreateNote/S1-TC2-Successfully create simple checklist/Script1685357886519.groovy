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

Mobile.tap(findTestObject('Object Repository/ColorNote-CreateChecklist/homePage_AddButton'), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote-CreateChecklist/homePage_ChooseNoteType'), 0)

Mobile.setText(findTestObject('Object Repository/ColorNote-CreateChecklist/note_EditMode_ChecklistTitle'), checklistTitle, 
    0)

'Create checklist content in a loop'
CustomKeywords.'checklist.ManageChecklists.createMultiChecklistContents'(checklistContents)

Mobile.pressBack()

'Verify if note is successfully saved indicated by note title in read mode | Parameterized checklistTitle'
Mobile.verifyElementExist(findTestObject('ColorNote-CreateChecklist/note_ReadMode_ChecklistTitle', [('checklistTitle') : checklistTitle]), 
    0)

'Verify if note content is successfully saved indicated by note content in read mode | Parameterized checklistContents'
CustomKeywords.'checklist.ManageChecklists.verifyMultiChecklistContents'(checklistContents)

Mobile.pressBack()

'Verify if note is successfully saved indicated by note title in home page | Parameterized checklistTitle'
Mobile.verifyElementExist(findTestObject('ColorNote-CreateChecklist/homePage_NoteList', [('checklistTitle') : checklistTitle]), 
    0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

