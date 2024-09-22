package com.ciberfarma.model;




import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_usuarios")
@Data
public class Usuario {
	@Id
	private int cod_usua;
	private String nom_usua;
	private String ape_usua;
	private String usr_usua;
	private String cla_usua;
	private String fna_usua;
	private int idtipo;
	private int est_usua;
	
	@ManyToOne
	@JoinColumn(name = "idtipo", insertable = false, updatable = false)
	private Tipo objTipo;
}
