import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Desktop\\selenium\\Java projects\\SeleniumTutorials\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		fromCity.clear();
		fromCity.sendKeys("DEL");
		fromCity.sendKeys(Keys.ARROW_DOWN);
		fromCity.sendKeys(Keys.ARROW_DOWN);
		fromCity.sendKeys(Keys.ENTER);
	}

}
