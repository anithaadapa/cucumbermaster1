package testrunner;




import org.junit.AfterClass;
import org.junit.runner.RunWith;


import com.vimalselvam.cucumber.listener.Reporter;



import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.*;


/*@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/HookExample.feature",
		glue="stepDefinitions",
		plugin= {"pretty", "html:target/cucumber-reports.html"},
		monochrome=true
		
		)*/

//Running with tags
/*@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/SearchPageTest.feature",
		glue="stepDefinitions",
		plugin= {"pretty", "html:target/cucumber-reports.html"},
		tags= "@smoke",s
		monochrome=true
		
		)*/

//Executing with multiple tags, and and or condition
//Executing the program with the help of TestNG
/*@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/SearchPageTest.feature",
		glue="stepDefinitions",
		plugin= {"pretty", "html:target/cucumber-reports.html","json:target/cucumber-reports/Cucumber.json,junit:target/cucumber-reports/Cucumber.xml"},
		tags= "@smoke or @regression",
		monochrome=true
		
		)*/
 
/*@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = "pretty", features="src/test/java/features/datatableexample.feature",
        glue = "stepDefinitions", tags="@ValidCredentials")*/
 

/*

@CucumberOptions(monochrome = true, plugin = "pretty", features="src/test/java/features/datatableexample.feature",
        glue = "stepDefinitions", tags="@ValidCredentials")

public class TestRuner extends AbstractTestNGCucumberTests   {
	

}*/



//Different Reports

/*@CucumberOptions(
		features="src/test/java/features/SearchPageTest.feature",
		glue="stepDefinitions",
		plugin= {"pretty","json:target/Cucumber.json","junit:target/Cucumber.xml","html:target/cucumber-reports.html"},
		tags= "@smoke or @regression",
		monochrome=true
		
		)*/

//Write Extent Reports
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/SearchPageTest.feature",
		glue="stepDefinitions",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:output/report.html"}

)

public class TestRuner  {
	
	@AfterClass
	public static void writeExtentReport() {
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.loadXMLConfig("D:\\D Drive\\SimpliLearn\\Automation Test Engineer\\Phase 2\\BDDWorkspace\\CucumberPractise\\extentconfig.xml");
	}
	

}




