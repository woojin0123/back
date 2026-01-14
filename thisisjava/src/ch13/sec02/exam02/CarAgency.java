package ch13.sec02.exam02;
	
public class CarAgency implements Rentable<Car2>{
	@Override
	public Car2 rent() {
		return new Car2();
	}
}