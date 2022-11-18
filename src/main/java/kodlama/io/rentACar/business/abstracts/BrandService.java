package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

//Buradan itibaren veritabanı nesnesi kullanmak yasak. Çünkü her datayı son kullanıcıya göstermek istemiyorum.
public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);
}
