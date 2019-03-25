import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.weightwatchers.com/us/");
		Thread.sleep(5000L);
		//System.out.println(Driver.getTitle());
		String Actual_Title = Driver.getTitle();
		String Expected_Title ="WW (Weight Watchers): Weight Loss & Wellness Help";
		if (Actual_Title.equals(Expected_Title))
		{
			System.out.println("Home page title matches");
		}
		else
		{
			System.out.println("Home page title doesnot match");	
		}
		Driver.findElement(By.xpath("//a[@id='ela-menu-visitor-desktop-supplementa_find-a-studio']//span[@class='menu-link__inner-wrapper'][contains(text(),'Find a Studio')]")).click();
		Thread.sleep(1000L);
		String Actual_Title1 = Driver.getTitle();
		String Expected_Title1 ="Find a Studio & Meeting Near You | WW USA";
		//System.out.println(Actual_Title1);
		if (Actual_Title1.equals(Expected_Title1))
		{
			System.out.println("Find a studio page title contains");
		}
		else
		{
			System.out.println("Find a studio page title doesnot not contain");	
		}
		Driver.findElement(By.xpath("//input[@id='meetingSearch']")).sendKeys("10011");
		Driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[2]/form[1]/div[1]/button[1]")).click();
		System.out.println(Driver.findElement(By.xpath("//span[contains(text(),'WW Studio Flatiron')]")).getText());
		System.out.println(Driver.findElement(By.xpath("//*[@id='ml-1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[2]")).getText());
		Driver.findElement(By.xpath("//span[contains(text(),'WW Studio Flatiron')]")).click();
		
	}

	
		
	}


