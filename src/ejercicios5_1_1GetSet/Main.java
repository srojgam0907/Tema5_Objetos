package ejercicios5_1_1GetSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().show();
		
	}
	
	public void show() {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		Person persona1= new Person();
		String name;
		
		System.out.printf("Nombre: %s\n", persona1.getName());

		System.out.printf("Asignalé un nombre nuevo\n");
		name= kb.nextLine();
		
		persona1.setName(name);
		
		System.out.printf("Nombre: %s", persona1.getName());
	}

}
