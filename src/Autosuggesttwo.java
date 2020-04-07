import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Autosuggesttwo {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chromedrive.driver",
				"C:\\Users\\Siva\\Desktop\\selenium\\Java projects\\SeleniumTutorials\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='tags']"));
		//driver.switchTo().frame(ele);
		ele.clear();
		ele.sendKeys("h");
		Thread.sleep(2000);
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);
		System.out.println(ele.getText());

	}

}
