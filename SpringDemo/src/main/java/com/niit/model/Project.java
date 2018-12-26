package com.niit.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Project {

	//private Technology tech;
	private int projId;
	private String projName;
	private Technology tech;
	
	
	
	public Project() {}
	
	
	/**
	 * @param projId
	 * @param projName
	 * @param tech
	 */
	
	public Project(int projId, String projName, Technology tech) {
		super();
		this.projId = projId;
		this.projName = projName;
		this.tech = tech;
	}
	/**
	 * @return the tech
	 */
	public Technology getTech() {
		return tech;
	}
	/**
	 * @param tech the tech to set
	 */
	public void setTech(Technology tech) {
		this.tech = tech;
	}
	/**
	 * @return the projId
	 */
	public int getProjId() {
		return projId;
	}
	/**
	 * @param projId the projId to set
	 */
	public void setProjId(int projId) {
		this.projId = projId;
	}
	/**
	 * @return the projName
	 */
	public String getProjName() {
		return projName;
	}
	/**
	 * @param projName the projName to set
	 */
	public void setProjName(String projName) {
		this.projName = projName;
	}
	
	
	public void display() {
		System.out.println(" project id "+projId);
		System.out.println(" project Name "+projName);
		tech.display();
	}
}
