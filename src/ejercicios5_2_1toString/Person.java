package ejercicios5_2_1toString;

public class Person {
	private String name;
	private int age;
    private float height;
    private String work;
 
	public String getName(){
		return name;
	}

	public void setName(String name){
	    this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return String.format("Nombre: %s\nEdad: %d\nAltura: %f\nTrabajo: %s", name, age, height, work);
		
	}
	
	
}
