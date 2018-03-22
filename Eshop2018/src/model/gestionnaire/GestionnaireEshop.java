package model.gestionnaire;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

@ManagedBean
@ApplicationScoped
public class GestionnaireEshop {
	
	private EntityManager em;
	
	public GestionnaireEshop() {
		super();
		this.em = Persistence.createEntityManagerFactory("Mysql_eclipselink").createEntityManager();
		
	}

}
