package com.ciberfarma.app;

import java.util.List;

import com.ciberfarma.model.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Demo01_Listado_Combinado {
	public static void main(String[] args) {

		EntityManagerFactory conexion = Persistence.createEntityManagerFactory("jpa_sesion02");
		EntityManager em = conexion.createEntityManager();
		// sql = "select * from tb_usuarios where idtipo = ?"
		// jpql = "select u from Usuario u where idtipo = 1"
	
		int tipo = 2;
		List<Usuario> lstUsuarios = em.createQuery("select u from Usuario u").getResultList();
		for (Usuario u : lstUsuarios) {
			System.out.println("Nombre...: " + u.getNom_usua() + " " + u.getApe_usua());
			System.out.println("Email....: " + u.getUsr_usua());
			System.out.println("Clave....: " + u.getCla_usua());
			System.out.println("Fch nac..: " + u.getFna_usua());
			System.out.println("Tipo.....: " + u.getIdtipo());
			System.out.println("Descripcion.....: " + u.getObjTipo().getDescripcion());
			System.out.println("Estado...: " + u.getEst_usua());
			System.out.println("-------------------------------");
		}
	}
}
