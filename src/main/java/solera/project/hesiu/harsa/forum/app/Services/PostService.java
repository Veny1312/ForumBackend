package solera.project.hesiu.harsa.forum.app.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solera.project.hesiu.harsa.forum.app.Repository.PostRepository;
import solera.project.hesiu.harsa.forum.app.model.Post;

@Service
public class PostService implements IPostService {
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void  create(int threadId,Post Post) {
		postRepository.save(Post, threadId);
	}

	@Override
	public List<Post> findByName(int threadId,String name) {
		return postRepository.search(threadId,name);
	}

	@Override
	public Post findById(int threadId,int postId) {
		return postRepository.findById(threadId,postId);
	}

	@Override
	public List<Post> findAll(int threadId) {
		return postRepository.getAllPosts(threadId);
	}

	@Override
	public String delete(int threadId, int postId) {
		postRepository.delete(threadId, postId);
		return "Thread removed !! " ;
		
	}

	@Override
	public List<Post> findByThreadId(int threadId) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
