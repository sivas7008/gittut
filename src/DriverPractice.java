import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Siva\\Desktop\\selenium\\Java projects\\SeleniumTutorials\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://google.com");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.get("https://yahoo.co.in");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.close();

				
	}

}
