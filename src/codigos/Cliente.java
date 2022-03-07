package codigos;

public class Cliente {

	private String nome;
	private long cpf;
	private String email; 
	private String senha; 
	private double carteira;
	
	public Cliente(String nome,long cpf,String email,String senha,double carteira) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.carteira = carteira;
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public double comprar_itens(double quantia, int qtd_parcelas) {
		
	
		
		
		switch(qtd_parcelas){
			case 1 : //Parcela de 1x
				return this.carteira - (quantia - (quantia * 0.05));
			case 2: //Parcela de 2x
				double taxa = ( 1 + ((double) 10 / 100));
				return this.carteira - (quantia * (double) Math.pow(taxa, qtd_parcelas));
			case 3://Parcela de 3x
				double taxa_2 = ( 1 + ((double) 20 / 100));
				return this.carteira - (quantia * (double) Math.pow(taxa_2, qtd_parcelas));
		}
			return this.carteira;
					
	}
	
	public double adicionar_fundos(double valor) {
		return this.carteira + (valor);
	}
	
	public boolean logar_sistema (String email, String senha){
		if (this.email == email && this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
				
	}
}
