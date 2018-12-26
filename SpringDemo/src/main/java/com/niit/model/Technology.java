package com.niit.model;

public class Technology {

	 private String TechName;
	 private String Version;
	/**
	 * @return the techName
	 */
	public String getTechName() {
		return TechName;
	}
	/**
	 * @param techName the techName to set
	 */
	public void setTechName(String techName) {
		TechName = techName;
	}
	/**
	 * @return the version
	 */
	public String getVersion() {
		return Version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		Version = version;
	}
	 
	 public void display() {
		 
		 System.out.println("Technology Name: "+ this.TechName);
		 System.out.println("Technology Version: "+ this.Version);
	 }
}
