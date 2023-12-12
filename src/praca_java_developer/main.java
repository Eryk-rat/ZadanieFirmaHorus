package praca_java_developer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class main {

	public static void main(String[] args) {
		
		Block block1 = new BlockOne("biały", "terakota");
		Block block2 = new BlockOne("czarny", "terakota");
		Block block3 = new BlockOne("czarny", "cegła");
		Block block4 = new BlockOne("fioletowy", "drewno");
		
		List<Block> ListaBlock = new ArrayList();
		ListaBlock.add(block4);
		ListaBlock.add(block2);
		ListaBlock.add(block3);
		ListaBlock.add(block1);
		
		Wall wall = new Wall(ListaBlock);
		String foundcolor = "szary";
		String foundmaterial = "terakota";
		int count;
		Optional<Block> foundblockcolor = wall.findBlockByColor(foundcolor);
		
		if(foundblockcolor.isPresent()) {
			System.out.println("Znaleziony pierwszy blok o danym kolorze "+foundblockcolor.toString());
		}else {
			System.out.println("nie znaleziono bloku o kolorze " + foundcolor);
		}
		
		List<Block> foundblockmaterial = wall.findBlocksByMaterial(foundmaterial);
		
		if(foundblockmaterial.isEmpty()==false) {
			System.out.println("Znaleziony/e blok o materiale " + foundmaterial);
			for(Block block : foundblockmaterial) {
				System.out.println(block.toString());
			}
		}else {
			System.out.println("Nie znaleziono rzadnego bloku o materiale " + foundmaterial);
		}
		
		
		count = wall.count();
		System.out.println("Całkowita ilość blokó : " + count);
		
	}
}
