package solera.project.hesiu.harsa.forum.app.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import solera.project.hesiu.harsa.forum.app.Services.PostService;
import solera.project.hesiu.harsa.forum.app.Services.ThreadService;
import solera.project.hesiu.harsa.forum.app.model.CustomThread;
import solera.project.hesiu.harsa.forum.app.model.Post;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private ThreadService threadService;
	
	@PostMapping("{id}")
    public Post addThread(@RequestBody Post post,@PathVariable int id) {
      CustomThread customThread=threadService.findById(id);
      customThread.getPosts().add(post);
      return post;
        
    }
	
	@GetMapping
    public List<Post> findAllPosts() {
        return postService.findAll();
    }
	
	@GetMapping("{threadId}/{postId}")
    public Post findThreadById(@PathVariable int threadId,@PathVariable int postId) {
        return postService.findById(threadId,postId);
    }
	
	@DeleteMapping("{id}")
    public String deletePost(@PathVariable int id) {
      //
      
      return "";
    }
}
