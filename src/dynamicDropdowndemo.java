import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdowndemo {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Desktop\\selenium\\Java projects\\SeleniumTutorials\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))
				.getAttribute("value"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='CJB']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"))
				.getAttribute("value"));

	}

}
