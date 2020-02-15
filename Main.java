import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Ship ship1=new Ship("Iraklis",450);
		
		Ship ship2=new Ship("Diogenis",900);
		
		Ship ship3=new Ship("Aristotelis",300);
		
		Ship ship4=new Ship("Poseidonas",600);
		
	
		
		ArrayList<Ship> ships=new ArrayList<Ship>();
		
		ships.add(ship1);
		ships.add(ship2);
		ships.add(ship3);
		ships.add(ship4);
		
		ContainerFrame cf=new ContainerFrame(ships);
		
	}

	
}
