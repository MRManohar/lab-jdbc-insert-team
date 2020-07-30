package dao;

import java.sql.PreparedStatement;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
	public void addDetails(Team team) throws Exception {
		Long id = team.getId();
		String name = team.getName();
		String coach = team.getCoach();
		String captain = team.getCaptain();
		Long cityId = team.getCity().getCityId();
		String cityName = team.getCity().getCityNme();
		
		ConnectionManager cm = new ConnectionManager();
		String sql = "INSERT INTO TEAM (ID,NAME,COACH,CAPTAIN,CITY_ID,CITY_NAME) VALUES (?,?,?,?,?,?)";
		
		PreparedStatement pst = cm.getConnection().prepareStatement(sql);
		
		pst.setLong(1, id);
		pst.setString(2, name);
		pst.setString(3, coach);
		pst.setString(4, captain);
		pst.setLong(5, cityId);
		pst.setString(6, cityName);
		
		pst.executeUpdate();

		cm.getConnection().close();
	}
}
