package TakeScreenShotsGmail;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenShotsGmailTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\TakeScreenShotsGMail.Test\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.gmail.com");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("chilakaraju.anvesh7799@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9618989");
		Thread.sleep(1000);
		
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("D:\\workspace\\TakeScreenShotsGMail.Test\\ScreenShots\\GmailFailedImage.jpeg"));
		//FileUtils.copyFile(file, new File("D:\\workspace\\TakeScreenShotsGMail.Test\\ScreenShots\\Image.jpeg"));
		
}
}