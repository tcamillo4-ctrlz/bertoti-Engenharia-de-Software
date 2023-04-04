package observer;

public class Teste {

	public static void main(String[] args) {
		
		Posto p = new Posto();
		
		Carro uno = new Carro("DPP-9207", "Uno", false);
		
		uno.tanque = p.encherTanque(uno, false);		
		System.out.println("TANQUE CHEIO!");
		System.out.println(uno.tanque);
	}
}
