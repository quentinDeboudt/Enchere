package fr.eni.enchere2.dal;

public class DalException2 extends Exception{
	
	public DalException2 (String message) {
		super(message);
	}

	public DalException2(String message, Throwable exception) {
		super(message, exception);
	}
}
