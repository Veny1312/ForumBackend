package solera.project.hesiu.harsa.forum.app;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import solera.project.hesiu.harsa.forum.app.Controllers.PostController;
import solera.project.hesiu.harsa.forum.app.Services.PostService;
import solera.project.hesiu.harsa.forum.app.model.Post;

@WebMvcTest(PostController.class)
@ContextConfiguration(classes = PostController.class)
class PostControllerTest {

	@Autowired
	private PostController controller;
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private PostService postService;

	private static List<Post> listOfPosts;
	Post post1 = new Post(100, "Name 1", "Question", "Body ", "img");

	@BeforeAll
	public static void setUp() {
		Post post1 = new Post(100, "Name 1", "Question", "Body ", "img");
		Post post2 = new Post(101, "Name 2", "Suggestion", "Body 2", "img2");
		listOfPosts = Arrays.asList(post1, post2);
	}
	
//	@Test
//	public void getPostById() throws Exception {
//
//		when(postService.findById(1, 100)).thenReturn(post1);
//		mockMvc.perform(MockMvcRequestBuilders.get("/posts/1/100"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("Name 1")).andExpect(status().isOk());
//	}


}
