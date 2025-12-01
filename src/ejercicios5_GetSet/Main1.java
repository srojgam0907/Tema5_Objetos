package ejercicios5_GetSet;
import java.util.Scanner;

public class Main1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		Person1 persona1;
		String name;
		
		System.out.printf("Nombre: %s", persona1.getName());

		System.out.printf("Asignalé un nombre nuevo");
		name= kb.nextLine();
		
		persona1.setName(name);
		
		System.out.printf("Nombre: %s", persona1.getName());
	}

}
