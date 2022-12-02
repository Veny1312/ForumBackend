package solera.project.hesiu.harsa.forum.app.libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import io.github.bonigarcia.wdm.WebDriverManager;
@Configuration
public class WebDriverLibrary {
	    @Bean
	    public WebDriver getChromeDriver() {
		  
	        WebDriverManager.chromedriver().setup();
	        return new ChromeDriver();
	    }
}
