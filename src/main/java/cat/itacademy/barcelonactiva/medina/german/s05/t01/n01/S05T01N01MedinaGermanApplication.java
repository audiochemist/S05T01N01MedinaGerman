package cat.itacademy.barcelonactiva.medina.german.s05.t01.n01;

import cat.itacademy.barcelonactiva.medina.german.s05.t01.n01.model.domain.Branch;
import cat.itacademy.barcelonactiva.medina.german.s05.t01.n01.model.repository.BranchRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class S05T01N01MedinaGermanApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}


	public static void main(String[] args) {
		SpringApplication.run(S05T01N01MedinaGermanApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataDemo (BranchRepository branchRepository) {
		return args -> {
			branchRepository.save(new Branch("BHJ", "Spain"));
		};
	}

}
