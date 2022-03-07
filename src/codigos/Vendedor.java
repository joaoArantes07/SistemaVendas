package codigos;

public class Vendedor {
	private String senha;
	private long cnpj;
	private boolean mei;
	private String email;
	private long telefone;
	private String categoria;
	
	public Vendedor(String senha,long cnpj,boolean mei,String email,long telefone, String categoria) {
		this.senha = senha;
		this.cnpj = cnpj;
		this.mei = mei;
		this.email = email;
		this.telefone = telefone;
		this.categoria = categoria;
	}
	
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public boolean getMei() {
		return mei;
	}
	public void setMei(boolean mei) {
		this.mei = mei;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
