package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenition_Password {
	WebDriver driver;
	//----------------------Ganti Password---------------------
	//Varian 1: valid password lama and valid password baru and valid ulangi password
	//Test case 1
	/*@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	 	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8000/login");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
	}

	@Then("^klik profil lalu settings$")
	public void klik_profil_lalu_settings() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
	}

	@Then("^Tambah silabus$")
	public void Tambah_silabus() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Murnihombing@20");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnisihombing@20");
		driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Murnisihombing@20");
	}

	@Then("^berhasil ganti password$")
	public void berhasil_ganti_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
	}*/

	//Test case 2
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
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Davidsitorus@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Davidtorus@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Davidtorus@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/
	
	//Test case 3
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
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Amanda@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("manda@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("manda@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/
	
	//Test case 4
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
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Olyvia@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("lyvia@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("lyvia@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/
	
	//Test case 5
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
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Lovinta@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Loventa@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Loventa@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/
	
	//Test case 6
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Rian");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RianSya@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("RianSya@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/
	
	//Test case 7
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
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Hiskia@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hiska@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Hiska@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/
	
	//Test case 8
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
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Sandro@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Candro@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Candro@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/
	
	//Test case 9
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
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("RosaLin@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RosaLinda@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("RosaLinda@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/
	
	//Test case 10
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(" Albert");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" Albert@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys(" Albert@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" Alberth@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys(" Alberth@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/
	
	//Test case 11
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
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Herbeth@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Herbet@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Herbeth@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/
	
	//Test case 12
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
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Agnes@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Agnesia@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Agnesia@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/
	
	//Test case 13
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
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Rachel@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rahel@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Rahel@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/
	
	//Varian 2: valid password lama and valid password baru and Invalid ulangi password
		//Test case 14
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Murnihombing@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnisihombing@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/

		//Test case 15
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Davidsitorus@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Davidtorus@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 16
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Amanda@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("manda@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 17
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Olyvia@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("lyvia@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 18
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Lovinta@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Loventa@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 19
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Rian");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RianSya@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 20
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Hiskia@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hiska@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 21
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Sandro@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Candro@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 22
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("RosaLin@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RosaLinda@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 23
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(" Albert");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" Albert@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys(" Albert@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" Alberth@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 24
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Herbeth@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Herbet@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 25
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Agnes@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Agnesia@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 26
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
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Rachel@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rahel@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Rahel@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
	
	//Varian 3: valid password lama and Invalid password baru and valid ulangi password
		//Test case 27
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Murnihombing@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Murnisihombing@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/

		//Test case 28
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Davidsitorus@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Davidtorus@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 29
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Amanda@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("manda@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 30
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Olyvia@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("lyvia@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 31
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Lovinta@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Loventa@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 32
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
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rian@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Rian@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("RianSya@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 33
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Hiskia@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Hiska@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 34
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sandro@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Sandro@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Candro@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 35
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("RosaLin@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("RosaLinda@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 36
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(" Albert");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" Albert@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys(" Albert@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys(" Alberth@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 37
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Herbeth@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Herbeth@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 38
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Agnes@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Agnesia@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 39
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Rachel@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Rahel@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
	//Varian 4: Invalid password lama and valid password baru and valid ulangi password
		//Test case 40
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys(" ");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnisihombing@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Murnisihombing@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/

		//Test case 41
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys(" ");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Davidtorus@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Davidtorus@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 42
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("manda@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("manda@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 43
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("lyvia@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("lyvia@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
	
		//Test case 44
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Loventa@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Loventa@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 45
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RianSya@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("RianSya@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 46
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hiska@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Hiska@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 47
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Candro@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Candro@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 48
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RosaLinda@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("RosaLinda@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 49
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(" Albert");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" Albert@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys(" ");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" Alberth@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys(" Alberth@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 50
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Herbet@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Herbeth@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 51
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Agnesia@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Agnesia@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
	
	//Varian 5: Invalid password lama and Invalid password baru and valid ulangi password
		//Test case 52
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Murnisihombing@20");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/

		//Test case 53
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Davidtorus@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 54
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("manda@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 55
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("lyvia@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 56
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Loventa@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 57
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("RianSya@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 58
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Hiska@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 59       
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Candro@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 60
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("RosaLinda@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 61
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(" Albert");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" Albert@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys(" Alberth@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 62
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Herbeth@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 63
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Agnesia@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
	
	//Varian 6: valid password lama and Invalid password baru and Invalid ulangi password
		//Test case 64
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Murnihombing@20");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/

		//Test case 65
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Davidsitorus@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 66
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Amanda@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 67
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Olyvia@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 68
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Lovinta@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Loventa@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("Loventa@20");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 69
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Rian");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 70
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Hiskia@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 71
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Sandro@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 72
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("RosaLin@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 73
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(" Albert");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" Albert@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys(" Albert@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 74
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Herbeth@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 75
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("Agnes@20");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
	
	//Varian 7: Invalid password lama and valid password baru and Invalid ulangi password
		//Test case 76
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnisihombing@20");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/

		//Test case 77
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Davidtorus@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 78
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("manda@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 79
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("lyvia@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 80
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Loventa@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 81
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RianSya@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 82
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hiska@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 83
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Candro@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 84
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("RosaLinda@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 85
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(" Albert");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" Albert@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys(" ");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" Alberth@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys(" ");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 86
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Herbet@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 87
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Agnesia@20");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
	
	//Varian 8: : Invalid password lama and Invalid password baru and Invalid ulangi password
		//Test case 88
		/*@Given("^open chrome and start application$")
		public void open_chrome_and_start_application() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		 	
		 	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1:8000/login");
		}

		@When("^I enter valid username and valid password$")
		public void I_enter_valid_username_and_valid_password() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik profil lalu settings$")
		public void klik_profil_lalu_settings() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
		}

		@Then("^berhasil ganti password$")
		public void berhasil_ganti_password() throws Throwable {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		}*/

		//Test case 89
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 90
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 91
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 92
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 93
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 94
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 95
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 96
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 97
			/*@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
			 	
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/login");
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(" Albert");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(" Albert@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 98
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 99
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
		
		//Test case 100
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik profil lalu settings$")
			public void klik_profil_lalu_settings() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"current_password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"password_confirmation\"]")).sendKeys("");
			}

			@Then("^berhasil ganti password$")
			public void berhasil_ganti_password() throws Throwable {
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
			}*/
	
		
}
