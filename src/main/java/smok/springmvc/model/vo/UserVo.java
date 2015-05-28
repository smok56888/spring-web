package smok.springmvc.model.vo;


public class UserVo extends RequestBaseVo {

	private long id;
	private String name;

	public long getId() {
		// id = Integer.parseInt(HttpServletUtil.getRequest().getParameter("id"));
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
//		if (name == null) {
//			name = HttpServletUtil.getRequest().getParameter("name");
//		}
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserVo [id=").append(id).append(", ");
		if (name != null)
			builder.append("name=").append(name);
		builder.append("]");
		return builder.toString();
	}
}
