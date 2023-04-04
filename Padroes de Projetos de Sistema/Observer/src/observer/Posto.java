package observer;

import java.util.ArrayList;


public class Posto implements Subject{
	
	private ArrayList observers;
	private Carro c;
	
	public Posto(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers(boolean novoTanque){
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(novoTanque);
		}
	}
	
	public boolean encherTanque(Carro c, boolean tanque){
		
		c.tanque = true;
		
		notifyObservers(c.tanque);
		return c.tanque;
		
	}

}
