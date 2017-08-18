package api;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.glassfish.admin.amx.annotation.Param;

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
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Cliente getClientbyId(@PathParam("id") long id){
		return clienteEJB.getById(id);
	}
}




