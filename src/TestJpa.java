import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entite.Livre;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo_jpa");
		EntityManager em = factory.createEntityManager();
		
		Livre livre1 = em.find(Livre.class, 1);
		
		System.out.println(livre1);
		
		/*
		TypedQuery<Livre> query = em.createQuery("SELECT livre FROM Livre livre WHERE livre.id = 2", Livre.class);
		Livre livre2 = query.getResultList().get(0);
		int id2 = livre2.getId();
		String auteur2 = livre2.getAuteur();
		String titre2 = livre2.getTitre();
		
		System.out.println(id2 + " " +titre+ " " + auteur);*/
		
		TypedQuery<Livre> query = em.createQuery("SELECT livre FROM Livre livre", Livre.class);
		
		List<Livre> listLivre = query.getResultList();
		System.out.println(listLivre);
		
		
		
		
		
	}

}	
