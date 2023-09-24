package Singleton; 

//Singleton = perimitir a criação de uma unica instancia de uma classe e fornecer um modo para recupera-la.

public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}