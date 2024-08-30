/*WAP to launch google, type india & select the 5th auto-suggestion*/
package popup.screenshot.autosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A162_Autosuggestion5th {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("India");
		Thread.sleep(5000);
		
		List<WebElement> auto=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=auto.size();
		System.out.println(count);
		auto.get(4).click(); // to find 5th autosuggestion give index (size-1) as index starts from 0

	}

}
