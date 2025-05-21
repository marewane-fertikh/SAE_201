package fr.info.annotations.controleur;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * injection des dépendances
 */
@RestController
public class Controleur {
  
	@GetMapping("/bienvenue")
    public String bienvenue(){
      return "bienvenue";
    }

}
