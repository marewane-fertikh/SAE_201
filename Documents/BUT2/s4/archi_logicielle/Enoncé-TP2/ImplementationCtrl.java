package fr.info.annotations.controleur;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

public class ImplementationCtrl implements InterfaceCtrl {
  
  @Value("${message}") private String message;

  /*
   * Implementation de l'interface
   */

}
