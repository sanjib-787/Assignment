package Gmail_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.cssSelector("input[class='whsOnd zHQkBf']")).sendKeys("sanjibkumarbisoyi@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='whsOnd zHQkBf']")).sendKeys("Sanjib@130");	
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(3000);
		System.out.println("login complited");
		driver.findElement(By.cssSelector("gb_Cb gb_Nf gb_Vf gb_Je gb_3c")).click();
		System.out.println("logout complited");
		driver.quit();		
	}

}
