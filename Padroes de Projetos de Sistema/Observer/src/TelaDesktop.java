public class TelaDesktop implements Observer {

	public void consulta(Aluno aluno) {
		display(aluno);
		
	}

	public void display(Aluno aluno){
		System.out.println("---------------------");
		System.out.println("Tela Desktop");
		System.out.println("Sua nota é: " + aluno.nota);
	}

}
