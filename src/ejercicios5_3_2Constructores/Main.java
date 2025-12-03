package ejercicios5_3_2Constructores;

public class Main {

	public static void main(String[] args) {
		new Main().show();

	}
	
	public void show() {
		Person persona1= new Person("sara", 20, 1.60f, "estudiante");

		System.out.println(persona1.toString());
	}

}
