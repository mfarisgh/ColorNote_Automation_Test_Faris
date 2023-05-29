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
Mobile.tap(findTestObject('ColorNote-AchieveNote/homePage_NoteList', [('noteText') : noteText]), 0)

'Verify note is correctly selected | Parameterized noteText'
Mobile.verifyElementExist(findTestObject('ColorNote-AchieveNote/note_ReadMode_Title', [('noteText') : noteText]), 0)

'Tap Three dot menu button'
Mobile.tap(findTestObject('Object Repository/ColorNote-AchieveNote/note_ReadMode_ThreeDotMenu'), 0)

'Tap Check button in the Three dot menu'
Mobile.tap(findTestObject('Object Repository/ColorNote-AchieveNote/note_ReadMode_ThreeDotMenu_Check'), 0)

'Verify whether Finish Reminder prompt exist in note to proceed Finish Reminder'
elementExistStatus = Mobile.verifyElementExist(findTestObject('Object Repository/ColorNote-AchieveNote/reminder_Prompt_FinishReminder'), 
    5, FailureHandling.OPTIONAL)

println('Element Finish Reminder exist status : ' + elementExistStatus)

'Proceed Finish Reminder if Finish Reminder prompt exists'
statusText2 = CustomKeywords.'achieveNote.ManageAchieveNote.verifyStepFinishReminder'(elementExistStatus)

println('Verify Step Finish Reminder status : ' + statusText2)

'Tap Three dot menu button'
Mobile.tap(findTestObject('Object Repository/ColorNote-AchieveNote/note_ReadMode_ThreeDotMenu'), 0)

'Ensure note is already achieved by verifying option in Three dot menu is called Uncheck'
Mobile.verifyElementExist(findTestObject('Object Repository/ColorNote-AchieveNote/note_ReadMode_ThreeDotMenu_Uncheck'), 
    0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

