import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderdemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Desktop\\selenium\\Java projects\\SeleniumTutorials\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	//	driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).clear();
		driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).getAttribute("value"));
	
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("It is enabled");
		}
		else
		{
			System.out.println("it is disabled");
	}
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("It is enabled");
		}
		else
		{
			System.out.println("it is disabled");
	}		
}

}
