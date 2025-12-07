package ejercicios5_5_1This;

public class Main {

	public static void main(String[] args) {
		new Main().show();

	}
	
	public void show() {
		Person persona1 = new Person();
		Person persona2 = new Person("Pepé", 50, 1.8f, "Fontanero");
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		
	}

}
