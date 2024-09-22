package com.ciberfarma.app;

import java.util.List;

import com.ciberfarma.model.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Demo02 {
	private static final String Blanco = "\u001B[37m"; 
    private static final String Verde = "\u001B[32m"; 
    private static final String Purpura = "\u001B[35m";
	public static void main(String[] args) {

		EntityManagerFactory conexion = Persistence.createEntityManagerFactory("jpa_sesion02");
		EntityManager em = conexion.createEntityManager();
		// sql = "select * from tb_usuarios where idtipo = ?"
		// jpql = "select u from Usuario u where idtipo = 1"
		List<Producto> lstProductos = em.createQuery("select u from Producto u").getResultList();
		System.out.println(Purpura + "I" + Verde + "-------------------------------" + Purpura + "I" + Blanco);
		for (Producto p : lstProductos) {
			System.out.println("Descripcion.........: " + p.getDes_prod());
			System.out.println("Stock...............: " + p.getStk_prod());
			System.out.println("Precio..............: " + p.getPre_prod());
			System.out.println("Estado..............: " + p.getEst_prod());
			System.out.println("Proveedor...........: " + p.getObjProv().getNombre_rs());
			System.out.println("Telefono Proveedor..: " + p.getObjProv().getTelefono());
			System.out.println("Email Proveedor.....: " + p.getObjProv().getEmail());
			System.out.println("Categoria...........: " + p.getObjCate().getDescripcion());
			System.out.println(Purpura + "I" + Verde + "-------------------------------" + Purpura + "I" + Blanco);
		}
	}
}
