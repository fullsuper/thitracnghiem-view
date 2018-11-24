package grouptwo.quizexam.Model;

import java.util.HashSet;
import java.util.Set;

/**
 * Subjects generated by hbm2java
 */
public class Subjects implements java.io.Serializable {

	private Integer id;
	private String name;
	private String faculty;
	private int credit;
	private String type;
	private byte activate;
	private Set classeses = new HashSet(0);

	public Subjects() {
	}

	public Subjects(String name, String faculty, int credit, String type, byte activate) {
		this.name = name;
		this.faculty = faculty;
		this.credit = credit;
		this.type = type;
		this.activate = activate;
	}

	public Subjects(String name, String faculty, int credit, String type, byte activate, Set classeses) {
		this.name = name;
		this.faculty = faculty;
		this.credit = credit;
		this.type = type;
		this.activate = activate;
		this.classeses = classeses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFaculty() {
		return this.faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getCredit() {
		return this.credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte getActivate() {
		return this.activate;
	}

	public void setActivate(byte activate) {
		this.activate = activate;
	}

	public Set getClasseses() {
		return this.classeses;
	}

	public void setClasseses(Set classeses) {
		this.classeses = classeses;
	}

}
