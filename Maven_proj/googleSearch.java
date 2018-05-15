import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class googleSearch {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium tools\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Nisarg Kadam");
		driver.findElement(By.name("btnK")).click();
		
		
		
		for(int i=0; i<10; i++) {
		driver.navigate().forward();	//browser window
		driver.navigate().back();
		}
//		Thread.sleep(5000);
//		List<WebElement> lst = driver.findElements(By.xpath("//a[starts-with(.,'Nisarg')or starts-with(.,'nisarg')]"));
//		Thread.sleep(5000);
//		for (WebElement x: lst)
//				System.out.println(x.getText());
//		
//		System.out.println("================================================");
//		
//		lst= driver.findElements(By.xpath("//a[contains(.,'dance')]"));
//		for(WebElement x: lst)
//			System.out.println(x.getText());
		
//		System.out.println("===================================================");
//		WebElement w = driver.findElement(By.xpath("//div[@class='card-section']"));
//		lst = w.findElements(By.tagName("a"));
//		for(WebElement x: lst)
//			System.out.println(x.getText());
		
		
	
	}
}
