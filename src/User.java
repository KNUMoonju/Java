
public class User {
	private String id;
	private String passwd;
	private String email;
	private String phone;
	private String address;
	
	
	/********************	getter & setter		************************/
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	/********************		finish		****************************/
	
	public User(String i, String passwd, String e, String p, String a) {
		setId(i);
		setPasswd(passwd);
		setEmail(e);
		setPhone(p);
		setAddress(a);
	}
}
