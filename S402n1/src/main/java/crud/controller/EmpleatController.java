package crud.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import crud.entity.EmpleatDTO;
import crud.service.GestioEmpleats;
import crud.service.IGestioEmpleats;

@RestController
public class EmpleatController {
	
	private IGestioEmpleats gestioEmpleats;
	
	public EmpleatController() {
		gestioEmpleats = new GestioEmpleats();
	}
	
	
	@GetMapping(value = "salari/{feina}")
	public ResponseEntity<Double> readSalari( @PathVariable("feina") String feina ) {
		
		double salari = gestioEmpleats.readSalari(feina);
	
		if (salari > -1) {
			return ResponseEntity.ok().body(salari);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping(value = "empleats/{feina}")
	public ResponseEntity<List<EmpleatDTO>> readEmpleats( @PathVariable("feina") String feina ) {
		
		List<EmpleatDTO> empleatsFeina = gestioEmpleats.readEmpleats(feina);
		
		if (empleatsFeina.size() > 0) {
			return ResponseEntity.ok().body(empleatsFeina);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping(value = "empleats")
	public ResponseEntity<List<EmpleatDTO>> readEmpleats(){
		return ResponseEntity.ok(gestioEmpleats.readEmpleats()); 
	}
	
	
	@PutMapping(value = "empleats")
	public ResponseEntity<EmpleatDTO> update(EmpleatDTO empleatRequest){
		
		EmpleatDTO empleat = gestioEmpleats.updateEmpleat(empleatRequest);
		
		if( empleat != null) {
			return ResponseEntity.ok().body(empleat);
		} else {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@PostMapping(value = "empleats")
	public ResponseEntity<EmpleatDTO> create(EmpleatDTO empleatRequest){
		
		EmpleatDTO empleat = gestioEmpleats.createEmpleat(empleatRequest);
		
		if( empleat != null) {
			return ResponseEntity.ok().body(empleat);
		} else {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@DeleteMapping(value = "empleats/{empleatId}")
	public ResponseEntity<?> delete( @PathVariable("empleatId") Integer empleatId ) {
		
		if (gestioEmpleats.deleteEmpleat(empleatId) >= 0) {
			return ResponseEntity.ok().build();
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
