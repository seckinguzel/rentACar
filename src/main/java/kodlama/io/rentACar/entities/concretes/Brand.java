package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands") //assign below table to the brands in postgre data base. Brand corresponds to brands in postgre data base.
@Entity //Entity annotation says Brand structure is a database object.
//We had used lombok in this project. Lombok annotations are in the below. Lombok provides a clean code.
// @Data //Lombok creates getters and setters and all other methods for the attributes so we dont need to conclude methods manually.
@Getter //Lombok creates getters.
@Setter //Lombok creates setters.
@AllArgsConstructor //Lombok creates a paramethers constructor.
@NoArgsConstructor //Lombok creates a empty constructor.
public class Brand {
	
	@Id //Id annotation says, you are a primary key in data base.
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Id automatic increases.
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
}
