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
Mobile.tap(findTestObject('ColorNote-AchieveChecklist/homePage_NoteList', [('checklistTitle') : checklistTitle]), 0)

'Verify note is correctly selected | Parameterized checklistTitle'
Mobile.verifyElementExist(findTestObject('ColorNote-AchieveChecklist/note_ReadMode_Title', [('checklistTitle') : checklistTitle]), 
    0)

'Tap Three dot menu button'
Mobile.tap(findTestObject('Object Repository/ColorNote-AchieveChecklist/note_ReadMode_ThreeDotMenu'), 0)

'Tap List button in the Three dot menu'
Mobile.tap(findTestObject('Object Repository/ColorNote-AchieveChecklist/note_ReadMode_ThreeDotMenu_List'), 0)

'Tap Check All Items button in the List options'
Mobile.tap(findTestObject('Object Repository/ColorNote-AchieveChecklist/list_CheckAllItems_Option'), 0)

'Verify element confirmation of check all items prompt'
Mobile.verifyElementExist(findTestObject('Object Repository/ColorNote-AchieveChecklist/checkAllItems_Prompt_Confirm'), 0)

'Tap OK'
Mobile.tap(findTestObject('Object Repository/ColorNote-AchieveChecklist/checkAllItems_Prompt_Confirm_OK'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

