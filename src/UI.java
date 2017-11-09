import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {
	
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	
	public UI() {
		System.out.println("UI Instance Made");

	}
	
	public User create_user() {
		System.out.println("유저생성");
		
		System.out.print("ID : ");
		String id = get_string();
		
		//TODO 비밀번호모양으로 표시, 비밀번호 조건검사
		System.out.print("Password : ");
		String passwd = get_string();
		
		//TODO 이메일 양식 검사
		System.out.print("Email : ");
		String email = get_string();

		System.out.print("Phone : ");
		String phone = get_string();
		
		System.out.print("Address : ");
		String address = get_string();
		
		User new_user = new User(id, passwd, email, phone, address);
		
		return new_user;
	}
	
	public void main_menu() {
		System.out.println("메뉴 번호 입력");
		System.out.println("1 : 유저생성");
		
		int inp_menu = get_int();
		
		System.out.println("입력 : " + inp_menu);
		
		switch(inp_menu) {
		case 1:
			create_user();
			break;
		}
	}
	
	private String get_string() {	//사용자로부터 String값을 입력받을 때 사용.
		String ret = "";
		
		while(true) {

			try {
				ret = in.readLine();
				break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return ret;		
	}
	
	private int get_int() {	//사용자로부터 int값을 입력받을 때 사용. int 아니면 catch로 들어간다.
		int ret = 0;
				
		while(true) {

			try {
				ret = Integer.parseInt(in.readLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("똑바로 쳐라");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return ret;
	}
}
