package br.com.vinicius.singleton;

/**
 * @author vinicius
 *
 */
public final class SingletonObject {

	private static final SingletonObject obj = new SingletonObject(); 
	
	private SingletonObject() {
		super();
	}
	
	public static SingletonObject getInstance() {
		return obj;
	}
}
