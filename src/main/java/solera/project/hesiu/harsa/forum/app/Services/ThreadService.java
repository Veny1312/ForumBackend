package solera.project.hesiu.harsa.forum.app.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solera.project.hesiu.harsa.forum.app.Repository.ThreadRepository;
import solera.project.hesiu.harsa.forum.app.model.CustomThread;


@Service
public class ThreadService implements IThreadService {

	@Autowired
	private ThreadRepository threadRepository;
	
	@Override
	public CustomThread create(CustomThread thread) {
		return threadRepository.save(thread);
	}

	@Override
	public List<CustomThread> findByName(String name) {
		return threadRepository.search(name);
	}

	@Override
	public CustomThread findById(int id) {
		return threadRepository.findById(id);
	}

	@Override
	public List<CustomThread> findAll() {
		return threadRepository.getAllCustomThreads();
	}

	@Override
	public String deleteThread(int id) {
        threadRepository.delete(id);
        return "Thread removed !! " + id;
    }

	@Override
	public CustomThread update(CustomThread Thread) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
