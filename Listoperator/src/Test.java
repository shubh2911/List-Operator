import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test {

	static class Passenger
	{
		String name;
		String src;
		String dest;
		public Passenger(String name, String src, String dest) {
			super();
			this.name = name;
			this.src = src;
			this.dest = dest;
		}
		
		public Passenger() {}

		@Override
		public String toString() {
			return "Passenger [name=" + name + ", src=" + src + ", dest=" + dest + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSrc() {
			return src;
		}

		public void setSrc(String src) {
			this.src = src;
		}

		public String getDest() {
			return dest;
		}

		public void setDest(String dest) {
			this.dest = dest;
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Passenger> passengers=new ArrayList<Passenger>();
		Passenger p1=new Passenger("Shubhada","Pune","Mumbai");
		Passenger p2=new Passenger("Snehal","Mumbai","Kolkata");
		Passenger p3=new Passenger("Arpita","Pune","Delhi");
		Passenger p4=new Passenger("Pranita","Mumbai","Kolkatta");
		Passenger p5=new Passenger("Pranali","Pune","Mumbai");
		Passenger p6=new Passenger("Sujata","Delhi","Mumbai");
		passengers.add(p1);
		passengers.add(p2);
		passengers.add(p3);
		passengers.add(p4);
		passengers.add(p5);
		passengers.add(p6);
		
		
		System.out.println("All Passenger:-"+passengers.toString());
		
		ArrayList passe=(ArrayList) passengers.stream()
				.filter(s-> s.getSrc().equalsIgnoreCase("Pune") )
				.filter(s-> s.getDest().equalsIgnoreCase("Mumbai") )
				.collect(Collectors.toList());
		System.out.println("All Passenger from Pune to Mumbai:-"+passe.toString());
	
		
			}

}
