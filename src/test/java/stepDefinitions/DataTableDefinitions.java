package stepDefinitions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
 
public class DataTableDefinitions {
 
    WebDriver driver;
 
    @Before
    public void setup() {
 
      //  System.setProperty("webdriver.chrome.driver",
             //   "C:\\Users\\Vibha\\Software\\chromedriver_win32_101\\chromedriver.exe");
      //  driver = new ChromeDriver();
       // driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
 
    @Given("User is on HRMLogin page")
    public void userOnHomePage() {
 
      //  driver.get("https://opensource-demo.orangehrmlive.com/");
    }
 
    @When("User enters valid credentials")
    public void entersValidCredential(DataTable dataTable) throws InterruptedException{
 
        System.out.println("Credentials Entered");
       
      /*
        //No Header code
        List<List<String>> data = dataTable.asLists(String.class);
        String userName = data.get(0).get(0);
        String passWord = data.get(0).get(1);
        
        System.out.println("The user id" +userName);
        System.out.println("The Password" +passWord);*/
        
        
        // One header one line
        
      /*  List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
        String userName = user.get(0).get("Username");
        String passWord = user.get(0).get("Password");
        
        System.out.println("The user id" +userName);
        System.out.println("The Password" +passWord);*/
        
        //One header multiple data
        
        List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
        
        for (Map<String, String> form : user) {
        	
        	
        	 String userName = form.get("Username");
             System.out.println("Username :" + userName);
             //driver.findElement(By.name("txtUsername")).sendKeys(userName);
  
             String passWord = form.get("Password");
             System.out.println("Password :" + passWord);
             //driver.findElement(By.name("txtPassword")).sendKeys(passWord);
  
             //driver.findElement(By.id("btnLogin")).submit();
  
             String errorMessage = form.get("ErrorMessage");
           //  String actualErrorMessage = driver.findElement(By.id("spanMessage")).getText();
            // System.out.println("Actual Error Message :" + actualErrorMessage);
  
          //   Assert.assertTrue(actualErrorMessage.equalsIgnoreCase(errorMessage));
  
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      //  driver.findElement(By.name("txtUsername")).sendKeys(userName);
      //  driver.findElement(By.name("txtPassword")).sendKeys(passWord);
       // driver.findElement(By.id("btnLogin")).submit();
    }
 
    @Then("User should be able to login successfully and new page open")
    public void successfulLogin() throws InterruptedException {
 
     //   String newPageText = driver.findElement(By.id("welcome")).getText();
        //System.out.println("newPageText :" + newPageText);
       //assertThat(newPageText, containsString("Welcome"));
    }
 
    @After
    public void teardown(){
      //  driver.close();
    }
}
