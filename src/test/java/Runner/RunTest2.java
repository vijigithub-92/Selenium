package Runner;

import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/Feature/Login2.feature",glue="Stepss",monochrome=true/*,dryRun=true,snippets=SnippetType.CAMELCASE*/)
public class RunTest2 extends AbstractTestNGCucumberTests{
	

}
