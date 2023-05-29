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

'Tap and hold a note from home page | Parameterized checklistTitle'
Mobile.tapAndHold(findTestObject('ColorNote-DeleteNote/homePage_NoteList', [('noteText') : checklistTitle]), 0, 0)

Mobile.tap(findTestObject('Object Repository/ColorNote-DeleteNote/homePage_TapHold_DeleteButton'), 0)

'Verify delete prompt is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/ColorNote-DeleteNote/delete_Prompt_Confirm'), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote-DeleteNote/delete_Prompt_Confirm_OK'), 0)

'Verify note deleted from home page | Parameterized checklistTitle'
Mobile.verifyElementNotExist(findTestObject('ColorNote-DeleteNote/homePage_NoteList', [('noteText') : checklistTitle]), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote-DeleteNote/homePage_OthersButton'), 0)

Mobile.tap(findTestObject('Object Repository/ColorNote-DeleteNote/others_TrashCanButton'), 0)

'Verify deleted note exist in trash can | Parameterized checklistTitle'
Mobile.verifyElementExist(findTestObject('ColorNote-DeleteNote/trashNote_NoteList', [('noteText') : checklistTitle]), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()