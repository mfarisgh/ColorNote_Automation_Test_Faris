package searchStepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import common.manageApp

class SearchForWordSuccessfully {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User open the mobile app")
	def openMobileApp() {
		'Load app using custom keyword with status info text'
		//statusText = CustomKeywords.'common.manageApp.loadApp'(GlobalVariable.appId)
		String statusText = new common.manageApp().loadApp(GlobalVariable.appId).toString()
		
		'Verify Mobile App ID is specified'
		println(statusText + GlobalVariable.appId)
	}

	@When("User taps on Search button in the home page")
	def tapSearchButton() {
		Mobile.tap(findTestObject('Object Repository/ColorNote-Search/homePage_SearchButton'), 0)
	}
	
	@When("User inputs (.*) in search box")
	def enterSearchText(String searchText) {
		Mobile.setText(findTestObject('Object Repository/ColorNote-Search/search_EditText'), searchText, 0)
	}

	@Then("Search based on input (.*) yield a result")
	def yieldSearchResult(String searchText) {
		'Verify whether search yield a result | Parameterized searchText'
		Mobile.verifyElementExist(findTestObject('ColorNote-Search/search_ResultList', [('searchText') : searchText]), 0)
		
		Mobile.pressBack()
		
		Mobile.pressBack()
		
		Mobile.pressBack()
		
		Mobile.closeApplication()
	}
}