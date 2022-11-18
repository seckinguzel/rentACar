package kodlama.io.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service //This class is a business object.
public class BrandManager implements BrandService {
	
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}
	
	@Override
	public List<GetAllBrandsResponse> getAll(){
		//Business Rules
		//We dont want to show all entity datas to the user. So we are going to do below actions.
		List<Brand> brands = brandRepository.findAll(); //ben buradaki listeyi satır 25 deki listenin tipine (GetAllBrandsResponse) çevirmem gerekiyor.
		List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>(); //Burada boş bir liste oluşturuyorum.
		
		for (Brand brand : brands) { //Ana listeyi dolaşıyorum 
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse(); //responseItem tanımlıyorum.
			responseItem.setId(brand.getId()); //Her seferinde her markanın id'sini ve satır 34'de ki gibi name'ini responseItem'a set ediyorum.
			responseItem.setName(brand.getName());
			
			brandsResponse.add(responseItem); //responseItem'dan aldıklarımı brandsResponse adlı boş listeme add yap. Satır 39'da da bunu döndür diyorum. 
		}
		
		return brandsResponse;
	}
	
	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = new Brand(); //Bir brand oluşturduk.
		brand.setName(createBrandRequest.getName()); //Bu brand'in setName'i createBrandRequest'den gelen name'dir.
		
		this.brandRepository.save(brand); //Bu brand'i de brandRepository'ye save edeceğim.
	}
	
}
