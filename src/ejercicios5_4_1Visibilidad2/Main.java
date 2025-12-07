package ejercicios5_4_1Visibilidad2;

import ejercicios5_4_1Visibilidad.Vehicles;

public class Main {

    public void show() {

        Vehicles car;
        car = new Vehicles(4, "azul");
         
        //System.out.printf("El coche tiene %d ruedas", car.getWheelCount()); //no es visible porque es friendly
        
        car.accelerate(100); //es visible porque es public
        
        //System.out.printf("\nEl coche va a %.2f km/h", car.speed); //speed no es visible porque es private

    }

    public static void main(String[] args) {

        new Main().show(); 

    }

}
