package solera.project.hesiu.harsa.forum.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class Post {
	
	private int id;
	private String postTitle;
	private String category;
	private String postBody;
	private String image;
	
	public Post(int id, String postTitle, String category, String postBody, String image) {
		this.id = id;
		this.postTitle = postTitle;
		this.category = category;
		this.postBody = postBody;
		this.image = image;
	}
	public Post() {
		
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostBody() {
		return postBody;
	}
	public void setPostBody(String postBody) {
		this.postBody = postBody;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
