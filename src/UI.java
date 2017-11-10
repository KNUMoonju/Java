import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {
	
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	
	public UI() {
		System.out.println("UI Instance Made");
		System.out.println("GIT TEST");
		System.out.println("Git test2");
		System.out.println("TEST");
	}
	
	public User create_user() {
		System.out.println("유저 생성");
		System.out.println("GIT TEST");
		
		System.out.print("ID : ");
		String id = get_string();
		
		//TODO 비밀번호 모양으로 표시, 조건검사
		System.out.print("Password : ");
		String passwd = get_string();
		
		//TODO 이메일 조건 검사
		System.out.print("Email : ");
		String email = get_string();

		System.out.print("Phone : ");
		String phone = get_string();
		
		System.out.print("Address : ");
		System.out.println("hahaha");
		String address = get_string();
		
		User new_user = new User(id, passwd, email, phone, address);
		
		return new_user;
	}
	
	public void main_menu() {
		System.out.println("메뉴선택");
		System.out.println("1 : 유저 생성");
		
		int inp_menu = get_int();
		
		System.out.println("입력 : " + inp_menu);
		
		switch(inp_menu) {
		case 1:
			create_user();
			break;
		}
	}
	
	private String get_string() {	//콘솔입력으로 String값을 입력받아 return 해준다.
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
	
	private int get_int() {	//콘솔입력으로 int값을 입력받아 return 해준다. int가 아니면 Catch로 들어감.
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
