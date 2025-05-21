package fr.info.annotations.controleur;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

public class ImplementationCtrl implements InterfaceCtrl {
  
  @Value("${message}") private String message;
      
  public ImplementationCtrl() {
    init();
  }
  public void init() {
    String n[]={"tom","olive","tintin","asterix","lucky luke","gargamel"};
    String e[]={"jerry","popeye","milou","obelix","jolly jumper","azrael"};
    String c[]={"tom.jerry@gmail.com","olive.popeye@gmail.com","tintin.milou@gmail.com",
                "asterix.obelix@gmail.com","lucky.jolly@gmail.com","gargamel.azrael@gmail.com"};
  }
  
  /*
   * Implementation de l'interface
   */
  @Override
  public String bienvenue() {
    return "bienvenue";
  }

  
}
