package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;



public class StepDefintion {
	public static WebDriver driver;
	
		
	
	@Given("The application is launched and in search page")
	public void the_application_is_launched_and_in_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("Verify the page url")
	public void verify_the_page_url() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("Verify the page title")
	public void verify_the_page_title() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("Enter the search {string}")
	public void enter_the_search(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("Clicks on search button")
	public void clicks_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("Click on the product")
	public void click_on_the_product() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Given("Add item to cart")
	public void add_item_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("Verify the search icon")
	public void verify_the_search_icon() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("The user clicks on Get it by Tomrrow")
	public void the_user_clicks_on_get_it_by_tomrrow() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("The products should be displayed to the user")
	public void the_products_should_be_displayed_to_the_user() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
		
		
	
/*	@Before
	
	public void BeforeExecution()
	{
		
		System.out.println("Executing Before Hook");
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
 		driver = new ChromeDriver();
 		
	}

	@After
	
	public void AfterExecution()
	{
		System.out.println("Executing After Hook");
		driver.close();
	}
		
		@Given("The user is on Home Page")
		public void the_user_is_on_home_page() {
			driver.get("https://the-internet.herokuapp.com/login");
	 		driver.manage().window().maximize();
		  
		}

		@Given("Enters the {string} and {string}")
		public void enters_the_and(String string, String string2) {

	    	WebElement Username = driver.findElement(By.id("username"));
	    	WebElement Password = driver.findElement(By.id("password"));
	    	
	    	Username.sendKeys(string);
	    	Password.sendKeys(string2);
		   
		}

		@Given("Click on Login button")
		public void click_on_login_button() {
		    // Write code here that turns the phrase above into concrete actions
			
			WebElement loginButton = driver.findElement(By.className("radius"));
	    	loginButton.click();
		   
		}

		@When("The user is on search page")
		public void the_user_is_on_search_page() {
		    // Write code here that turns the phrase above into concrete actions
			
			driver.navigate().to("https://www.amazon.in/");
			
		}

		@Then("Gives the search keyword {string}")
		public void gives_the_search_keyword(String string) {
		    // Write code here that turns the phrase above into concrete actions
			
			WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
			
			SearchBox.sendKeys("Shirts");
		   
		}

		@Then("Clicks on Search icon")
		public void clicks_on_search_icon() {
		   
			WebElement Searchicon = driver.findElement(By.id("nav-search-submit-button"));
			Searchicon.click();
		   
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	public static WebDriver driver;
	 	@Given("^User lauches the application$")
	    public void user_lauches_the_application() throws Throwable {
	 		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
	 		driver = new ChromeDriver();
	 		driver.get("https://the-internet.herokuapp.com/login");
	 		driver.manage().window().maximize();
	       
	    }

	    @When("^User enters the (.+) and (.+)$")
	    public void user_enters_the_and(String username, String password) throws Throwable {
	    	
	    	
	    	System.out.println(username);
	    	System.out.println(password);
	    	
	    	WebElement Username = driver.findElement(By.id("username"));
	    	WebElement Password = driver.findElement(By.id("password"));
	    	
	    	Username.sendKeys(username);
	    	Password.sendKeys(password);
	     
	    }

	    @Then("^Clicks on login button$")
	    public void clicks_on_login_button() throws Throwable {
	    	
	    	WebElement loginButton = driver.findElement(By.className("radius"));
	    	loginButton.click();
	       
	    }

	    @And("^Check if the user has logged in successfully$")
	    public void check_if_the_user_has_logged_in_successfully() throws Throwable {
	    	
	    	Thread.sleep(2000);
	    	String ExpectedURL = driver.getCurrentUrl();
	    	
	    	if(ExpectedURL.equalsIgnoreCase("https://the-internet.herokuapp.com/secure"))
	    	{
	    		System.out.println("User has logged in successfully");
	    	}
	    	
	      
	    }*/


}
