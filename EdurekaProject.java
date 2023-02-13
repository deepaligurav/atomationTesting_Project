package Edubridge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdurekaProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.edureka.co/signin");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		String str= driver.getTitle();
		System.out.println("The title of the paage is: "+str);
		String str1= driver.getCurrentUrl();
		System.out.println("The current url of the page is: "+str1);
		
		driver.navigate().forward();
				
		driver.findElement(By.id("si_popup_email")).sendKeys("deepaligurav1296@gmail.com");
		
		driver.findElement(By.id("si_popup_passwd")).sendKeys("Sandeep@1798");
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/form/button")).click();
		
		Thread.sleep(5000);
		
		//For SearchBar
		driver.findElement(By.className("open_search_overlay")).click();

		Thread.sleep(5000);
		
		driver.findElement(By.id("search-input")).sendKeys("Full Stack");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/span[1]/div/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		
		//click logo for Home page
		driver.findElement(By.xpath("/html/body/header/nav/div[2]/a/img")).click();
		Thread.sleep(5000);
		
		//For Profile
		driver.findElement(By.className("img30")).click();
		Thread.sleep(5000);
		
		
		//Select for my profile
		driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/ul/li[4]/a")).click();
		Thread.sleep(5000);
		
		//iframe 
		
java.util.List<WebElement>iframes = driver.findElements(By.tagName("iframe"));
		
		System.out.println("Number of i frames:"+iframes.size());
		String currentWindowHandle = driver.getWindowHandle();
		System.out.println("Current window handle:"+currentWindowHandle);
		Thread.sleep(2000);
		
		//for logout
		
		driver.findElement(By.xpath("/html/body/app-root/app-profile-main/section/div/div/div[1]/span[1]/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.className("img30")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/ul/li[12]/a")).click();
		Thread.sleep(5000);
		
		
		driver.quit();
	}

}
