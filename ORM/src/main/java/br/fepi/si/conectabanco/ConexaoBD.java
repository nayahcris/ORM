package br.fepi.si.conectabanco;

import javax.persistence.Persistence;

public class ConexaoBD {
	
	public static void main(String[] args) {
		
		try {
			Persistence.createEntityManagerFactory("BebidaPU");
			System.out.println("Sucesso na conexão");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Falha na conexão");
		}
	}

}
