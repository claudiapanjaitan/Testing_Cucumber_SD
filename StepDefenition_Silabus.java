package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenition_Silabus {
	WebDriver driver;
	
	//----------------------Tambah Silabus---------------------
	//Varian 1: Valid Judul, Valid Informasi, dan Valid File
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

	@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
	public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
	}

	@Then("^Tambah silabus$")
	public void Tambah_silabus() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan data$")
	public void masukkan_data() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
		driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 1");
		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4"
				+ "\\PKPL\\Project\\CUCUMBER_03\\silabus\\ipa1.pdf");
	}

	@Then("^berhasil tambah silabus$")
	public void berhasil_tambah_silabus() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 2");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
					+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa2.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 3");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
					+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa3.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 4");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
					+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa4.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 5");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
					+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa5.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 6");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
					+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa6.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 1");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
					+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa7.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 2");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
					+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa8.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 3");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
					+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa9.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 5");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
					+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa1.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 5");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
					+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa11.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 6");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
					+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa12.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 7");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa13.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
			}*/
	
	//Varian 2: Valid Judul, Valid Informasi, dan InValid File
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

	@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
	public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
	}

	@Then("^Tambah silabus$")
	public void Tambah_silabus() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan data$")
	public void masukkan_data() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
		driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 1");
		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
	}

	@Then("^berhasil tambah silabus$")
	public void berhasil_tambah_silabus() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 2");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 3");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 4");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 5");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 6");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 1");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 2");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 3");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 5");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 5");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
		}

		@Then("^I can login successfully$")
		public void I_can_login_successfully() throws Throwable {
			driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
		}

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 6");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 7");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
			}*/
	
	//Varian 3: Valid Judul, InValid Informasi, dan Valid File
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

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4"
					+ "\\PKPL\\Project\\CUCUMBER_03\\silabus\\ipa1.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa2.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa3.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa4.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa5.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa6.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa7.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa8.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa9.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa1.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa11.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa12.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
					driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
					driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
				}

				@Then("^I can login successfully$")
				public void I_can_login_successfully() throws Throwable {
					driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
				}

				@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
				public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
				}

				@Then("^Tambah silabus$")
				public void Tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
				}

				@Then("^masukkan data$")
				public void masukkan_data() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
					driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
					WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
							+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa13.pdf");
				}

				@Then("^berhasil tambah silabus$")
				public void berhasil_tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
				}*/
	
	//Varian 4: InValid Judul, Valid Informasi, dan Valid File
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

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 2");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa2.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 3");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa3.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 4");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa4.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 5");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa5.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 6");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa6.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 1");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa7.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 2");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa8.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 3");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa9.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 5");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa1.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 5");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa11.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 6");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa12.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
					driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
					driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
				}

				@Then("^I can login successfully$")
				public void I_can_login_successfully() throws Throwable {
					driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
				}

				@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
				public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
				}

				@Then("^Tambah silabus$")
				public void Tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
				}

				@Then("^masukkan data$")
				public void masukkan_data() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
					driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 7");
					WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
							+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa13.pdf");
				}

				@Then("^berhasil tambah silabus$")
				public void berhasil_tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
				}*/
				
	//Varian 5: Invalid Judul, Invalid Informasi and valid File
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

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4"
					+ "\\PKPL\\Project\\CUCUMBER_03\\silabus\\ipa1.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa2.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa3.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa4.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa5.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa6.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa7.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa8.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa9.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa1.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa11.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa12.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
			}*/
		
		//Varian 6: valid Judul, Invalid Informasi and Invalid File
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

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
					driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
					driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
				}

				@Then("^I can login successfully$")
				public void I_can_login_successfully() throws Throwable {
					driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
				}

				@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
				public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
				}

				@Then("^Tambah silabus$")
				public void Tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
				}

				@Then("^masukkan data$")
				public void masukkan_data() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
					driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
					WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
				}

				@Then("^berhasil tambah silabus$")
				public void berhasil_tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
					driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
					driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
				}

				@Then("^I can login successfully$")
				public void I_can_login_successfully() throws Throwable {
					driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
				}

				@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
				public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
				}

				@Then("^Tambah silabus$")
				public void Tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
				}

				@Then("^masukkan data$")
				public void masukkan_data() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
					driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
					WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
				}

				@Then("^berhasil tambah silabus$")
				public void berhasil_tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
					driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
					driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
				}

				@Then("^I can login successfully$")
				public void I_can_login_successfully() throws Throwable {
					driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
				}

				@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
				public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
				}

				@Then("^Tambah silabus$")
				public void Tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
				}

				@Then("^masukkan data$")
				public void masukkan_data() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
					driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
					WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
				}

				@Then("^berhasil tambah silabus$")
				public void berhasil_tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
				}*/
			
			//Test case 68
				/*Given("^open chrome and start application$")
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

				@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
				public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
				}

				@Then("^Tambah silabus$")
				public void Tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
				}

				@Then("^masukkan data$")
				public void masukkan_data() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
					driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
					WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
				}

				@Then("^berhasil tambah silabus$")
				public void berhasil_tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
				}*/
			
			//Test case 69
				/*iven("^open chrome and start application$")
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

				@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
				public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
				}

				@Then("^Tambah silabus$")
				public void Tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
				}

				@Then("^masukkan data$")
				public void masukkan_data() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
					driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
					WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
				}

				@Then("^berhasil tambah silabus$")
				public void berhasil_tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
				}*/
		
			//Test case 70
				/*iven("^open chrome and start application$")
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

				@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
				public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
				}

				@Then("^Tambah silabus$")
				public void Tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
				}

				@Then("^masukkan data$")
				public void masukkan_data() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
					driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
					WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
				}

				@Then("^berhasil tambah silabus$")
				public void berhasil_tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
					driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
					driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
				}

				@Then("^I can login successfully$")
				public void I_can_login_successfully() throws Throwable {
					driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
				}

				@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
				public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
				}

				@Then("^Tambah silabus$")
				public void Tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
				}

				@Then("^masukkan data$")
				public void masukkan_data() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
					driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
					WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
				}

				@Then("^berhasil tambah silabus$")
				public void berhasil_tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
					driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
					driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
				}

				@Then("^I can login successfully$")
				public void I_can_login_successfully() throws Throwable {
					driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
				}

				@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
				public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
				}

				@Then("^Tambah silabus$")
				public void Tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
				}

				@Then("^masukkan data$")
				public void masukkan_data() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
					driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
					WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
				}

				@Then("^berhasil tambah silabus$")
				public void berhasil_tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
					driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
					driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
				}

				@Then("^I can login successfully$")
				public void I_can_login_successfully() throws Throwable {
					driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
				}

				@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
				public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
				}

				@Then("^Tambah silabus$")
				public void Tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
				}

				@Then("^masukkan data$")
				public void masukkan_data() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
					driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
					WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
				}

				@Then("^berhasil tambah silabus$")
				public void berhasil_tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
					driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
					driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
				}

				@Then("^I can login successfully$")
				public void I_can_login_successfully() throws Throwable {
					driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
				}

				@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
				public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
				}

				@Then("^Tambah silabus$")
				public void Tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
				}

				@Then("^masukkan data$")
				public void masukkan_data() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
					driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
					WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
				}

				@Then("^berhasil tambah silabus$")
				public void berhasil_tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
						driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
						driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
					}

					@Then("^I can login successfully$")
					public void I_can_login_successfully() throws Throwable {
						driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
						Thread.sleep(1000);
						driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
					}

					@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
					public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
						driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
						Thread.sleep(1000);
						driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
						Thread.sleep(1000);
						driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
					}

					@Then("^Tambah silabus$")
					public void Tambah_silabus() throws Throwable {
						driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
					}

					@Then("^masukkan data$")
					public void masukkan_data() throws Throwable {
						driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("Silabus");
						driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
						WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
					}

					@Then("^berhasil tambah silabus$")
					public void berhasil_tambah_silabus() throws Throwable {
						driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
					}*/
	//Varian 7: Invalid Judul, valid Informasi and Invalid File
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

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 1");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4"
					+ "\\PKPL\\Project\\CUCUMBER_03\\silabus\\ipa.pdf");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 2");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 3");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 4");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 5");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 6");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 1");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 2");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 3");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 5");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 5");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("Silabus mata pelajaran IPA untuk kelas 6");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("D:\\IT DEL\\My Class\\Semester 4\\"
						+ "PKPL\\Project\\CUCUMBER_03\\silabus\\ipa.pdf");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
			}*/
	
	//Varian 8: Invalid Judul, Invalid Informasi and Invalid File
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

		@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
		public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
		}

		@Then("^Tambah silabus$")
		public void Tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan data$")
		public void masukkan_data() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
			WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
		}

		@Then("^berhasil tambah silabus$")
		public void berhasil_tambah_silabus() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}

			@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
			public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
			}

			@Then("^Tambah silabus$")
			public void Tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan data$")
			public void masukkan_data() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
				WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
			}

			@Then("^berhasil tambah silabus$")
			public void berhasil_tambah_silabus() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
					driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
					driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
				}

				@Then("^I can login successfully$")
				public void I_can_login_successfully() throws Throwable {
					driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
				}

				@Then("^klik Mata Pelajaran lalu silabus lalu IPA$")
				public void klik_Mata_Pelajaran_lalu_silabus_lalu_IPA() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/a/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[4]/ul/li[2]/a/span")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[2]/div/div/div/h5[5]/a/div")).click();
				}

				@Then("^Tambah silabus$")
				public void Tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
				}

				@Then("^masukkan data$")
				public void masukkan_data() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"nama_materi\"]")).sendKeys("");
					driver.findElement(By.xpath("//*[@id=\"silabus\"]")).sendKeys("");
					WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file\"]"));fileInput.sendKeys ("");
				}

				@Then("^berhasil tambah silabus$")
				public void berhasil_tambah_silabus() throws Throwable {
					driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
				}*/
		
}
