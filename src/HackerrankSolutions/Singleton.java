package HackerrankSolutions;

/*
The singleton pattern is a design pattern that restricts the instantiation 
of a class to one object. This is useful when exactly one object is needed 
to coordinate actions across the system.
*/
class Singleton {

	//Creating private instance of Singleton Class
	private static Singleton instance;
	
	
	public String str;

	//Creating private Constructor so that it cannot be created outside.
	private Singleton() {
		str = "";
	}

	static Singleton getSingleInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}