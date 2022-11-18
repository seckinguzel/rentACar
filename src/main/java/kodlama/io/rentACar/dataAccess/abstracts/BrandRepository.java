package kodlama.io.rentACar.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	//JpaRepository provides almost all methods. So we did not write any method to here.
	//Also JpaRepository runs in generic type so it creates a implemented class in memory so we wont need a concrete. In this scenario Spring is being to prepared concrete in the memory. 
}
