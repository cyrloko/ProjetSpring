package fr.demo.controler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.demo.beans.CommandeImpl;
import fr.demo.beans.PersonneImpl;
import fr.demo.interfaces.Personne;

@Component
@RestController
@RequestMapping(path = "/dev")
public class ControlerDispatcher {

	@GetMapping
	public String index() {
		return "Le serveur fonctionne";
	}
	
	@GetMapping(path = "/jim")
	public Personne getPersonne() {
		PersonneImpl p = new PersonneImpl();
		p.setId(1);
		p.setName("jim");
		p.setCommandes(new ArrayList<CommandeImpl>(Arrays.asList(new CommandeImpl())));
		p.setAdresseMail("jim@mail.fr");
		p.setNaissance(new Date());
		
		return p;
		
	}
}
