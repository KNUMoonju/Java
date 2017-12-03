import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Item implements Serializable{
	private int id_I;
	private int stock;
	private String createdD;
	private String expireD;
	
	public int getID(){
		return id_I;
	}
	public void setID(int id_I){
		this.id_I = id_I;
	}
	public int getStock(){
		return stock;
	}
	public void setStock(int stock){
		this.stock = stock;
	}
	public String getCreatedD(){
		return createdD;
	}
	public void setCreatedD(Date createdDate){
		createdDate = new Date();
		String createdS = createdDate.toString();
		this.createdD = createdS;
	}
	public String getExpireD(){
		return expireD;
	}
	public void setExpireDate(Date expireDate){
		expireDate = new Date();
		SimpleDateFormat formatt = new SimpleDateFormat("yyyy-MM-dd");
		formatt.format(expireDate);
		String s = formatt.toString();
		this.expireD = s;
	}
	
	
}
