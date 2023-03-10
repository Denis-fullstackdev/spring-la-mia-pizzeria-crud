package com.corsojava.springcrud.model;


import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name="pizze")
public class Pizza {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message="Inserire nome - Campo obbligatorio")
	@NotEmpty(message="Inserire nome - Campo obbligatorio")
	@Size(min=5, max=40, message="Il nome deve essere di minimo 5 caratteri e massimo 40 caratteri")
	private String nome;
	
	@NotNull(message="Inserire descrizione - Campo obbligatorio")
	@NotEmpty(message="Inserire descrizione - Campo obbligatorio")
	private String descrizione;
	
	private String foto;
	
	@NotNull(message="Inserire prezzo - Campo obbligatorio")
	@DecimalMin(value="0.1", message="Prezzo non può essere negativo o zero")
	private BigDecimal prezzo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public BigDecimal getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
