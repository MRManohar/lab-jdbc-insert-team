package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;
import utility.ConnectionManager;

public class Main{
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter yuor choice\n1.Insert Data\n2.Display Data\n");
		int choice = in.nextInt();
		
		TeamDAO teamDAO = new TeamDAO();
		CityDAO cityDAO = new CityDAO();
		
		switch(choice) {
		case 1:
			System.out.println("Enter team ID");
			Long id = in.nextLong();
			System.out.println("Enter Name");
			String name = in.next();
			System.out.println("Enter coach name");
			String coach = in.next();
			System.out.println("Enter captain name");
			String captain = in.next();
			System.out.println("Enter city ID");
			Long cityID = in.nextLong();
			System.out.println("Enter city name");
			String cityName = in.next();
			
			City city = new City(cityID,cityName);
			Team team = new Team(id,name,coach,captain,city);
			
			cityDAO.addDetails(city);
			teamDAO.addDetails(team);
			break;
		case 2:
			displayData();
			break;
		}
		
		in.close();
	}
	private static void displayData() throws Exception {
		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();
		
		String sql = "select * from team";
		
		Statement st = con.createStatement();
		
		ResultSet re = st.executeQuery(sql);
		
		while(re.next()) {
			System.out.println(re.getString(2)+"\t"+re.getString(3)+"\t"+re.getString(6));
		}
		
		con.close();
	}
}