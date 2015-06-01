package smok.springmvc.model.tmodel;

import java.util.Date;

public class News {

	private long id;

	private String title;

	private String url;

	private Date addtime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("News [id=").append(id).append(", ");
		if (title != null)
			builder.append("title=").append(title).append(", ");
		if (url != null)
			builder.append("url=").append(url).append(", ");
		if (addtime != null)
			builder.append("addtime=").append(addtime);
		builder.append("]");
		return builder.toString();
	}

}
