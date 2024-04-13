package app05;

public class Pessoa {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setDono("Victor Cavalcanti");
		p1.setNumConta(001);
		p1.abrirConta("CC");
		
		ContaBanco p2 = new ContaBanco();
		p2.setDono("Luana Mirelly");
		p2.setNumConta(002);
		p2.abrirConta("CP");
		
		
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(100);
		
		p1.fecharConta();
		
		System.out.println("-----------------------------------------");
		p1.status();
		System.out.println("-----------------------------------------");
		p2.status();
	}

}
