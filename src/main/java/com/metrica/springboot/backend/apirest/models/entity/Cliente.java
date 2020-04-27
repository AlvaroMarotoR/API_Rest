package com.metrica.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//Gracias al Serializable, esta clase representa una tabla.
@Entity //Permite que sea una entidad, una tabla.
@Table(name="cliente") //Nombres de tablas comienzan por minuscula, si no se pone, el nombre de la tabla es el de la clase.
public class Cliente implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Con el Identity, se autoincrementa.
	private Long id;
	
	
	private String nombre;
	private String apellido;
	private String email;
	
	//Se puede saltar en caso de que el nombre dela tributo sea igual que el de la columna
	//También se usa para darle un largo etc...
	@Column(name="creado_En")
	@Temporal(TemporalType.DATE) //Temporal para los datos tipo fecha.
	private Date creadoEn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreadoEn() {
		return creadoEn;
	}

	public void setCreadoEn(Date creadoEn) {
		this.creadoEn = creadoEn;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
