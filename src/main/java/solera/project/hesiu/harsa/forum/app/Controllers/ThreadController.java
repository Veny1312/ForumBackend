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

import solera.project.hesiu.harsa.forum.app.Services.ThreadService;
import solera.project.hesiu.harsa.forum.app.model.CustomThread;

@RestController
@RequestMapping("/threads")
public class ThreadController {
	
	@Autowired
	private ThreadService threadService;
	

    public CustomThread addThread(@RequestBody CustomThread thread) {
        return threadService.create(thread);
        
        
    }
	
	@GetMapping
    public List<CustomThread> findAllThreads() {
        return threadService.findAll();
    }
	
	@GetMapping("{id}")
    public CustomThread findThreadById(@PathVariable int id) {
        return threadService.findById(id);
    }
	
	@DeleteMapping("{id}")
    public String deleteThread(@PathVariable int id) {
        return threadService.deleteThread(id);
    }
	@GetMapping("/getByName/{threadName}")
    public int getNameOfThread(@PathVariable String threadName) {
		return threadService.findNameOfThread(threadName);
    }
	

}
