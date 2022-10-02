package E_Commerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class table_shop {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "root");
			
			//create product table
			PreparedStatement ps = con.prepareStatement("CREATE TABLE product(ID INT NOT NULL,DISCRIPTION VARCHAR(45) NULL,PRICE INT NULL,NAME VARCHAR(45) NULL,QUENTITY VARCHAR(45) NULL,PRIMARY KEY (ID));");
			ps.execute();
			ps.close();
			
			PreparedStatement ps1 = con.prepareStatement("CREATE TABLE customer(C_ID INT NOT NULL,FNAME VARCHAR(45) NULL,LNAME VARCHAR(45) NULL,ADREES VARCHAR(45) NULL,PIN VARCHAR(45) NULL,MOBILE_NO VARCHAR(45) NULL,PRIMARY KEY (C_ID));");
			ps1.execute();
			ps1.close();
			PreparedStatement ps2 = con.prepareStatement("CREATE TABLE cart(p_id INT NOT NULL,c_id INT NOT NULL,quentity INT NULL,price INT NULL,total_price INT NULL,foreign key(p_id)references product(ID),foreign key(c_id)references customer(C_ID) );");
			ps2.execute();
			ps2.close();
			System.out.println("DONE");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
