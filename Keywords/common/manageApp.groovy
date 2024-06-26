package common

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

public class manageApp {
	/**
	 * Load mobile app based on app ID
	 *
	 *
	 * @param appId Mobile Application ID
	 * @param isPersistent isPersistent true or false
	 * @return
	 */
	@Keyword(keywordObject = 'Load App')
	def loadApp(String appId, boolean isPersistent) {
		String statusText = "Invalid App ID "
		if(!"".equals(appId)) {
			if (isPersistent) {
				Mobile.startExistingApplication(appId)
			}
			else {
				Mobile.startApplication(appId, true)
			}
			statusText = "App ID is specified. Loading Mobile App based on ID "
		}
		return statusText
	}
}
