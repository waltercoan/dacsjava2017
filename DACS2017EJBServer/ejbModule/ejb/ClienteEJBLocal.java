package ejb;

import javax.ejb.Local;

import model.Cliente;

@Local
public interface ClienteEJBLocal {
	public void insert(Cliente cliente);
}
