package org.eclipse.classes;

public class Salle {
	private int id;
	private String code; 
	private String libelle;
	private static int count; 
	
	public Salle() {
		super();
		this.id = count ++;	
	}
	public Salle(String code, String libelle) {
		super();
		this.id = count++;
		this.code = code;
		this.libelle = libelle;
		
	}
	
	public Salle(int id, String code, String libelle) {
		super();
		this.id = count++;
		this.code = code;
		this.libelle = libelle;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return this.code + " " + this.libelle;
	}


}
