package nl.youngcapital.casus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Casus {
	@Id
	@GeneratedValue
	private Long id;
	private String naam;
	private Long kluisinhoud;
	
	
	
	
	public Casus() {}
	public Casus(Long id, String naam, Long kluisinhoud) {
		super();
		this.id = id;
		this.naam = naam;
		this.kluisinhoud = kluisinhoud;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public Long getKluisinhoud() {
		return kluisinhoud;
	}
	public void setKluisinhoud(Long kluisinhoud) {
		this.kluisinhoud = kluisinhoud;
	}
	
}
