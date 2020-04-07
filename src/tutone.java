import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class tutone {

	static String browserName;

	static WebDriver driver;

	public static void main(String args[]) {

		browserName = "ff";

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\Desktop\\selenium\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		if (browserName.equalsIgnoreCase("ff")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Siva\\Desktop\\selenium\\geckodriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			FirefoxOptions opt = new FirefoxOptions();
			opt.merge(capabilities);

			driver = new FirefoxDriver(opt);

		}

		if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Siva\\Desktop\\selenium\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		System.out.println("Test case completed");

	}

}
