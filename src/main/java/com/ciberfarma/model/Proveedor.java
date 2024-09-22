package com.ciberfarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_proveedor")
public class Proveedor {
	@Id
	private int idproveedor;
	private String nombre_rs;
	private String telefono;
	private String email;
}
