package backend;

public interface PostDAO {
	public boolean save(Post post);
	public boolean update(Post post);
	public Post get(Integer id);
}
