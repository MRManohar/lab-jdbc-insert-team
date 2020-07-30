package controller;

import java.util.Scanner;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

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
	private static void displayData() {
	}
}