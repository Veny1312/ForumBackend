package solera.project.hesiu.harsa.forum.app.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor

public class CustomThread {
	
	public CustomThread(int id, String title) {
		this.id = id;
		this.title = title;
	}
	
	public CustomThread() {
		
	}
	
	private int id;
	private String title;
	private List<Post> posts= new ArrayList<>();
	public int getId() {
		return id;
	}

	public void setId(long l) {
		this.id = (int) l;
	}


	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public void setId(int id) {
		this.id = id;
	}

}
