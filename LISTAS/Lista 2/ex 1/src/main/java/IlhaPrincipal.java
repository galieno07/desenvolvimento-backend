
import com.example.ex02.IlhaDeCalor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
@RequestMapping("/ilhas-de-calor")
public class IlhaPrincipal {
 
	
	private List<IlhaDeCalor> ilhadecalor = new ArrayList<>();
	
	@GetMapping
	public List<IlhaDeCalor> listarIlhaDeCalor() {
		return (ilhadecalor);
	}	
	@PostMapping
		public String adicionarIlhaDeCalor(IlhaDeCalor ilha) {
        ilhadecalor.add(ilha);
        return ("Ilha de calor " + ilha.getBairro() + " ta maruoc adicionada com sucesso!");
		}	
		
	public static void main(String[] args) {
		SpringApplication.run(IlhaPrincipal.class, args);
	}

	
}
