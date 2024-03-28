package AvaliacaoFormativaMarco.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AvaliacaoFormativaMarco.Service.AlunoService;
import AvaliacaoFormativaMarco.entities.Aluno;

@RestController
	@RequestMapping("/aluno")
	@CrossOrigin(origins = "*")
	public class AlunoController {
		
	private final AlunoService alunoService;
		
		@Autowired
		public AlunoController (AlunoService alunoService) {
			this.alunoService = alunoService;
		}
		
	    @GetMapping("/{id}")
	    public ResponseEntity <Aluno> buscaalunoIdControlId(@PathVariable Long id){
	        Aluno aluno = alunoService.getalunoById(id);
	        if(aluno!= null) {
	            return ResponseEntity.ok(aluno);
	        }
	        else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	    
	    @GetMapping
	    public ResponseEntity<List<Aluno>> buscaTodosalunoControl() {
	        List<Aluno> aluno = alunoService.getAllaluno();
	 
	        return ResponseEntity.ok(aluno);
	    }
	      
		
	    @PostMapping("/")
	    public ResponseEntity<Aluno> criaraluno(@RequestBody Aluno aluno) {
	    	Aluno criaraluno = alunoService.savealuno(aluno);
	        return ResponseEntity.status(HttpStatus.CREATED).body(criaraluno);
	    }
	    
	    @PutMapping("/{id}")
	    public ResponseEntity<Aluno> updatealuno(@PathVariable Long id, @RequestBody Aluno aluno) {
	    	Aluno updatedaluno = alunoService.updatealuno(id, aluno);
	        if (updatedaluno != null) {
	            return ResponseEntity.ok(updatedaluno);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<String> deletealuno(@PathVariable Long id) {
	        boolean deleted = alunoService.deletealuno(id);
	        if (deleted) {
	        	 return ResponseEntity.ok().body("A aluno foi excluída com sucesso.");
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	}


