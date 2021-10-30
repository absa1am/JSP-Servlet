package backend;

public class Post {
	private String title;
	private String headline;
	private String content;
	
	public Post(String title, String headline, String content) {
		this.title = title;
		this.headline = headline;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
