package E_Commerce;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Shoping {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		char ch,ch1,ch2,ch3,ch4,ch5;
		Connection con=null;
		PreparedStatement ps,ps1,ps2,ps3,ps4,ps5,ps6,ps7,ps8,ps9,ps10,ps11,ps12,ps13,ps14,ps15,ps16;
		
		ResultSet rs2=null;
		do {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "root");
		
			System.out.println("FOR ADMIN PRESS->>1");
			System.out.println("FOR CUSTOMER PRESS->>2");
			System.out.println("ENTER CHOICE->>");
			int c=sc.nextInt();
			switch(c)
			{
			
			case 1:
			{
				String NAME="akash";
				String PASS="1234";
				System.out.println("ENTER USERNAME:-");
				String name=sc.next();
				System.out.println("ENTER PASSWORD:-");
				String pass=sc.next();
				if(NAME.equals(name) && PASS.equals(pass))
				{
					do
					{
					System.out.println("1>>ENTER NEW PRODUCT");
					System.out.println("2>>UPDATE PRODUCT DETAILS");
					System.out.println("3>>DELETE PRODUCT");
					System.out.println("4>>SELECT ALL PRODUCT");
					System.out.println("5>>CUSTUMER RELATED DETAILS");
					System.out.println("ENTER YOUR CHOICE->>");
					int a=sc.nextInt();
					switch(a)
					{
					case 1:
					{

						System.out.println("<<---ENTER NEW PRODECT DETAILS-->>");
						System.out.println("PRODUCT ID->>");
						String id=sc.next();
						System.out.println("DISCRIPTION->>");
						String dis=sc.next();
						System.out.println("PRICE->>");
						String price=sc.next();
						System.out.println("NAME->>");
						String name1=sc.next();
						System.out.println("QUENTITY->>");
						String que=sc.next();
						
						
						ps = con.prepareStatement("insert into product(ID,DISCRIPTION,PRICE,NAME,QUENTITY) values(?,?,?,?,?)");
						ps.setString(1, id);
						ps.setString(2, dis);
						ps.setString(3, price);
						ps.setString(4, name1);
						ps.setString(5, que);
						int x=ps.executeUpdate();
						System.out.println("PRODUCT WILL ADDED->>"+x);
						break;
					}
					case 2:
					{
						do {
						System.out.println("ENTER WHERE YOU CAN UPDATE");
						System.out.println("UPDATE PRODUCT ID PRESS         ->1");
						System.out.println("UPDATE PRODUCT DISCRIPTION PRESS->2");
						System.out.println("UPDATE PRODUCT PRICE PRESS      ->3");
						System.out.println("UPDATE PRODUCT NAME PRESS       ->4");
						System.out.println("UPDATE PRODUCT QUENTITY PRESS   ->5");
						System.out.println("ENTER YOUR CHOICE-->>");
						int u=sc.nextInt();
						switch(u)                       
						{
						case 1:
						{//update id
							ps4=con.prepareStatement("select * from product;");
							ResultSet rs = ps4.executeQuery();
						    while(rs.next())
						    {
						    	System.out.print("ID->>"+rs.getInt(1));
						    	System.out.print("\tDISCRIPTION->>"+rs.getString(2));
						    	System.out.print("\tPRICE->>"+rs.getString(3));
						    	System.out.print("\tNAME->>"+rs.getString(4));
						    	System.out.print("\tQUENTITY->>"+rs.getString(5));
						    	System.out.println();
						    }
							//update id
							System.out.println("ENTER NEW ID->>");
							String id1=sc.next();
							System.out.println("ENTER OLD ID WHERE CAN UPDATE->>");
							String id=sc.next();
							ps6=con.prepareStatement("update product set ID=? where id=?;");
							ps6.setString(1, id1);
							ps6.setString(2, id);
							ps6.executeUpdate();
							System.out.println("PRODUCT ID WILL UPDATE");
							break;
						}
						case 2:
						{
							ps4=con.prepareStatement("select * from product;");
							ResultSet rs = ps4.executeQuery();
						    while(rs.next())
						    {
						    	System.out.print("ID->>"+rs.getInt(1));
						    	System.out.print("\tDISCRIPTION->>"+rs.getString(2));
						    	System.out.print("\tPRICE->>"+rs.getString(3));
						    	System.out.print("\tNAME->>"+rs.getString(4));
						    	System.out.print("\tQUENTITY->>"+rs.getString(5));
						    	System.out.println();
						    }
							//update Discription
							System.out.println("ENTER NEW DISCRIPTION->>");
							String dis=sc.next();
							System.out.println("ENTER ID WHERE CAN UPDATE->>");
							String id=sc.next();
							ps7=con.prepareStatement("update product set DISCRIPTION=? where id=?;");
							ps7.setString(1, dis);
							ps7.setString(2, id);
							ps7.executeUpdate();
							System.out.println("DISCRIPTION WILL UPDATE SUCESSFULLY");
							break;
						}
						case 3:
						{//UPDATE PRICE
							ps4=con.prepareStatement("select * from product;");
							ResultSet rs = ps4.executeQuery();
						    while(rs.next())
						    {
						    	System.out.print("ID->>"+rs.getInt(1));
						    	System.out.print("\tDISCRIPTION->>"+rs.getString(2));
						    	System.out.print("\tPRICE->>"+rs.getString(3));
						    	System.out.print("\tNAME->>"+rs.getString(4));
						    	System.out.print("\tQUENTITY->>"+rs.getString(5));
						    	System.out.println();
						    }
							//update price
							System.out.println("ENTER NEW PRICE->>");
							String PRICE=sc.next();
							System.out.println("ENTER ID WHERE CAN UPDATE->>");
							String id=sc.next();
							ps8=con.prepareStatement("update product set PRICE=? where id=?;");
							ps8.setString(1, PRICE);
							ps8.setString(2, id);
							ps8.executeUpdate();
							System.out.println("PRICE WILL UPDATE SUCESSFULLY");
							
							break;
						}
						case 4:
						{//UPDATE NAME
							ps4=con.prepareStatement("select * from product;");
							ResultSet rs = ps4.executeQuery();
						    while(rs.next())
						    {
						    	System.out.print("ID->>"+rs.getInt(1));
					    		System.out.print("\tDISCRIPTION->>"+rs.getString(2));
						    	System.out.print("\tPRICE->>"+rs.getString(3));
						    	System.out.print("\tNAME->>"+rs.getString(4));
						    	System.out.print("\tQUENTITY->>"+rs.getString(5));
						    	System.out.println();
						    }
							//update name
							System.out.println("ENTER NEW NAME->>");
							String NAME1=sc.next();
							System.out.println("ENTER ID WHERE CAN UPDATE->>");
							String id=sc.next();
							ps9=con.prepareStatement("update product set NAME=? where id=?;");
							ps9.setString(1, NAME1);
							ps9.setString(2, id);
							ps9.executeUpdate();
							System.out.println("NAME WILL UPDATE SUCESSFULLY");
							break;
						}
						case 5:
						{//UPDATE QUENTITY
							ps4=con.prepareStatement("select * from product;");
							ResultSet rs = ps4.executeQuery();
						    while(rs.next())
						    {
						    	System.out.print("ID->>"+rs.getInt(1));
						    	System.out.print("\tDISCRIPTION->>"+rs.getString(2));
						    	System.out.print("\tPRICE->>"+rs.getString(3));
						    	System.out.print("\tNAME->>"+rs.getString(4));
						    	System.out.print("\tQUENTITY->>"+rs.getString(5));
						    	System.out.println();
						    }
							//update Quentity
							System.out.println("ENTER NEW QUENTITY->>");
							String QUENTITY=sc.next();
							System.out.println("ENTER ID WHERE CAN UPDATE->>");
							String id=sc.next();
							ps10=con.prepareStatement("update product set QUENTITY=QUENTITY+? where id=?;");
							ps10.setString(1, QUENTITY);
							ps10.setString(2, id);
							ps10.executeUpdate();
							System.out.println("QUENTITY WILL UPDATE SUCESSFULLY");
							break;
						}
						default:
						{
							System.out.println("WRONG CHOICE.....");
						}
						}
						System.out.println("DO YOU WANT PERFORM IN UPDATE PRODUCT PRESS->>Y");
						ch4=sc.next().charAt(0);
						}while(ch4=='y' || ch4=='Y');
						break;
					}
					case 3:
					{  //DELETE PRODUCT
						ps4=con.prepareStatement("select * from product;");
						ResultSet rs = ps4.executeQuery();
					    while(rs.next())
					    {
					    	System.out.print("ID->>"+rs.getInt(1));
					    	System.out.print("\tDISCRIPTION->>"+rs.getString(2));
					    	System.out.print("\tPRICE->>"+rs.getString(3));
					    	System.out.print("\tNAME->>"+rs.getString(4));
					    	System.out.print("\tQUENTITY->>"+rs.getString(5));
					    	System.out.println();
					    }
						//delete PRODUCT
						ps11=con.prepareStatement("delete from product where id=?;");
						System.out.println("ENTER  ID->>");
						String id=sc.next();
						ps11.setString(1, id);
						ps11.executeUpdate();
						System.out.println("RECORD DELETE-1");
						break;
					}
					case 4:
					{//ADMIN ->select all record
						ps12=con.prepareStatement("select * from product;");
						ResultSet rs = ps12.executeQuery();
					    while(rs.next())
					    {
					    	System.out.print("ID->>"+rs.getInt(1));
					    	System.out.print("\tDISCRIPTION->>"+rs.getString(2));
					    	System.out.print("\tPRICE->>"+rs.getString(3));
					    	System.out.print("\tNAME->>"+rs.getString(4));
					    	System.out.print("\tQUENTITY->>"+rs.getString(5));
					    	System.out.println();
					    }
						break;
					}
					case 5:
					{//admin search customer
						do {
							System.out.println("1<-ALL CUSTEMER RECORDS");
							System.out.println("2<-ALL ORDER RECORDS");
							System.out.println("3<-SINGLE CUSTOMER RECORD");
							System.out.println("ENTER YOUR CHOICE->>");
							int a1=sc.nextInt();
							switch(a1)
							{
							case 1:
							{//ALL CUSTEMER RECORDS
								ps2=con.prepareStatement("SELECT * FROM customer;");
								rs2= ps2.executeQuery();
							    while(rs2.next())
							    {
							    	System.out.print("C_ID->>"+rs2.getString(1));
							    	System.out.print("\tF_NAME->>"+rs2.getString(2));
							    	System.out.print("\tL_NAME->>"+rs2.getString(3));
							    	System.out.print("\tADREES->>"+rs2.getString(4));
							    	System.out.print("\tPIN->>"+rs2.getString(5));
							    	System.out.print("\tMOBILE_NO->>"+rs2.getString(6));
							    	System.out.println();
							    }
								
								break;
							}
							case 2:
							{//ALL ORDER RECORDS
								ps2=con.prepareStatement("select customer.C_ID,customer.FNAME,customer.LNAME,product.DISCRIPTION,product.NAME,product.PRICE,cart.quentity,cart.total_price\r\n"
										+ "from product inner join cart on product.ID=cart.p_id \r\n"
										+ " inner join customer on customer.C_ID=cart.c_id;;");
								rs2= ps2.executeQuery();
							    while(rs2.next())
							    {
							    	System.out.print("C_ID->>"+rs2.getString(1));
							    	System.out.print("\tF_NAME->>"+rs2.getString(2));
							    	System.out.print("\tL_NAME->>"+rs2.getString(3));
							    	System.out.print("\tDISCRIPTION->>"+rs2.getString(4));
							    	System.out.print("\tNAME->>"+rs2.getString(5));
							    	System.out.print("\tPRICE->>"+rs2.getString(6));
							    	System.out.print("\tQUENTITY->>"+rs2.getString(7));
							    	System.out.print("\tTOTAL_PRICE->>"+rs2.getString(8));
							    	System.out.println();
							    }
								break;
							}
							case 3:
							{//SINGLE CUSTOMER RECORD
								System.out.println("ENTER CUSTOMER ID=");
								int z=sc.nextInt();
								ps2=con.prepareStatement("select customer.FNAME,customer.LNAME,product.DISCRIPTION,product.NAME,product.PRICE,cart.quentity,cart.total_price\r\n"
										+ "from product inner join cart on product.ID=cart.p_id \r\n"
										+ "inner join customer on customer.C_ID=cart.c_id where cart.c_id=?;");
								ps2.setInt(1, z);
								ResultSet rs3 = ps2.executeQuery();
							    while(rs3.next())
							    {
							    	System.out.print("F_NAME->>"+rs3.getString(1));
							    	System.out.print("\tL_NAME->>"+rs3.getString(2));
							    	System.out.print("\tDISCRIPTION->>"+rs3.getString(3));
							    	System.out.print("\tNAME->>"+rs3.getString(4));
							    	System.out.print("\tPRICE->>"+rs3.getString(5));
							    	System.out.print("\tQUENTITY->>"+rs3.getString(6));
							    	System.out.print("\tTOTAL_PRICE->>"+rs3.getString(7));
							    	System.out.println();
							    }
							    System.out.println();
							    System.out.println();
							    ps3=con.prepareStatement("select sum(total_price)from cart where c_id=?;");
								ps3.setInt(1, z);
								ResultSet rs4 = ps3.executeQuery();
								while(rs4.next())
								{
									System.out.println("TOTAL MONEY-->>"+rs4.getInt(1));
								}
								break;
							}
							default:
							{
								System.out.println("WRONG CHOICE................");
								break;
							}
							
							}
							System.out.println("DO YOU WANT SEE CUSTOMER DATA-->>Y");
							ch3=sc.next().charAt(0);
						}while(ch3=='y' || ch3=='Y');
						break;
					}
					default:
					{
						System.out.println("WRONG CHAOICE.......");
						break;
					}
					}
					System.out.println("ADMIN DO YOU WANT TO PERFORM ANOTHER TASK PRESS Y->");
					ch2=sc.next().charAt(0);
					}while(ch2=='y' || ch2=='Y');
					break;
					}
				else
				{
					System.out.println("WRONG USERNAME & PASSWORD PLZ ENTER CURRECT USERNAME & PASSWORD.....");
				}
				break;
			}
//--------------------customer dada will insert hear----------------------------------------------
			case 2:
			{
				int sum=0;
				ps4=con.prepareStatement("select * from product;");
				ResultSet rs = ps4.executeQuery();
			    while(rs.next())
			    {
			    	System.out.print("ID->>"+rs.getInt(1));
			    	System.out.print("\tDISCRIPTION->>"+rs.getString(2));
			    	System.out.print("\tPRICE->>"+rs.getString(3));
			    	System.out.print("\tNAME->>"+rs.getString(4));
			    	System.out.print("\tQUENTITY->>"+rs.getString(5));
			    	System.out.println();
			    }
			    System.out.println("YOU WANT TO SHOPING PRESS Y");
			    String cha=sc.next(); String cha1="y",cha2="Y";
			    if(cha1.equals(cha) || cha2.equals(cha))
			    {
			    	int z=0;
			    	 ps1=con.prepareStatement("select C_ID from customer group by C_ID order by C_ID DESC limit 0,1;");
					ResultSet rs5=ps1.executeQuery();
					while(rs5.next())
					{
						z = rs5.getInt(1);
					}
					int id=z+1;
					
			    	System.out.println("<<---ENTER CUSTOMER DETAILS-->>");
			    	System.out.println("YOUR ID->>"+id);
			    	System.out.println("FIRST NAME->>");
			    	String fname=sc.next();
			    	System.out.println("LAST NAME->>");
			    	String lname=sc.next();
			    	System.out.println("ADDRESS->>");
			    	String add=sc.next();
			    	System.out.println("PIN NO->>");
			    	String pin=sc.next();
			    	System.out.println("MOBILE_NO->>");
			    	String MOBILE_NO=sc.next();


			    	ps13= con.prepareStatement("insert into customer(C_ID,FNAME,LNAME,ADREES,PIN,MOBILE_NO) values(?,?,?,?,?,?)");
			    	ps13.setInt(1, id);
			    	ps13.setString(2, fname);
			    	ps13.setString(3, lname);
			    	ps13.setString(4, add);
			    	ps13.setString(5, pin);
			    	ps13.setString(6, MOBILE_NO);
			    	int x=ps13.executeUpdate();
			    	System.out.println("CUSTOMER REGISTRATION SUCCESSFULL.............");
//---------------------------------------------------------------------------------------------------
			//------customer purchess product
					do
					{
						ps4=con.prepareStatement("select * from product;");
						ResultSet rs4 = ps4.executeQuery();
					    while(rs4.next())
					    {
					    	System.out.print("ID->>"+rs4.getInt(1));
					    	System.out.print("\tDISCRIPTION->>"+rs4.getString(2));
					    	System.out.print("\tPRICE->>"+rs4.getString(3));
					    	System.out.print("\tNAME->>"+rs4.getString(4));
					    	System.out.print("\tQUENTITY->>"+rs4.getString(5));
					    	System.out.println();
					    }
						int a=0,mul=1;
						System.out.println("ENTER PRODUCT ID->>");
						int p_id=sc.nextInt();
						System.out.println("Enter QUENTITY->>");
						int quent=sc.nextInt();
						ps3=con.prepareStatement("update product set QUENTITY=QUENTITY-? where ID=?;;");
						ps3.setInt(1, quent);
						ps3.setInt(2, p_id);
						ps3.executeUpdate();
						
						ps1=con.prepareStatement("select price from product where ID=?;");
						ps1.setInt(1, p_id);
						ResultSet rs1=ps1.executeQuery();
						while(rs1.next())
						{
							a = rs1.getInt(1);
						}
						mul=a*quent;
						sum=sum+mul;
						ps5=con.prepareStatement("insert into cart(p_id,c_id,quentity,price,total_price)values(?,?,?,?,?);");
						ps5.setInt(1, p_id);
						ps5.setInt(2, id);
						ps5.setInt(3, quent);
						ps5.setInt(4, a);
						ps5.setInt(5, mul);
						ps5.executeUpdate();
						
						System.out.println("DO YOU WANT TO SHOPING CONTINUE PRESS>>Y");
						ch1=sc.next().charAt(0);
					}while(ch1=='y' || ch1=='Y');
					System.out.println();
					System.out.println();
					
//--------------------------------------CART------------------------------------------------------------------				
					System.out.println("<<<--WELCOME TO CART-->>>");
					ps2=con.prepareStatement("select product.NAME,product.DISCRIPTION,product.price,cart.quentity,cart.total_price from product inner join cart on product.ID=cart.p_id where cart.c_id=?;");
					ps2.setInt(1, id);
					rs2 = ps2.executeQuery();
				    while(rs2.next())
				    {
				    	System.out.print("NAME->>"+rs2.getString(1));
				    	System.out.print("\tDISCRIPTION->>"+rs2.getString(2));
				    	System.out.print("\tPRICE->>"+rs2.getString(3));
				    	System.out.print("\tQUENTITY->>"+rs2.getString(4));
				    	System.out.print("\tT_PRIZE->>"+rs2.getString(5));
				    	System.out.println();
				    }
					System.out.println("ALL PRODECT TOTAL PRICE-->>"+sum);
					System.out.println();
					
					do {
					System.out.println("1<<ADD ANOTHER PRODUCT");
					System.out.println("2<<REMOVE PRODUCT");
					System.out.println("3<<GO TO PAYMENT");
					System.out.println("ENTER CHAOICE->>");
					int c1=sc.nextInt();
					switch(c1)
					{
					case 1:
					{//add To cart Another Product
						do
						{
							ps4=con.prepareStatement("select * from product;");
							ResultSet rs4 = ps4.executeQuery();
						    while(rs4.next())
						    {
						    	System.out.print("ID->>"+rs4.getInt(1));
						    	System.out.print("\tDISCRIPTION->>"+rs4.getString(2));
						    	System.out.print("\tPRICE->>"+rs4.getString(3));
						    	System.out.print("\tNAME->>"+rs4.getString(4));
						    	System.out.print("\tQUENTITY->>"+rs4.getString(5));
						    	System.out.println();
						    }
							int a=0,mul=1;
							System.out.println("ENTER PRODUCT ID->>");
							int p_id=sc.nextInt();
							System.out.println("Enter QUENTITY->>");
							int quent=sc.nextInt();
							ps3=con.prepareStatement("update product set QUENTITY=QUENTITY-? where ID=?;;");
							ps3.setInt(1, quent);
							ps3.setInt(2, p_id);
							ps3.executeUpdate();
							
							ps1=con.prepareStatement("select price from product where ID=?;");
							ps1.setInt(1, p_id);
							ResultSet rs1=ps1.executeQuery();
							while(rs1.next())
							{
								a = rs1.getInt(1);
							}
							mul=a*quent;
							sum=sum+mul;
							ps5=con.prepareStatement("insert into cart(p_id,c_id,quentity,price,total_price)values(?,?,?,?,?);");
							ps5.setInt(1, p_id);
							ps5.setInt(2, id);
							ps5.setInt(3, quent);
							ps5.setInt(4, a);
							ps5.setInt(5, mul);
							ps5.executeUpdate();
							
							System.out.println("DO YOU WANT TO SHOPING CONTINUE PRESS>>Y");
							ch1=sc.next().charAt(0);
						}while(ch1=='y' || ch1=='Y');
						System.out.println();
						System.out.println();
						
						System.out.println("<<<--WELCOME TO CART-->>>");
						ps2=con.prepareStatement("select product.NAME,product.DISCRIPTION,product.price,cart.quentity,cart.total_price from product inner join cart on product.ID=cart.p_id where cart.c_id=?;");
						ps2.setInt(1, id);
						rs2 = ps2.executeQuery();
					    while(rs2.next())
					    {
					    	System.out.print("NAME->>"+rs2.getString(1));
					    	System.out.print("\tDISCRIPTION->>"+rs2.getString(2));
					    	System.out.print("\tPRICE->>"+rs2.getString(3));
					    	System.out.print("\tQUENTITY->>"+rs2.getString(4));
					    	System.out.print("\tT_PRIZE->>"+rs2.getString(5));
					    	System.out.println();
					    }
						System.out.println("ALL PRODECT TOTAL PRICE-->>"+sum);
						System.out.println();
						break;
					}
					case 2:
					{//remove product from cart
						ps2=con.prepareStatement("select product.ID,product.NAME,product.DISCRIPTION,product.price,cart.quentity,cart.total_price from product inner join cart on product.ID=cart.p_id where cart.c_id=?;");
						ps2.setInt(1, id);
						rs2 = ps2.executeQuery();
					    while(rs2.next())
					    {
					    	System.out.println("ID->>"+rs2.getString(1));
					    	System.out.print("NAME->>"+rs2.getString(2));
					    	System.out.print("\tDISCRIPTION->>"+rs2.getString(3));
					    	System.out.print("\tPRICE->>"+rs2.getString(4));
					    	System.out.print("\tQUENTITY->>"+rs2.getString(5));
					    	System.out.print("\tT_PRIZE->>"+rs2.getString(6));
					    	System.out.println();
					    }
						System.out.println("ALL PRODECT TOTAL PRICE-->>"+sum);
						System.out.println();
						
						System.out.println("ENTER PRODUCT ID TO REMOVE->>");
						int p_id1=sc.nextInt();
						
						int a1=0,mul=1;
						//product price
						ps1=con.prepareStatement("select price from product where ID=?;");
						ps1.setInt(1, p_id1);
						ResultSet rs1=ps1.executeQuery();
						while(rs1.next())
						{
							a1 = rs1.getInt(1);
						}
						//check product quentity
						int quent=0;
						ps15=con.prepareStatement("select quentity from cart where (p_id=? && c_id=?);");
						ps15.setInt(1, p_id1);
						ps15.setInt(2, id);
						ResultSet rs4=ps15.executeQuery();
						while(rs4.next())
						{
							quent = rs4.getInt(1);
						}
						mul=a1*quent;
						sum=sum-mul;
						
						//delete product
						ps3=con.prepareStatement("delete from cart where (p_id=? && c_id=?);");
						ps3.setInt(1, p_id1);
						ps3.setInt(2, id);
						ps3.executeUpdate();
						System.out.println("PRODUCT REMOVE SUCESSFULLY");
						
						ps16=con.prepareStatement("select product.ID,product.NAME,product.DISCRIPTION,product.price,cart.quentity,cart.total_price from product inner join cart on product.ID=cart.p_id where cart.c_id=?;");
						ps16.setInt(1, id);
						rs2 = ps16.executeQuery();
					    while(rs2.next())
					    {
					    	System.out.println("ID->>"+rs2.getString(1));
					    	System.out.print("NAME->>"+rs2.getString(2));
					    	System.out.print("\tDISCRIPTION->>"+rs2.getString(3));
					    	System.out.print("\tPRICE->>"+rs2.getString(4));
					    	System.out.print("\tQUENTITY->>"+rs2.getString(5));
					    	System.out.print("\tT_PRIZE->>"+rs2.getString(6));
					    	System.out.println();
					    }
						System.out.println("ALL PRODECT TOTAL PRICE-->>"+sum);
						System.out.println();
						break;
					}
					
					default:
					{
						System.out.println("ALL PRODECT TOTAL PRICE-->>"+sum);
						System.out.println("FOR PAYMENT PRSSS->>P");
						break;
					}
					}
					System.out.println("ADD OR REMOVE PRODUCT PRESS->>Y");
					ch5=sc.next().charAt(0);
					}while(ch5=='y' || ch5=='Y');
					
					System.out.println("ALL PRODECT TOTAL PRICE-->>"+sum);
					System.out.println("PAYMENT SUCESSFULLY.........");
				}
			    else
			    {
			    	System.out.println("THANKS YOU.....VISIT AGAIN....");
			    }
				break;
			}
			default:
			{
				System.out.println("WRONG CHOICE.....PLZ ENTER 1 OR 2");
				break;
			}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("GO TO MAIN MENU PRESS-Y");
		ch=sc.next().charAt(0);
	}while(ch=='y' || ch=='Y');
	System.out.println("<<--THANKS YOU SO MUCH ! -->><<--WELL-COME BACK-->>");
	
	}
}

