package com.orion.portafolio2017.entity;
// Generated 29-10-2017 16:52:28 by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * MotivoModel generated by hbm2java
 */
@Entity
@Table(name = "motivo")
public class Motivo implements java.io.Serializable {

	@Id
	@Column(name = "id_motivo", unique = true, nullable = false, precision = 8, scale = 0)
	private int idMotivo;

	@Column(name = "descripcion_motivo", nullable = false)
	private String descripcionMotivo;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "motivo")
	private Set<Permiso> permisos = new HashSet<Permiso>();

	public Motivo() {
	}

	public Motivo(int idMotivo, String descripcionMotivo) {
		this.idMotivo = idMotivo;
		this.descripcionMotivo = descripcionMotivo;
	}

	public Motivo(int idMotivo, String descripcionMotivo, Set<Permiso> permisos) {
		super();
		this.idMotivo = idMotivo;
		this.descripcionMotivo = descripcionMotivo;
		this.permisos = permisos;
	}

	public Motivo(int idMotivo2) {
		// TODO Auto-generated constructor stub
	}

	public int getIdMotivo() {
		return this.idMotivo;
	}

	public void setIdMotivo(int idMotivo) {
		this.idMotivo = idMotivo;
	}

	public String getDescripcionMotivo() {
		return this.descripcionMotivo;
	}

	public void setDescripcionMotivo(String descripcionMotivo) {
		this.descripcionMotivo = descripcionMotivo;
	}

	public Set<Permiso> getPermisos() {
		return permisos;
	}

	public void setPermisos(Set<Permiso> permisos) {
		this.permisos = permisos;
	}

}
