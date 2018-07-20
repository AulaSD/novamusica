package servicos;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import dao.DAODiscoVinil;
import modelo.DiscoVinil;

@Path("vinil")
public class ServicoDiscoVinil {
	
	@Path("listadisco")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public DiscoVinil listadisco() {
		
		DAODiscoVinil daodiscovinil = new DAODiscoVinil();
		return (daodiscovinil.listardisco());
	}
	
	@Path("listagemdiscos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<DiscoVinil> listagemdiscos() {
		
		DAODiscoVinil daodiscovinil = new DAODiscoVinil();
		return (daodiscovinil.listagemdiscos());
	}
}
