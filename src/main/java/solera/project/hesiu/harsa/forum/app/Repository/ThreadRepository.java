package solera.project.hesiu.harsa.forum.app.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import solera.project.hesiu.harsa.forum.app.model.CustomThread;

@Repository
public class ThreadRepository {

	private List<CustomThread> list = new ArrayList<CustomThread>();

	public void createThreads() {
		list = List.of(new CustomThread(1, "Movies"), new CustomThread(2, "Sports"), new CustomThread(3, "Travel"),
				new CustomThread(4, "Computer Science"), new CustomThread(5, "Games"));
	}

	public List<CustomThread> getAllCustomThreads() {
		return list;
	}

	public CustomThread findById(int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == (id)) {
				return list.get(i);
			}
		}
		return null;
	}

	public List<CustomThread> search(String name) {
		return list.stream().filter(x -> x.getName().startsWith(name)).collect(Collectors.toList());
	}

	public CustomThread save(CustomThread t) {
		CustomThread thread = new CustomThread();
		thread.setId(t.getId());
		thread.setName(t.getName());
		list.add(thread);
		return thread;
	}

	public String delete(Integer id) {
		list.removeIf(x -> x.getId() == (id));
		return null;
	}
}
