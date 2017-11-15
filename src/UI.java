import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.event.TreeWillExpandListener;

public class UI {
	
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	
	public UI() {
		System.out.println("UI Instance Made");
		System.out.println("GIT 설명");
		System.out.println("문주가 추가 다시함");
	}
	
	//TODO 유저 로그인할 때 파일에서 유저목록을 읽어와서 해당 유저를 찾아낸다.
	private User login_user() {
		User n = new User("a","b","c","d","e");
		
		return n;
	}
	
	private User create_user() {
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
		
		booting();
		
		System.out.println("* 메뉴선택\t\t\t\t\t\t\t\t*");
		System.out.println("* 1 : 유저 로그인\t\t\t\t\t\t\t*");
		System.out.println("* 2 : 유저 생성\t\t\t\t\t\t\t*");
		
		//메뉴가 추가될 때 여기에 추가하면 된다.
		
		System.out.println("*\t\t\t\t\t\t\t\t*");
		System.out.println("*****************************************************************");
		System.out.print("> ");
		int inp_menu = get_int();
		
		System.out.println("입력 : " + inp_menu);
		
		switch(inp_menu) {
		case 1:
			login_user();
			break;
		case 2:
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
	
	private void booting() {		//화면 맨처음 켜면 나오는 화면.
		clear_screen();
		System.out.println("*****************************************************************");
		System.out.println("*\t\t\t\t\t\t\t\t*");
		System.out.print("*\t\t\t");
		sleep_msec(150);
		System.out.print("3");
		sleep_msec(150);
		System.out.print("조");
		sleep_msec(150);
		System.out.print("재");
		sleep_msec(150);
		System.out.print("고");
		sleep_msec(150);
		System.out.print("관");
		sleep_msec(150);
		System.out.print("리");
		sleep_msec(150);
		System.out.print(" 시");
		sleep_msec(150);
		System.out.print("스");
		sleep_msec(150);
		System.out.println("템\t\t\t\t*");
		System.out.println("*\t\t\t\t\t\t\t\t*");
	}
	
	private void clear_screen() {	//화면지우기.
		for(int i = 0; i < 80; i ++) {
			System.out.println("");
		}
	}
	
	private void sleep_msec(int m) {	//m 만큼 sleep한다. 1000 = 1초
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
