package solera.project.hesiu.harsa.forum.app.Services;
import java.util.List;
import java.util.Optional;

import solera.project.hesiu.harsa.forum.app.model.CustomThread;

public interface IThreadService {
	
	CustomThread create(CustomThread Thread);
	
	List<CustomThread> findByName(String name);
	
	CustomThread findById(int id);
	
	List<CustomThread> findAll();

	CustomThread update(CustomThread Thread);

	String deleteThread(int id);

}
