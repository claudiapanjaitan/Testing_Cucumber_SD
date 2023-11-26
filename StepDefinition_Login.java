package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_Login {
	WebDriver driver;
	
	//----------------------Login---------------------
	//Varian 1: Valid Username dan Valid Password
	//Test case Login 1
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("David Partogi Sitorus");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Davidsitorus@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 2
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Amanda s");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Amanda@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 3
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Claudia");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Claudia@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 4
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Olyvia Siahaan");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Olyvia@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 5
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Lovinta");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Lovinta@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 6
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Rian");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RianSha@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 7
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("FritTY");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("FritTY@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 8
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Hiskia");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hiskia@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 9 
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Sandro");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sandro@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 10
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("RosaLin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RosaLin@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 11
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Albert");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Albert@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 12
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Herbeth");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Herbeth@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 13
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Agnes");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Agnes@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 14
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Intan S");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("IntanS@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 15
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Rachel");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rachel@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 16
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Sinta M");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SintaM@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 17
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ricky S");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RickyS@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 18
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Herlina");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Herlina@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 19
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Lawy L");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("LawyL@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 20
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Putri N");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("PutriN@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 21
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Putra M");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("PutraM@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 22
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Daniel");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Daniel@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 23
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ester");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ester@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 24
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ria s");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RiaAngel@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	//Test case Login 25
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Timothy");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Timothy@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
	}*/
	
	
	//Varian 2: Valid Username dan InValid Password
		//Test case Login 26
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("David Partogi Sitorus");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sitorus@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
	
	//Test case Login 27
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Amanda s");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("wasanda@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 28
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Claudia");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Masudia@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 29
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Olyvia Siahaan");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Olyvee@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 30
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Lovinta");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Loventa@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 31
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Rian");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RianSya@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 32
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("FritTY");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("PretTY@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 33
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Hiskia");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Heskia@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 34
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Sandro");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sandra@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 35
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("RosaLin");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RosaLinda@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 36
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Albert");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Alberth@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 37
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Herbeth");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Abeth@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 38
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Agnes");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("nenes@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 39
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Intan S");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Intan@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 40
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Rachel");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rahel@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 41
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Sinta M");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sinta@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 42
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ricky S");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ricky@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 43
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Herlina");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Heyina@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 44
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Lawy L");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Lawy@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 45
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Putri N");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Putri@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 46
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Putra M");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Putra@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 47
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Daniel");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Danyel@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 48
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ester");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Easter@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 49
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ria s");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Riaenjel@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 50
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Timothy");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Timoti@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
	
	//Varian 3: InValid Username dan Valid Password
		//Test case Login 51
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("David Sitorus");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Davidsitorus@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 52
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Amanda");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Amanda@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 53
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Claudia P");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Claudia@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 54
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Olyvia S");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Olyvia@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 55
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Lovesinta");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Lovinta@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 56
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Rian Sha");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RianSha@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 57
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("PretTY");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("FritTY@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 58
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Hiskia Andar");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hiskia@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 59 
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Sandro P");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sandro@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 60
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("RosaLinda");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RosaLin@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 61
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Alberth");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Albert@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 62
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Herbet");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Herbeth@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 63
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Agnes H");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Agnes@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 64
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Intan");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("IntanS@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 65
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Rahel");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rachel@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 66
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Sinta");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SintaM@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 67
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ricky");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RickyS@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 68
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Herlina N");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Herlina@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 69
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Lawy");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("LawyL@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 70
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Putri");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("PutriN@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 71
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Putra");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("PutraM@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 72
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Daniel L");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Daniel@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 73
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Easter");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ester@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 74
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ria");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RiaAngel@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 75
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Timoti");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Timothy@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
	
	//Varian 4: InValid Username dan InValid Password
		//Test case Login 76
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Partogi Sitorus");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ditorus@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 77
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Amanda");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("manda@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 78
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Claudia P");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Claude@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 79
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Olyvia S");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Olyv@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 80
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Lovesinta");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Loveminta@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 81
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Rian sya");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RianSya@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 82
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("FretTY");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("FretTY@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 83
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Hiskia A");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("HiskiaA@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 84
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Sandra");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sandra@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 85
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("RosaLinda");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RosaLinda@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 86
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Albet");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Albet@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 87
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Herbet");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Herbet@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 88
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Agnesia");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Agnesia@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 89
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Intan");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Intan@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 90
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Rahel");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rahel@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 91
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Sinta");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sinta@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 92
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ricky");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ricky@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 93
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Heyina");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Heyina@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 94
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Lawy");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Lawy@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 95
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Putri");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Putri@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 96
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Putra");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Putra@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 97
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Daniella");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Daniella@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 98
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ester");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ester@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 99
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ria");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ria@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
		
		//Test case Login 100
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Timoti");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Timoti@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		}*/
}
