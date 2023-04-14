package tranTrungTien.bai09;

public class Test {

	public static void main(String[] args) {
		Vehicle v1 = new Motorcycle("Elec1", 2, 25, 5, 3000000, "Electric");
		Vehicle v2 = new Motorcycle("Yamaha", 2, 150, 80, 15000000, "Petrol");
		Vehicle v3 = new Bicycle("Biker1", 2, 5, 2, 900000, "Child");
		Vehicle v4 = new Bicycle("BikerSport", 2, 30, 5, 2000000, "Sport");
		Vehicle v5 = new Car("Volvo", 6, 6000, 500, 900000000, "Truck", 3);
		Vehicle v6 = new Car("Ford", 4, 3500, 300, 1500000000, "Passenger", 8);
		Vehicle v7 = new Car("Toyota", 4, 2000, 250, 1000000000, "Passenger", 4);
		ListVehicle lst = new ListVehicle();
		lst.addVehicle(v1);
		lst.addVehicle(v2);
		lst.addVehicle(v3);
		lst.addVehicle(v4);
		lst.addVehicle(v5);
		lst.addVehicle(v6);
		lst.addVehicle(v7);
		System.out.println(lst.getTitle());
		System.out.println(lst);
	}
}
