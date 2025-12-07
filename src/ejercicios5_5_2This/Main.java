package ejercicios5_5_2This;

public class Main {

	public static void main(String[] args) {
		new Main().show();

	}
	
	public void show() {
		Person persona= new Person();
		Person persona2= new Person("Selene", 20, 1.70f, "Programadora", 1500);
		
		System.out.printf("Persona 2: %.0f\n", persona2.getSalary());
		
		persona.setSalary(300);
		persona.addSalary(persona2);
		
		System.out.printf("Persona 1: %.0f\n", persona.getSalary());
		System.out.printf("Persona 2: %.0f\n", persona2.getSalary());
		
		persona.doubleSalary();
		System.out.printf("Persona 1: %.0f", persona.getSalary());
		
	}

}
