import java.util.ArrayList;

public class Portal implements Subject {

	private ArrayList observers;
	private Aluno aluno;
	
	public Portal(){
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers(Aluno aluno) {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.consulta(aluno);
		}
	}

	public double consultar(Aluno aluno){
		
		notifyObservers(aluno);
		return aluno.nota;
		
	}
	
}
