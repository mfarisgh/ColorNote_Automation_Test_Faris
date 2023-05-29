package checklist

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ManageChecklists {
	/**
	 * Create Multiple Checklist Contents in a loop
	 *
	 *
	 *
	 * @param multiChecklistContents Strings of multiple checklist contents
	 * @return
	 */
	@Keyword(keywordObject = 'Create Multiple Checklist Contents')
	def createMultiChecklistContents(String multiChecklistContents) {
		String[] arrayChecklistContents = multiChecklistContents.split(",")

		for(String checklistContent : arrayChecklistContents) {
			Mobile.tap(findTestObject('Object Repository/ColorNote-CreateChecklist/note_EditMode_Checklist_AddItem'), 0)

			Mobile.setText(findTestObject('Object Repository/ColorNote-CreateChecklist/note_EditMode_Checklist_Prompt_SetText'), checklistContent,
					0)

			Mobile.tap(findTestObject('Object Repository/ColorNote-CreateChecklist/note_EditMode_Checklist_Prompt_OK'), 0)
		}
	}

	/**
	 * Verify Multiple Checklist Contents in a loop
	 *
	 *
	 *
	 * @param multiChecklistContents Strings of multiple checklist contents
	 * @return
	 */
	@Keyword(keywordObject = 'Verify Saved Multiple Checklist Contents')
	def verifyMultiChecklistContents(String multiChecklistContents) {
		String[] arrayChecklistContents = multiChecklistContents.split(",")

		for(String checklistContent : arrayChecklistContents) {
			Mobile.verifyElementExist(findTestObject('ColorNote-CreateChecklist/note_ReadMode_Tap_Checklist', [('checklistContent') : checklistContent]),
			0)
		}
	}
}
