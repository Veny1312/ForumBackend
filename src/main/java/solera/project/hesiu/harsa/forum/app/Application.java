package solera.project.hesiu.harsa.forum.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import solera.project.hesiu.harsa.forum.app.Services.PostService;
import solera.project.hesiu.harsa.forum.app.Services.ThreadService;
import solera.project.hesiu.harsa.forum.app.model.CustomThread;
import solera.project.hesiu.harsa.forum.app.model.Post;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Autowired
	private ThreadService threadService;
	@Autowired
	private PostService postService;

	@Override
	public void run(String... args) throws Exception {
		threadService.create(new CustomThread(1, "CustomThreadCMR"));
		threadService.create(new CustomThread(2, "Custom Thread CMR12"));
		threadService.create(new CustomThread(3, "Custom Thread CMR12"));
		postService.create(1, new Post(100, "Name1", "Question", "Body ", "img"));
		postService.create(1, new Post(101, "Name2", "Suggestion", "Body 2", "img2"));
		postService.create(1, new Post(102, "Name3", "Clarification", "Body 3", "img3"));

		postService.create(2, new Post(100, "Name1", "Question", "Body ", "img"));
		postService.create(2, new Post(101, "Name2", "Suggestion", "Body 2", "img2"));
		postService.create(2, new Post(102, "Name3", "Clarification", "Body 3", "img3"));
		
		postService.create(3, new Post(100, "Name1", "Question", "Body ", "img"));
		postService.create(3, new Post(101, "Name2", "Suggestion", "Body 2", "img2"));
		postService.create(3, new Post(102, "Name3", "Clarification", "Body 3", "img3"));

	}
}
