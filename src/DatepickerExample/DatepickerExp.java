package DatepickerExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatepickerExp {
	static WebDriver driver;

	public static void main(String[] args) {
		/*
		 * String str= "hello my self falguni"; String[] a = str.split(" ");
		 * System.out.println(a[0]);
		 */

		String str = "18/March/2019";
		String[] data = str.split("/");
		String date = data[0];
		String Month = data[1];
		String Year = data[2];
		System.out.println(date);
		System.out.println(Month);
		System.out.println(Year);

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();

		String displayYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println(displayYear);
		while (!(displayYear.equals(Year))) {
			driver.findElement(By.className("nextMonth")).click();
			displayYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
		String displaymonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(displaymonth);
		while (!(displaymonth.equals(Month))) {
			driver.findElement(By.className("nextMonth")).click();
			displaymonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}

		WebElement cal = driver.findElement(By.className("calendar"));
		List<WebElement> trList = cal.findElements(By.tagName("tr"));
		System.out.println("Size of the rows" + trList.size());
		for (int i = 0; i < trList.size(); i++) {
			List<WebElement> tdList = trList.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < tdList.size(); j++) {
				if (tdList.get(j).getText().equals(date)) {
					tdList.get(j).click();
					break;
				}
			}

		}

	}
}
