package fr.info.annotations.controleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*
 * injection des dependances
 */

public interface InterfaceCtrl {

	@GetMapping("/bienvenue")
    public String bienvenue();

}
