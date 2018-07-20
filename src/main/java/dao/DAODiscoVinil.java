package dao;

import java.util.ArrayList;
import modelo.DiscoVinil;

public class DAODiscoVinil {
	
	private ArrayList<DiscoVinil> listadediscos;
	
	public DiscoVinil listardisco() {
		
		DiscoVinil disco = new DiscoVinil();
		disco.setTitulo("NASHVILLE CITY LIMITS");
		disco.setArtista("ELVIS PRESLEY");
		disco.setLocacao(true);
		disco.setVenda(true);
		disco.setEstadodeconservacao("BOM");		
		return (disco);
	}
	
	public ArrayList<DiscoVinil> listagemdiscos(){
	
		listadediscos = new ArrayList<DiscoVinil>();
		DiscoVinil disco1 = new DiscoVinil("HERE TODAY GONE TOMORROW","RAMONES",true,false,"ÓTIMO");
		DiscoVinil disco2 = new DiscoVinil("ALUCINAÇÃO","BELCHIOR",false,true,"BOM");
		listadediscos.add(disco1);
		listadediscos.add(disco2);
		return (listadediscos);
	}
}
