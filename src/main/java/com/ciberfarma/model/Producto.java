package com.ciberfarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_productos")
public class Producto {
	@Id
	private String id_prod;
	private String des_prod;
	private int stk_prod;
	private double pre_prod;
	private int idcategoria;
	private int est_prod;
	private int idproveedor;

	@ManyToOne
	@JoinColumn(name = "idproveedor", insertable = false, updatable = false)
	private Proveedor objProv;
	
	@ManyToOne
	@JoinColumn(name = "idcategoria", insertable = false, updatable = false)
	private Categoria objCate;
}
