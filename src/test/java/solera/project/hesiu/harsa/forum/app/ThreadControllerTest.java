package solera.project.hesiu.harsa.forum.app;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.*;

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

import solera.project.hesiu.harsa.forum.app.Controllers.ThreadController;
import solera.project.hesiu.harsa.forum.app.Services.ThreadService;
import solera.project.hesiu.harsa.forum.app.model.CustomThread;

@WebMvcTest(ThreadController.class)
@ContextConfiguration(classes = ThreadController.class)
class ThreadControllerTest {

	@Autowired
	private ThreadController controller;
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private ThreadService threadService;

	private static List<CustomThread> listOfThreads;
	static CustomThread thread1 = new CustomThread();
	static CustomThread thread2 = new CustomThread();
	

	@BeforeAll
	public static void setUp() {
		thread1 = new CustomThread(1, "Music");
		thread2 = new CustomThread(2, "Movies");
		listOfThreads = Arrays.asList(thread1, thread2);
	}

	@Test
	public void getThreadById() throws Exception {
		
		when(threadService.findById(1)).thenReturn(thread1);
		mockMvc.perform(MockMvcRequestBuilders.get("/threads/1"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Music")).andExpect(status().isOk());
	}

	
	@Test
	public void getAllThreads() throws Exception {

		when(threadService.findAll()).thenReturn(listOfThreads);
		mockMvc.perform(MockMvcRequestBuilders.get("/threads"))
				.andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("Music")).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("Music"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(2)));
	}

}
