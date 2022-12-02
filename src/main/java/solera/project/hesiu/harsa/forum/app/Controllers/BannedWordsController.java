package solera.project.hesiu.harsa.forum.app.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banned-words")
public class BannedWordsController {
		
		
	@GetMapping
	public List<String> returnBannedWords() {
		List<String> bannedWords = List.of("foo", "bar", "baz");	
		return bannedWords;
	}
	
}
