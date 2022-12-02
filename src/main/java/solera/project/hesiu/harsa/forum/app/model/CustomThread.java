package solera.project.hesiu.harsa.forum.app.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomThread {
	
	public CustomThread(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CustomThread() {
		
	}
	
	private int id;
	private String name;
	private List<Post> posts= new ArrayList<>();
	public int getId() {
		return id;
	}

	public void setId(long l) {
		this.id = (int) l;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

}
