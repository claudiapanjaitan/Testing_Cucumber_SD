package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_Pengumuman {
	WebDriver driver;
	
		//----------------------Tambah Pengumuman---------------------
		//Varian 1: Valid Judul, Valid Deskripsi, Valid Tanggal
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Upacara");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Berbaris di Lapangan Silaen Seluruh Kelas 6 ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("02-02-2023");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Gotong Royong");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Membersihkan Lapangan");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("13-02-2023");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Senam");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Senama di Lapangan ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("02-02-2023");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Rapat Guru");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Ruang Guru ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("30-06-2023");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Rapat bersama Orang tua");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di ruangan Kelas 6 ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("17-09-2023");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Malam Akrab (MaKrab)");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Berbaris di Lapangan Silaen Seluruh Kelas 6 ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("23-12-2023");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kelulusan Kelas 6");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Aula Kecamatan Silaen ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("07-07-2023");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kemah");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Simlungun ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("19-09-2023");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Les Sore");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" Les Sore untuk kelas 3 dan 4 ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("27-07-2023");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Bazar Buku");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Depan Ruang Guru ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("28-07-2023");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Belajar Komputer");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Belajar Komputer di Perpustakaan ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("19-08-2023");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kunjungan Sosial ");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Ke Panti Asuhan Sarfat");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("16-05-2023");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Sanggar Seni dan Kreatifitas");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Lomba Seni dan KReatifitas ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("18-12-2023");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
	}*/
	
	//Varian 2: Valid Judul, Valid Deskripsi, InValid Tanggal
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Upacara");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Berbaris di Lapangan Silaen Seluruh Kelas 6 ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Gotong Royong");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Membersihkan Lapangan");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Senam");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Senama di Lapangan ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Rapat Guru");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Ruang Guru ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Rapat bersama Orang tua");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di ruangan Kelas 6 ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Malam Akrab (MaKrab)");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Berbaris di Lapangan Silaen Seluruh Kelas 6 ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kelulusan Kelas 6");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Aula Kecamatan Silaen ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kemah");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Simlungun ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Les Sore");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" Les Sore untuk kelas 3 dan 4 ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Bazar Buku");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Depan Ruang Guru ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Belajar Komputer");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Belajar Komputer di Perpustakaan ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kunjungan Sosial ");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Ke Panti Asuhan Sarfat");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Sanggar Seni dan Kreatifitas");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Lomba Seni dan KReatifitas ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
		}*/
	
	//Varian 3: Valid Judul, InValid Deskripsi, Valid Tanggal
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Upacara");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("02-02-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Gotong Royong");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("13-02-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Senam");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("02-02-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Rapat Guru");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("30-06-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Rapat bersama Orang tua");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("17-09-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Malam Akrab (MaKrab)");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("23-12-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kelulusan Kelas 6");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("07-07-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kemah");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("19-09-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Les Sore");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("27-07-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Bazar Buku");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("28-07-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Belajar Komputer");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("19-08-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kunjungan Sosial ");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("16-05-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Sanggar Seni dan Kreatifitas");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("18-12-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
		}*/
	
	//Varian 4: InValid Judul, Valid Deskripsi, Valid Tanggal
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Berbaris di Lapangan Silaen Seluruh Kelas 6 ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("02-02-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Membersihkan Lapangan");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("13-02-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Senama di Lapangan ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("02-02-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Ruang Guru ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("30-06-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di ruangan Kelas 6 ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("17-09-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Berbaris di Lapangan Silaen Seluruh Kelas 6 ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("23-12-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Aula Kecamatan Silaen ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("07-07-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Kemah di Sibolangit ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("19-09-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" Les Sore untuk kelas 3 dan 4 ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("27-07-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Depan Ruang Guru ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("28-07-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Belajar Komputer di Perpustakaan ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("19-08-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys(" ");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Ke Panti Asuhan Sarfat");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("16-05-2023");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
		}*/
		
	//Varian 5: InValid Judul, InValid Deskripsi, Valid Tanggal
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("02-02-2023");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("13-02-2023");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("02-02-2023");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("30-06-2023");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("17-09-2023");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("23-12-2023");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("07-07-2023");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("19-09-2023");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("27-07-2023");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("28-07-2023");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("19-08-2023");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("16-05-2023");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
			}*/
	
	//Varian 6: Valid Judul, InValid Deskripsi, InValid Tanggal
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Upacara");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Gotong Royong");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Senam");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Rapat Guru");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Rapat bersama Orang tua");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Malam Akrab (MaKrab)");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Murni Sihombing");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Murnihombing@20");
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("/html/body/div/form/div[3]/div[1]/input")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/button")).click();
			}
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kelulusan Kelas 6");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kemah");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Les Sore");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Bazar Buku");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Belajar Komputer");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
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
			@Then("^klik Info sekolah lalu pengumuman$")
			public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
			}

			@Then("^Tambah pengumuman$")
			public void Tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
			}

			@Then("^masukkan pengumuman$")
			public void masukkan_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kunjungan Sosial ");
				driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("");
				driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
			}

			@Then("^berhasil tambah pengumuman$")
			public void berhasil_tambah_pengumuman() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
			}*/
	
	//Varian 7: InValid Judul, Valid Deskripsi, InValid Tanggal
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Membersihkan Lapangan");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Senama di Lapangan ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Ruang Guru ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di ruangan Kelas 6 ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Berbaris di Lapangan Silaen Seluruh Kelas 6 ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Aula Kecamatan Silaen ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Simlungun ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" Les Sore untuk kelas 3 dan 4 ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Di Depan Ruang Guru ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Belajar Komputer di Perpustakaan ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Ke Panti Asuhan Sarfat");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
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
		@Then("^klik Info sekolah lalu pengumuman$")
		public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
		}

		@Then("^Tambah pengumuman$")
		public void Tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
		}

		@Then("^masukkan pengumuman$")
		public void masukkan_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
			driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys("Lomba Seni dan KReatifitas ");
			driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
		}

		@Then("^berhasil tambah pengumuman$")
		public void berhasil_tambah_pengumuman() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
		}*/
		
	//Varian 8: InValid Judul, InValid Deskripsi, InValid Tanggal
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
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
	@Then("^klik Info sekolah lalu pengumuman$")
	public void klik_Info_sekolah_lalu_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"remove-scroll\"]/div/ul/li[3]/ul/li[6]/ul/li/a/span")).click();
	}

	@Then("^Tambah pengumuman$")
	public void Tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"addRow\"]")).click();
	}

	@Then("^masukkan pengumuman$")
	public void masukkan_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"deskripsi\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//*[@id=\"hari_tanggal\"]")).sendKeys("");
	}

	@Then("^berhasil tambah pengumuman$")
	public void berhasil_tambah_pengumuman() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div/div/div[3]/fieldset/div[4]/div/button[1]")).click();
	}*/
	

}
