package br.com.atividade.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("jpatest");
		f.close();
		System.out.println("Terminei!!");

	}

}
