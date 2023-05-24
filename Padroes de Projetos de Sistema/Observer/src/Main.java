public class Main {

	public static void main(String[] args) {
		Portal portal = new Portal();
		TelaDesktop desktop = new TelaDesktop();
		TelaMobile mobile = new TelaMobile();
		portal.registerObserver(desktop);
		portal.registerObserver(mobile);
		
		Aluno aluno = new Aluno("Tiago", 8.5);
		
		portal.consultar(aluno);
	}

}
