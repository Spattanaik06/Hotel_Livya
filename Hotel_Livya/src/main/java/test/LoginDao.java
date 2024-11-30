package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao 
{
	public HotelBean hBean=null;
	public HotelBean login(String cid,String cname)
	{
		Connection connection=DBConnection .getCon();
		try {
			String queryString="select * from hotel67 where cid=? and cname=?";
			PreparedStatement preparedStatement=connection.prepareStatement(queryString);
			preparedStatement.setString(1, cid);
			preparedStatement.setString(2, cname);
			ResultSet rSet=preparedStatement.executeQuery();
			if(rSet.next())
			{
				hBean=new HotelBean();
				hBean.setCid(rSet.getString(1));
				hBean.setCname(rSet.getString(2));
				hBean.setCaddress(rSet.getString(3));
				hBean.setCmail(rSet.getString(4));
				hBean.setCphone(rSet.getString(5));
				hBean.setCstate(rSet.getString(6));
				hBean.setCcountryString(rSet.getString(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hBean;
		
	}
}
