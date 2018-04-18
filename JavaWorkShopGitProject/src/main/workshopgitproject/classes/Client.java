/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.classes;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Client.
 * 
 * @author Ricardo
 */
public class Client {
	/**
	 * Description of the property village.
	 */
	private String village = "";

	/**
	 * Description of the property identifier.
	 */
	private int identifier = 0;

	/**
	 * Description of the property province.
	 */
	private String province = "";

	/**
	 * Description of the property country.
	 */
	private String country = "";

	/**
	 * Description of the property streetName.
	 */
	private String streetName = "";

	/**
	 * Description of the property invoices.
	 */
	public HashSet<Invoice> invoices = new HashSet<Invoice>();

	/**
	 * Description of the property name.
	 */
	private String name = "";

	/**
	 * Description of the property surname.
	 */
	private String surname = "";

	/**
	 * Description of the property dni.
	 */
	private String dni = "";

	/**
	 * Description of the property streetNumber.
	 */
	private int streetNumber = 0;

	// Start of user code (user defined attributes for Client)

	// End of user code

	/**
	 * The constructor.
	 */
	public Client() {
		// Start of user code constructor for Client)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Client)

	// End of user code
	/**
	 * Returns village.
	 * @return village 
	 */
	public String getVillage() {
		return this.village;
	}

	/**
	 * Sets a value to attribute village. 
	 * @param newVillage 
	 */
	public void setVillage(String newVillage) {
		this.village = newVillage;
	}

	/**
	 * Returns identifier.
	 * @return identifier 
	 */
	public int getIdentifier() {
		return this.identifier;
	}

	/**
	 * Sets a value to attribute identifier. 
	 * @param newIdentifier 
	 */
	public void setIdentifier(int newIdentifier) {
		this.identifier = newIdentifier;
	}

	/**
	 * Returns province.
	 * @return province 
	 */
	public String getProvince() {
		return this.province;
	}

	/**
	 * Sets a value to attribute province. 
	 * @param newProvince 
	 */
	public void setProvince(String newProvince) {
		this.province = newProvince;
	}

	/**
	 * Returns country.
	 * @return country 
	 */
	public String getCountry() {
		return this.country;
	}

	/**
	 * Sets a value to attribute country. 
	 * @param newCountry 
	 */
	public void setCountry(String newCountry) {
		this.country = newCountry;
	}

	/**
	 * Returns streetName.
	 * @return streetName 
	 */
	public String getStreetName() {
		return this.streetName;
	}

	/**
	 * Sets a value to attribute streetName. 
	 * @param newStreetName 
	 */
	public void setStreetName(String newStreetName) {
		this.streetName = newStreetName;
	}

	/**
	 * Returns invoices.
	 * @return invoices 
	 */
	public HashSet<Invoice> getInvoices() {
		return this.invoices;
	}

	/**
	 * Returns name.
	 * @return name 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets a value to attribute name. 
	 * @param newName 
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 * Returns surname.
	 * @return surname 
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * Sets a value to attribute surname. 
	 * @param newSurname 
	 */
	public void setSurname(String newSurname) {
		this.surname = newSurname;
	}

	/**
	 * Returns dni.
	 * @return dni 
	 */
	public String getDni() {
		return this.dni;
	}

	/**
	 * Sets a value to attribute dni. 
	 * @param newDni 
	 */
	public void setDni(String newDni) {
		this.dni = newDni;
	}

	/**
	 * Returns streetNumber.
	 * @return streetNumber 
	 */
	public int getStreetNumber() {
		return this.streetNumber;
	}

	/**
	 * Sets a value to attribute streetNumber. 
	 * @param newStreetNumber 
	 */
	public void setStreetNumber(int newStreetNumber) {
		this.streetNumber = newStreetNumber;
	}

}
