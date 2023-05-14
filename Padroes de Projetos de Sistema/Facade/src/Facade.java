public class Facade {

	private Memoria memoria;
	private HD hd;
	private CPU cpu;
	private Acessorios acessorios;
	private SO so;
	
	public Facade() {
		this.memoria = new Memoria();
		this.hd = new HD();
		this.cpu = new CPU();
		this.acessorios = new Acessorios();
		this.so = new SO();	
	}
	
	public void montarPC() {
		System.out.println("Montando uma nova maquina...\n");
		
		memoria.adicionarMemoria();
		hd.adicionarHD();
		cpu.adicionarCPU();
		acessorios.adicionarMouse();
		acessorios.adicionarTeclado();
		acessorios.adicionarMonitor();
		so.instalarSO();
		
		System.out.println("\nComputador fabricado.");
	}
	
}
