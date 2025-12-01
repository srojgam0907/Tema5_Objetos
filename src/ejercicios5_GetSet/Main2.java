package ejercicios5_GetSet;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		Person2 persona2= new Person2();
		String name;
		int age;
	    float height;
	    String work;
	    
	    System.out.printf("Nombre: %s\n", persona2.getName());
	    System.out.printf("Edad: %d\n", persona2.getAge());
	    System.out.printf("Altura: %.2f\n", persona2.getHeight());
	    System.out.printf("Trabajo: %s\n", persona2.getWork());

	    System.out.printf("Asignalé un nombre\n");
		name= kb.next();
		persona2.setName(name);
		
		System.out.printf("Asignalé un edad\n");
		age= kb.nextInt();
		persona2.setAge(age);
		
		System.out.printf("Asignalé una altura\n");
		height= kb.nextFloat();
		persona2.setHeight(height);
		
		System.out.printf("Asignalé un trabajo\n");
		work= kb.next();
		persona2.setWork(work);
	    
		System.out.printf("Nombre: %s\n", persona2.getName());
	    System.out.printf("Edad: %d\n", persona2.getAge());
	    System.out.printf("Altura: %.2f\n", persona2.getHeight());
	    System.out.printf("Trabajo: %s\n", persona2.getWork());

	}
	
}
