import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {
	
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	
	public UI() {
		System.out.println("UI Instance Made");

	}
	
	public User create_user() {
		System.out.println("��������");
		
		System.out.print("ID : ");
		String id = get_string();
		
		//TODO ��й�ȣ������� ǥ��, ��й�ȣ ���ǰ˻�
		System.out.print("Password : ");
		String passwd = get_string();
		
		//TODO �̸��� ��� �˻�
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
		System.out.println("�޴� ��ȣ �Է�");
		System.out.println("1 : ��������");
		
		int inp_menu = get_int();
		
		System.out.println("�Է� : " + inp_menu);
		
		switch(inp_menu) {
		case 1:
			create_user();
			break;
		}
	}
	
	private String get_string() {	//����ڷκ��� String���� �Է¹��� �� ���.
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
	
	private int get_int() {	//����ڷκ��� int���� �Է¹��� �� ���. int �ƴϸ� catch�� ����.
		int ret = 0;
				
		while(true) {

			try {
				ret = Integer.parseInt(in.readLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("�ȹٷ� �Ķ�");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return ret;
	}
}
