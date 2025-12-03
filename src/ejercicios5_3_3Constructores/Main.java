package ejercicios5_3_3Constructores;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().show();
		
	}
	
	public void show() {
		@SuppressWarnings("resource")
		Scanner kb= new Scanner(System.in);
		String name;
		int matricula;
		float note1;
		float note2;
		
		System.out.println("Introduce tu nombre");
		name= kb.next();
		
		System.out.println("Introduce tu numero de matricula");
		matricula= kb.nextInt();
		
		System.out.println("Introduce la primera nota");
		note1= kb.nextFloat();
		
		System.out.println("Introduce la segunda nota");
		note2= kb.nextFloat();

		Student s1= new Student(matricula, name);
		s1.studentNotes(note1, note2);
		s1.calcularMedia();
		
		System.out.println(s1.toString());
	}

}
