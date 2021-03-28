package fr.demo.beans;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import fr.demo.interfaces.Personne;

@Component
public class PersonneImpl implements Personne {
	
	int id;
	String name;	
	Date naissance;	
	String adresseMail;	
	List<CommandeImpl> commandes;
	
	
	@Override
	public void passerCommande() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void supprimerCommande() {
		// TODO Auto-generated method stub
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getNaissance() {
		return naissance;
	}
	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}
	public String getAdresseMail() {
		return adresseMail;
	}
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	public List<CommandeImpl> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<CommandeImpl> commandes) {
		this.commandes = commandes;
	}
	
	
	
}
