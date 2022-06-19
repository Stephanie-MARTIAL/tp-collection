package org.eclipse.main;

import java.util.List;

import org.eclipse.classes.Salle;
import org.eclipse.services.SalleService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalleService salleService = new SalleService();
		
		salleService.create(new Salle("A", "Salle1"));
		salleService.create(new Salle("B", "Salle2"));
		salleService.create(new Salle("C", "Salle3"));
		salleService.create(new Salle("D", "Salle4"));
		
		System.out.println("La liste des salles");
		
		List<Salle> salles = salleService.findAll();
		
		for(Salle s : salles) {
			System.out.println(s);
		}
	
		// salleService.findAll().forEach((salle-> System.out.println(salle));
		
		System.out.println("------------------------------------------");
		
		// trouver une salle à partir d'un id
		Salle s3 = salleService.findById(3);
		System.out.println(s3);
		
		// suppression de salle
		salleService.delete(salleService.findById(2));
		for(Salle s : salles) {
			System.out.println(s);
		}
		
		salles = salleService.findAll();
		System.out.println(salles);
		
		// mettre à jour une salle 
		
		Salle salle = salleService.findById(3);
		salle.setCode("Y");
		
		salleService.update(salle);
		
		for(Salle s : salles) {
			System.out.println(s);
		}
		
	}

}
