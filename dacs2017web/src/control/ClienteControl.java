package control;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import ejb.ClienteEJBLocal;
import model.Cliente;

@ManagedBean(name="clienteControl")
public class ClienteControl {
	@EJB
	private ClienteEJBLocal clienteEJB;
	
	
	public List<Cliente> getAll(){
		return clienteEJB.getAll();
	}
	
	
	
	public void inserirCliente(){
		System.out.println("Clicou no botao");
		Cliente cli = new Cliente();
		cli.setNome("Zezinho");
		cli.setDataNascimento(new Date());
		
		clienteEJB.insert(cli);
		
		
	}

}
