package solera.project.hesiu.harsa.forum.app.Repository;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import solera.project.hesiu.harsa.forum.app.model.Post;

@Repository
public class PostRepository {

	private List<Post> list = new ArrayList<Post>();
@Autowired
private ThreadRepository repository;
	public void createPosts(int id,Post post) {
		repository.findById(id).getPosts().add(post);
	}

	public List<Post> getAllPosts(int threadId) {
		return repository.findById(threadId).getPosts();
	}

	public Post findById(int threadId,int postId) {
	return	repository.findById(threadId).getPosts().stream().filter((e)->e.getId()==postId).findFirst().get();
		
	}

	public List<Post> search(int threadId,String name) {
		return null;
	}

	public void save(Post p, int threadId) {
		
		 repository.findById(threadId).getPosts().add(p);
	}

	public void delete(int threadId,int postId) {
	this.repository.findById(threadId).setPosts(this.repository.findById(threadId).getPosts().stream().filter(e-> e.getId()!=postId).collect(Collectors.toList()));
}}
