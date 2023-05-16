public class Facade {

	private Memoria memoria;
	private HD hd;
	private SO so;
	
	public Facade() {
		this.memoria = new Memoria();
		this.hd = new HD();
		this.so = new SO();	
	}
	
	public void montarPC() {
		System.out.println("Montando uma nova maquina...\n");
		
		memoria.adicionarMemoria();
		hd.adicionarHD();
		so.instalarSO();
		
		System.out.println("\nComputador fabricado.");
	}
	
}
