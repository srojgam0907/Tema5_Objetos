package ejercicios5_5_2This;

public class Person {
	private String name;
	private int age;
    private float height;
    private String work;
    private float salary;

    public Person() {
    	this("unnamed",0,0.0f,"unemployment", 0f);
    }
    
    public Person(String name, int age, float height, String work, float salary) {
    	this.name= name;
    	this.age= age;
    	this.height= height;
    	this.work= work;
    	this.salary= salary;
    }
 
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
	
	public float getSalary() {
    	return salary;
    }
	
	public void setSalary(float salary) {
		this.salary = salary; 
	}
	
	public float addSalary (Person persona) {
    	salary+=persona.salary;
    	
    	return salary;
    }
	
    public void doubleSalary () {
    	salary = addSalary(this);
    }
	
	@Override
	public String toString() {
		return String.format("Nombre: %s\nEdad: %d\nAltura: %.2f\nTrabajo: %s\nSalario: %2.f", name, age, height, work, salary); 
	}
	
}
