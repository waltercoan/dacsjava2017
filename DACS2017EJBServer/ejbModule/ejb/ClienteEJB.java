package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Cliente;

@Stateless
public class ClienteEJB implements ClienteEJBLocal {

	@PersistenceContext(name="dacs2017context")
    private EntityManager em;
	
    public ClienteEJB() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public void insert(Cliente cliente) {
		em.persist(cliente);

	}

}
