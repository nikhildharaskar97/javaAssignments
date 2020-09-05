package pack2;

import com.teltra.ipack1.Car;

public class longDrive {
	public static void main(String[] args) {
		
		Car car = new Car(1947,"Q3",40,160,"Sedan");
		System.out.println(car.start());
		
		if(car.increaseSpeed(500)!=0) {
			System.out.println(car.increaseSpeed(100));
		}
		else {
			System.out.println("Stop the car!");
		}
		System.out.println(car.stop());
		
		
	}
}
