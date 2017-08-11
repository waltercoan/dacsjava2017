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
	
	private Cliente model = new Cliente();
	
	public void save(){
		clienteEJB.save(model);
	}
	
	public Cliente getModel() {
		return model;
	}



	public void setModel(Cliente model) {
		this.model = model;
	}



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
