package control;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import ejb.ClienteEJBLocal;
import model.Cliente;

@ManagedBean(name="clienteControl")
public class ClienteControl {
	@EJB
	private ClienteEJBLocal clienteEJB;
	
	public void inserirCliente(){
		System.out.println("Clicou no botao");
		Cliente cli = new Cliente();
		cli.setNome("Zezinho");
		cli.setDataNascimento(new Date());
		
		clienteEJB.insert(cli);
		
		
	}

}
