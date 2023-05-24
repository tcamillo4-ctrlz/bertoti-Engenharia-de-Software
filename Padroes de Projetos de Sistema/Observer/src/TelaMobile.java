public class TelaMobile implements Observer {

	public void consulta(Aluno aluno) {
		display(aluno);
		
	}

	public void display(Aluno aluno){
		System.out.println("---------------------");
		System.out.println("Tela Mobile");
		System.out.println("Nota: " + aluno.nota);
	}

}
