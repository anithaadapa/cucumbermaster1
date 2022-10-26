package stepDefinitions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	public String getReportConfigPath() throws IOException{
		
		FileReader reader=new FileReader("D:\\D Drive\\SimpliLearn\\Automation Test Engineer\\Phase 2\\BDDWorkspace\\CucumberPractise\\configuration.properties");  
		
		Properties propteries = new Properties();
		propteries.load(reader);
		String reportConfigPath = propteries.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}

}
