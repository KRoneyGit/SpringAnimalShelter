package dmacc.beans;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
* @author Kevin Roney - karoney
* CIS 175 - Fall 2023
* Mar 9, 2023
*/
@Embeddable
public class Owner {
//	@Id
//	@GeneratedValue
	private int ownerId;
	private String ownerName;
	private int petCount;
	
	/**
	 * default no arg constructor
	 */
	public Owner() {
		super();
	}
	/**
	 * @param ownerId
	 * @param ownerName
	 * @param petCount
	 */
	public Owner(int ownerId, String ownerName, int petCount) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.petCount = petCount;
	}
	
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getPetCount() {
		return petCount;
	}
	public void setPetCount(int petCount) {
		this.petCount = petCount;
	}
	
	@Override
	public String toString() {
		return "Owner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", petCount=" + petCount + "]";
	}
}
