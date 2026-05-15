public class Login {
	private int id;
	private String codigo;
	private String senha;
	
	public Login() {
		this.id = -1;
		this.codigo = null;
		this.senha = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean validarLogin(String codigo, String senha) {
		if( this.codigo.equals(codigo) &&
				this.senha.equals(senha)) {
			return true;
		}
		else {
			return false;
		}
	}
}
