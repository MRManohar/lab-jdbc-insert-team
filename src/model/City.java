package model;

public class City{
	private long cityId;
	private String cityNme;
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	public String getCityNme() {
		return cityNme;
	}
	public void setCityNme(String cityNme) {
		this.cityNme = cityNme;
	}
	public City(long cityId, String cityNme) {
		this.cityId = cityId;
		this.cityNme = cityNme;
	}
}
