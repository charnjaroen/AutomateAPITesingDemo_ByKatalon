import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/SOAPSampleDemoSuite')

suiteProperties.put('name', 'SOAPSampleDemoSuite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Ronnachai C\\Katalon Studio\\APITestingDemo\\Reports\\SOAPSampleDemoSuite\\20181127_023214\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/SOAPSampleDemoSuite', suiteProperties, [new TestCaseBinding('Test Cases/SOAP Test Case/TestOne', 'Test Cases/SOAP Test Case/TestOne',  null), new TestCaseBinding('Test Cases/SOAP Test Case/TestThree_Parameter', 'Test Cases/SOAP Test Case/TestThree_Parameter',  null), new TestCaseBinding('Test Cases/SOAP Test Case/TestTwo_APIChaining', 'Test Cases/SOAP Test Case/TestTwo_APIChaining',  null)])
