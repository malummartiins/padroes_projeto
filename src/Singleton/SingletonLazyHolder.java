package Singleton;

//ele vai encapsular essa instancia em uma classe estática interna
//<a href="https://stackoverflow.com/a/24018148">Referencia</a>

public class SingletonLazyHolder {
    private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
