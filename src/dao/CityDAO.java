package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.City;
import utility.ConnectionManager;

public class CityDAO{
	public void addDetails(City city) throws Exception {
		Long id = city.getCityId();
		String name = city.getCityNme();
		
		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();
		
		String sql = "INSERT INTO CITY (ID,NAME) VALUES (?,?)";
		
		PreparedStatement pst = con.prepareStatement(sql);
		
		pst.setLong(1, id);
		pst.setString(2, name);
		pst.executeUpdate();		
		con.close();
	}
}