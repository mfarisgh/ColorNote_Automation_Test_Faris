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
Mobile.tap(findTestObject('ColorNote-TextReminder/homePage_NoteList', [('noteText') : noteText]), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote-TextReminder/note_ReadMode_ThreeDot'), 0)

'Open reminder settings from three-dot menu'
Mobile.tap(findTestObject('Object Repository/ColorNote-TextReminder/note_ReadMode_ThreeDot_Reminder'), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote-TextReminder/reminder_Type_OpenDropdown'), 0)

'Select reminder type'
Mobile.tap(findTestObject('Object Repository/ColorNote-TextReminder/reminder_Type_DropdownValue'), 0)

Mobile.tap(findTestObject('ColorNote-TextReminder/reminder_When_OpenSelection'), 0)

'Select day to remind'
Mobile.tap(findTestObject('ColorNote-TextReminder/reminder_When_DayValue'), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote-TextReminder/reminder_Repetition_OpenDropdown'), 0)

'Select repetition style'
Mobile.tap(findTestObject('Object Repository/ColorNote-TextReminder/reminder_Repetition_DropdownValue'), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote-TextReminder/reminder_DoneButton'), 0)

'Verify reminder indicator exist in note'
Mobile.verifyElementExist(findTestObject('Object Repository/ColorNote-TextReminder/note_ReadMode_Reminder'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

