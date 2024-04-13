package app05;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo += saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (this.getTipo() == "CC") {
			this.setSaldo(50f);
		} else if (this.getTipo() == "CP") {
			this.setSaldo(150f);
		}
		System.out.println("Conta aberta com sucesso. Seja bem-vindo!");
	}
	public void fecharConta() {
		if (this.getSaldo() > 0f) {
			System.out.println("ERRO! Conta com dinheiro.");
		} else if (this.getSaldo() < 0f) {
			System.out.println("ERRO! Conta devendo dinheiro ao banco.");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso. Volte sempre!");
		}
	}
	public void depositar(float s) {
		if (this.isStatus()) {
			this.setSaldo(s);
			System.out.println("Dinheiro depositado na conta de " + this.getDono());
		} else {
			System.out.println("Conta não existe");
		}
	}
	public void sacar(float s) {
		if (this.isStatus()) {
			if (this.getSaldo() >= s) {
				this.setSaldo(s * -1);
				System.out.println("Dinheiro sacado da conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Conta não existe");
		}
	}
	public void pagarMensal() {
		float v = 0f;
		if (this.getTipo() == "CC") {
			v = 12f;
		} else if (this.getTipo() == "CP") {
			v = 20f;
		}
		if (this.isStatus()) {
			this.setSaldo(v * -1);
			System.out.println("Taxa mensal cobrada!");
		} else {
			System.out.println("Conta não existe");
		}
	}
	public void status() {
		System.out.println("Dono: " + this.getDono());
		System.out.println("Número da Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Saldo: R$" + this.getSaldo());
		System.out.println("Status da Conta: " + this.isStatus());
	}
}
