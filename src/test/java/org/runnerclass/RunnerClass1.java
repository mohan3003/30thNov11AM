package org.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",
snippets=SnippetType.CAMELCASE,glue="org.stepdefinition",
dryRun=false,monochrome=true,tags="@Feature01")

public class RunnerClass1{
	
}
