import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdownDemo {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Desktop\\selenium\\Java projects\\SeleniumTutorials\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		WebElement element = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select s = new Select(element);
		// s.selectByIndex(2);
		s.selectByValue("USD");
		// s.deselectAll();
	}

}
