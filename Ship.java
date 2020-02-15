import java.util.ArrayList;

public class Ship {
	
	private String name;
	private int capacity;
	private ArrayList<Container> containers=new ArrayList<Container>();
	
	
	public Ship(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}
	
	public void addContainer(Container aContainer) {
		
		if(containers.size()<capacity)
			containers.add(aContainer);
		else System.out.println("Sorry there is no capacity");
		
		
	}
	
	public double getTotalCharge() {
		
		double totalCharge=0; 
		for(Container container: containers)
			totalCharge+=container.getCharge();
		
		return totalCharge;
		
		
	}

}
