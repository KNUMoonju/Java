import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class File_io {
	public void save_userlist(ArrayList<User> userlist) {	//ArrayList 형태로 User를 넘겨주면 파일로 저장함.
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("userlist.dat");	//유저 목록은 userlist.dat에 들어간다.
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(userlist);
			
			Thread.sleep(1000);
			
		} catch (Exception e) {
			System.out.println("유저 목록을 저장하는 데 실패했습니다.");
			e.printStackTrace();
			
		} finally {
			System.out.println("유저 목록을 저장하였습니다.");
		}
			
		if(fos != null) try {fos.close();}catch(IOException e) {}
		if(oos != null) try {oos.close();}catch(IOException e) {}
	}
	
	public ArrayList<User> load_userlist() {	//ArrayList<User>형태로 return해준다.
		ArrayList<User> userlist = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("userlist.dat");
			ois = new ObjectInputStream(fis);
			
			userlist = (ArrayList<User>)ois.readObject();
			Thread.sleep(1000);
			
		} catch(Exception e) {
			System.out.println("유저 목록을 불러오는 데 실패했습니다.");
			e.printStackTrace();
			
		} finally {
			System.out.println("유저 목록을 불러왔습니다.");
		}
		
		if(fis != null) try {fis.close();}catch(IOException e) {}
		if(ois != null) try {ois.close();}catch(IOException e) {}
		
		return userlist;
	}
}
