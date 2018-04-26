package model.gestionnaire;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.beans.Product;

@ManagedBean
@ApplicationScoped
public class GestionnaireEshop {
	
	private EntityManager em;
	
	public GestionnaireEshop() {
		super();
		this.em = Persistence.createEntityManagerFactory("Mysql_eclipselink").createEntityManager();
		
	}
	
		
		public List<Product> getAllProduct(){
		
			return this.em.createNamedQuery("getAllProduct",Product.class).getResultList();
		}

}
