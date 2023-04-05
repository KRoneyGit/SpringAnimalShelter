package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Owner;
import dmacc.beans.Pet;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PetRepository;

@SpringBootApplication
public class SpringAnimalShelterApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringAnimalShelterApplication.class, args);
	}
	
	@Autowired
	PetRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new	AnnotationConfigApplicationContext(BeanConfiguration.class);
		
//		Owner o1 = appContext.getBean("owner", Owner.class);
//		Owner o2 = appContext.getBean("owner", Owner.class);
		Owner o1 = new Owner();
		Owner o2 = new Owner();
		
		o1.setOwnerId(1);
		o1.setOwnerName("Kevin");
		o1.setPetCount(3);
		
		o2.setOwnerId(2);
		o2.setOwnerName("Kati");
		o2.setPetCount(3);

//		Pet pet1 = new Pet("Haven", "Siberian Husky", 5, o1);
//		repo.save(pet1);
//		Pet p1 = appContext.getBean("pet", Pet.class);
		Pet p1 = new Pet();
		p1.setName("Haven");
		p1.setBreed("Siberian Husky");
		p1.setAge(5);
		p1.setOwner(o1);
		repo.save(p1);
		
//		Pet pet2 = new Pet("Havek", "German Shepherd", 3, o1);
//		repo.save(pet2);
//		Pet p2 = appContext.getBean("pet", Pet.class);
		Pet p2 = new Pet();
		p2.setName("Havek");
		p2.setBreed("German Shepherd");
		p2.setAge(3);
		p2.setOwner(o1);
		repo.save(p2);

//		Pet pet3 = new Pet("Zuli", "Siberian Husky", 2, o1);
//		repo.save(pet3);
//		Pet p3 = appContext.getBean("pet", Pet.class);
		Pet p3 = new Pet();
		p3.setName("Zuli");
		p3.setBreed("Siberian Husky");
		p3.setAge(2);
		p3.setOwner(o1);
		repo.save(p3);

		Pet pet4 = new Pet("Lexi", "Black Lab", 3, o2);
		repo.save(pet4);
		Pet pet5 = new Pet("Luke", "Corgi", 5, o2);
		repo.save(pet5);
		Pet pet6 = new Pet("Lexi", "Corgi", 1, o2);
		repo.save(pet6);
		
		List<Pet> allMyPets = repo.findAll();
		for(Pet pet : allMyPets) {
			System.out.println(pet.toString());
		}
		((AbstractApplicationContext)appContext).close();
	}
	
}
