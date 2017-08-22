package api;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import ejb.ClienteEJBLocal;
import model.Cliente;

@Path("/client")
@javax.enterprise.context.RequestScoped
public class ClienteAPI {
	
	@EJB
	ClienteEJBLocal clienteEJB;
	
	@GET
	@Produces("application/json")
	public List<Cliente> getAllClients(){
		return clienteEJB.getAll();
	}
	@POST
	@Consumes("application/json")
	public void save(Cliente cliente){
		cliente.setId(0);
		clienteEJB.save(cliente);
	}
	
	@PUT
	@Consumes("application/json")
	@Path("/{id}")
	public void update(Cliente cliente, 
			@PathParam("id") long id){
		cliente.setId(id);
		clienteEJB.save(cliente);
	}
	
	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") long id){
		clienteEJB.remove(clienteEJB.getById(id));
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Cliente getClientbyId(@PathParam("id") long id){
		return clienteEJB.getById(id);
	}
}




