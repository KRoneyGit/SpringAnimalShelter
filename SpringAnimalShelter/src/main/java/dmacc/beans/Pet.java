package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
* @author Kevin Roney - karoney
* CIS 175 - Fall 2023
* Mar 9, 2023
*/
@Entity
public class Pet {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String breed;
	private int age;
	@Autowired
	private Owner owner;
	/**
	 * default no arg constructor
	 */
	public Pet() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param breed
	 * @param age
	 * @param owner
	 */
	public Pet(String name, String breed, int age, Owner owner) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.owner = owner;
	}
	
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
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", breed=" + breed + ", age=" + age + ", owner=" + owner + "]";
	}
}
