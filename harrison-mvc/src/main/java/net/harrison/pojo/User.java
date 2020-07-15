package net.harrison.pojo;

/**
 * @author HarrisonLee
 * @date 2020/6/27 15:55
 */
public class User {

	private String name;

	private Integer isAdmin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", isAdmin=" + isAdmin +
				'}';
	}
}
