package com.ciberfarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name = "tb_tipos")
@Data
public class Tipo {
	@Id
	private int idtipo;
	private String descripcion;
}
