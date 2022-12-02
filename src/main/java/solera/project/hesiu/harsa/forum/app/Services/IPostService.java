package solera.project.hesiu.harsa.forum.app.Services;

import java.util.List;
import java.util.Optional;

import solera.project.hesiu.harsa.forum.app.model.Post;

public interface IPostService {


	List<Post> findAll();

	List<Post> findByThreadId(int threadId);

	void create(int threadId, Post Post);

	List<Post> findByName(int threadId, String name);

	Post findById(int threadId, int postId);

	String delete(int threadId, int postId);
}
