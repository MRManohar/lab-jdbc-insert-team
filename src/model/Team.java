package model;

public class Team{
	private long id;
	private String name;
	private String coach;
	private String captain;
	private City city;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Team(long id, String name, String coach, String captain, City city) {
		this.id = id;
		this.name = name;
		this.coach = coach;
		this.captain = captain;
		this.city = city;
	}
}