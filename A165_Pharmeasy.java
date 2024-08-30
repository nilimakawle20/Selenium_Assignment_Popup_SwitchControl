/*WAP to search anything in https://pharmeasy.in/ & select the 3rd option*/
package popup.screenshot.autosugg;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A165_Pharmeasy {

public static void main(String[] args) throws InterruptedException {
ChromeDriver driver= new ChromeDriver();
driver.get("https://pharmeasy.in/");
driver.manage().window().maximize();
WebElement s1=driver.findElement(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-joLzpF-justify-center c-bXbWpx-joJbDg-align-center c-bXbWpx-igKcZLf-css']"));
s1.click();
WebElement s2=driver.findElement(By.id("topBarInput"));
s2.sendKeys("soaps");
Thread.sleep(5000);

List<WebElement> auto=driver.findElements(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-iieFQlv-css']/div/a"));
int count=auto.size();
System.out.println(count);
auto.get(count-8).click(); // to find 3rd autosuggestion give index (count-8) as index starts from 0
}
}
