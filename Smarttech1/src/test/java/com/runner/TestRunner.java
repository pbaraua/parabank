package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features ="Cucumberfeatures/Login.feature",
		glue ="com.stepDef.LoginStepdef"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
