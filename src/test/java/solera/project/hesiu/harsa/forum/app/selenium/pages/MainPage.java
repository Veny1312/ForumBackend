package solera.project.hesiu.harsa.forum.app.selenium.pages;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@SpringBootTest
public class MainPage extends BasePage {

	@Test
	void performActions() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/th[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("aaaa");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("body");

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[4]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/button[1]")).click();

		assertThat(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/button[1]")).isDisplayed())
				.isTrue();

	}

	@Test
	void performActionsInvalidTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/th[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("Name1");
		assertThat(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/div[2]")).isDisplayed())
				.isTrue();

	}

	@Test
	void performActionsForbiddenWords() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/th[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("aaaa");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("cats");
		assertThat(
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/div[2]\r\n")).isDisplayed())
				.isTrue();

	}

}
