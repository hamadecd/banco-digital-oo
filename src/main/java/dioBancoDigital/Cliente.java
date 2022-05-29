package dioBancoDigital;

public abstract class Cliente {

	private String nome;

    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }
    
    public abstract String getDocumento();
	public abstract void setDocumento(String documento);

    public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
