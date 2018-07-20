package modelo;

public class DiscoVinil {

	private int iddiscovinil;
	private String titulo;
	private String artista;
	private boolean locacao;
	private boolean venda;
	private String estadodeconservacao;
	
	public int getIddiscovinil() {
		return iddiscovinil;
	}
	public void setIddiscovinil(int iddiscovinil) {
		this.iddiscovinil = iddiscovinil;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public boolean isLocacao() {
		return locacao;
	}
	public void setLocacao(boolean locacao) {
		this.locacao = locacao;
	}
	public boolean isVenda() {
		return venda;
	}
	public void setVenda(boolean venda) {
		this.venda = venda;
	}
	public String getEstadodeconservacao() {
		return estadodeconservacao;
	}
	public void setEstadodeconservacao(String estadodeconservacao) {
		this.estadodeconservacao = estadodeconservacao;
	}
	
	
}
