package ejercicios5_1_2GetSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		Person persona1= new Person();
		String name; 
		int age;
	    float height;
	    String work;
	    
	    System.out.printf("Nombre: %s\n", persona1.getName());
	    System.out.printf("Edad: %d\n", persona1.getAge());
	    System.out.printf("Altura: %.2f\n", persona1.getHeight());
	    System.out.printf("Trabajo: %s\n", persona1.getWork());

	    System.out.printf("Asignalé un nombre\n");
		name= kb.next();
		persona1.setName(name);
		
		System.out.printf("Asignalé un edad\n");
		age= kb.nextInt();
		persona1.setAge(age);
		
		System.out.printf("Asignalé una altura\n");
		height= kb.nextFloat();
		persona1.setHeight(height);
		
		System.out.printf("Asignalé un trabajo\n");
		work= kb.next();
		persona1.setWork(work);
	    
		System.out.printf("Nombre: %s\n", persona1.getName());
	    System.out.printf("Edad: %d\n", persona1.getAge());
	    System.out.printf("Altura: %.2f\n", persona1.getHeight());
	    System.out.printf("Trabajo: %s\n", persona1.getWork());

	}
	
}
