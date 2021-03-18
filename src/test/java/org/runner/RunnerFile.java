package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\mselva\\Oxygen eclipse-workspace\\CucumberProject\\src\\test\\resources\\Feature\\loginmutiple.feature", glue="org\\stepdefinition")
public class RunnerFile {

}
