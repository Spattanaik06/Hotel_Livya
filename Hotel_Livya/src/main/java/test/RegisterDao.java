package test;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao 
{
	public int k=0;
	public int register(HotelBean hb)
	{
		Connection connection=DBConnection.getCon();
		String query="insert into hotel67 values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			
			preparedStatement.setString(1,hb.getCid());
			preparedStatement.setString(2,hb.getCname());
			preparedStatement.setString(3,hb.getCaddress());
			preparedStatement.setString(4,hb.getCmail());
			preparedStatement.setString(5,hb.getCphone());
			preparedStatement.setString(6,hb.getCstate());
			preparedStatement.setString(7,hb.getCcountryString());
			k=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return k;
		
	}
	
}
