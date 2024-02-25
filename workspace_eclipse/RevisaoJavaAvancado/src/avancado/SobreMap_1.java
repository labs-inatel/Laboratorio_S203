package avancado;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SobreMap_1 {
	public static void main(String[] args) {
		
		Animal a1 = new Animal(1L, "Tartaruga");
		Animal a2 = new Animal(2L, "Coelho");
		Animal a3 = new Animal(3L, "Cachorro");
		Animal a4 = new Animal(4L, "Gato");
		Animal a5 = new Animal(5L, "Girafa");
		
		Map<String,Animal> mapaDeAnimais = new HashMap<>();
		
		mapaDeAnimais.put("TAR",a1);
		mapaDeAnimais.put("COE",a2);
		mapaDeAnimais.put("CAO",a3);
		mapaDeAnimais.put("CAT",a4);
		mapaDeAnimais.put("GIT",a5);
		
		System.out.println(mapaDeAnimais);
		
		// > Entendendo keySet():
		Set<String> setDeChaves = mapaDeAnimais.keySet();
		System.out.println(setDeChaves);
		
		// > Entendendo values():
		Collection<Animal> colecaoDeValores = mapaDeAnimais.values();
		System.out.println(colecaoDeValores);
		
		// > Entendendo entrySet():
		Set<Entry<String,Animal>> entrySet = mapaDeAnimais.entrySet();
		for(Entry<String,Animal>entry: entrySet) {
			System.out.println("Chave:"+ entry.getKey());
			System.out.println("Valor:"+ entry.getValue());
		}	
	}
}
