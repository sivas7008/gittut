import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class endtoendTest {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Desktop\\selenium\\Java projects\\SeleniumTutorials\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		// WebElement fromDate =
		// driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		// WebElement toDate =
		// driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		//
		//
		// fromDate.clear();
		// WebElement fromPlace =
		// driver.findElement(By.xpath("//a[@value='MAA']"));
		//
		// fromDate.click();
		// Thread.sleep(2000);
		// fromPlace.click();
		// Thread.sleep(2000);
		//

		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertEquals(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected(), false);
		
		}

}
