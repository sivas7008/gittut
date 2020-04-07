import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class locatorTraining {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\Siva\\Desktop\\selenium\\Java projects\\SeleniumTutorials\\chromedriver.exe");
		
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Siva\\Desktop\\selenium\\Java projects\\SeleniumTutorials\\IEDriverServer.exe");

		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://client.schwab.com/Login/SignOn/CustomerCenterLogin.aspx");
	driver.findElement(By.id("LoginId")).sendKeys("eeee");

}
}
