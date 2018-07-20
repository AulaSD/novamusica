package servicos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import modelo.DiscoVinil;

@Path("vinil")
public class ServicoDiscoVinil {
	
	@Path("listadisco")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public DiscoVinil listadisco() {
		
		DiscoVinil disco = new DiscoVinil();
		disco.setTitulo("NASHVILLE CITY LIMITS");
		disco.setArtista("ELVIS PRESLEY");
		disco.setLocacao(true);
		disco.setVenda(true);
		disco.setEstadodeconservacao("BOM");
		
		return (disco);
	}

}
