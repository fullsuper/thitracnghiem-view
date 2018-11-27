package grouptwo.quizexam.Model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Profilestudent generated by hbm2java
 */
public class Profilestudent implements java.io.Serializable {

	private String user;
	private Users users;
	private String name;
	private int identityCardNumber;
	private Date dateOfBirth;
	private String gender;
	private String email;
	private int phoneNumber;
	private String country;
	private String address;
	private String religion;
	private Date yearOfAdmission;
	private Date yearOfGraduation;
	private String image;
	private byte showProfile;
	private Set classeses = new HashSet(0);
	private Set resulttestses = new HashSet(0);

	public Profilestudent() {
	}

	public Profilestudent(Users users, String name, int identityCardNumber, Date dateOfBirth, String gender,
			String email, int phoneNumber, String country, Date yearOfAdmission, Date yearOfGraduation,
			byte showProfile) {
		this.users = users;
		this.name = name;
		this.identityCardNumber = identityCardNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.yearOfAdmission = yearOfAdmission;
		this.yearOfGraduation = yearOfGraduation;
		this.showProfile = showProfile;
	}

	public Profilestudent(Users users, String name, int identityCardNumber, Date dateOfBirth, String gender,
			String email, int phoneNumber, String country, String address, String religion, Date yearOfAdmission,
			Date yearOfGraduation, String image, byte showProfile, Set classeses, Set resulttestses) {
		this.users = users;
		this.name = name;
		this.identityCardNumber = identityCardNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.address = address;
		this.religion = religion;
		this.yearOfAdmission = yearOfAdmission;
		this.yearOfGraduation = yearOfGraduation;
		this.image = image;
		this.showProfile = showProfile;
		this.classeses = classeses;
		this.resulttestses = resulttestses;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdentityCardNumber() {
		return this.identityCardNumber;
	}

	public void setIdentityCardNumber(int identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Date getYearOfAdmission() {
		return this.yearOfAdmission;
	}

	public void setYearOfAdmission(Date yearOfAdmission) {
		this.yearOfAdmission = yearOfAdmission;
	}

	public Date getYearOfGraduation() {
		return this.yearOfGraduation;
	}

	public void setYearOfGraduation(Date yearOfGraduation) {
		this.yearOfGraduation = yearOfGraduation;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public byte getShowProfile() {
		return this.showProfile;
	}

	public void setShowProfile(byte showProfile) {
		this.showProfile = showProfile;
	}

	public Set getClasseses() {
		return this.classeses;
	}

	public void setClasseses(Set classeses) {
		this.classeses = classeses;
	}

	public Set getResulttestses() {
		return this.resulttestses;
	}

	public void setResulttestses(Set resulttestses) {
		this.resulttestses = resulttestses;
	}

}