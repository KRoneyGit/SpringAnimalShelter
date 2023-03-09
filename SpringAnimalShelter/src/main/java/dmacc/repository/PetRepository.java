package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Pet;

/**
* @author Kevin Roney - karoney
* CIS 175 - Fall 2023
* Mar 7, 2023
*/
@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

}