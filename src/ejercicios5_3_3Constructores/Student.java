package ejercicios5_3_3Constructores;

public class Student {
	private int matricula;
	private String name;
	private float note1;
	private float note2;
	private float media;
	
	public Student(int matricula, String name) {
		this.matricula= matricula;
		this.name= name;
		
	}
	
	public Student() {
		
	}
	
	public void studentNotes(float note1, float note2) {
		this.note1= note1;
		this.note2= note2;
		
	}
	
	public float calcularMedia() {
		this.media= (this.note1+this.note2)/2;
		
		return media;
	}

	@Override
	public String toString() {
		return "Student3 [matricula=" + matricula + ", name=" + name + ", note1=" + note1 + ", note2=" + note2
				+ ", media=" + media + "]";
	}
	
	
}
