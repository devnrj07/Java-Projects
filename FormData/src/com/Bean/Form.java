package com.Bean;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "Form")
public class Form {
	
	private String orderId;
	private String FirstName;
	private String LastName;
	private String Email;
	private String T_Model;
	private String Size;
	private String Quantity;
	private LocalDate DeliveryDate;
	private String Address1;
	private String Address2;
	private String City;
	private String State;
	private String zipcode;
	private String country;
	
	
	
	//==============================================Constructors============================================
	
	public Form() {}
	
	
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param t_Model
	 * @param size
	 * @param quantity
	 * @param deliveryDate
	 * @param address1
	 * @param address2
	 * @param city
	 * @param state
	 * @param zipcode
	 * @param country
	 */
	public Form(String orderid,String firstName, String lastName, String email, String t_Model, String size, String quantity,
			LocalDate deliveryDate, String address1, String address2, String city, String state, String zipcode,
			String country) {
		super();
		this.orderId=orderid;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Email = email;
		this.T_Model = t_Model;
		this.Size = size;
		this.Quantity = quantity;
		this.DeliveryDate = deliveryDate;
		this.Address1 = address1;
		this.Address2 = address2;
		this.City = city;
		this.State = state;
		this.zipcode = zipcode;
		this.country = country;
	}
	//=================================================Getter & Setter===================================================
	/**
	 * @return the firstName
	 */
	
	
	
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @return the orderId
	 */
	

	public String getOrderId() {
		return orderId;
	}



	/**
	 * @param orderId the orderId to set
	 */
	@XmlElement
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}



	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @return the t_Model
	 */
	public String getT_Model() {
		return T_Model;
	}
	/**
	 * @param t_Model the t_Model to set
	 */
	public void setT_Model(String t_Model) {
		T_Model = t_Model;
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return Size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		Size = size;
	}
	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return Quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	/**
	 * @return the deliveryDate
	 */
	public LocalDate getDeliveryDate() {
		return DeliveryDate;
	}
	/**
	 * @param deliveryDate the deliveryDate to set
	 */
	@XmlAttribute
	public void setDeliveryDate(LocalDate deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return Address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		Address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return Address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return State;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}
	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
	

}
