import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selIntroduction {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manis\\Practice2024 workspace\\Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/"); // Hit url
		
		driver.getTitle();   //get the title of the side
		System.out.println(driver.getTitle()); //print the title
		
		driver.getCurrentUrl(); //get currect URL validate the URL
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		driver.quit();

	}

}
