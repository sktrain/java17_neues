package sk.train;
public class Modul1 {

	public static void main(String[] args) {
		
		System.out.println("Unser erstes Modul");
		
		//Ausgabe des Modulnamens
		Class<Modul1> cls = Modul1.class;
		Module mod = cls.getModule();
		System.out.println("Name unseres Moduls: " + mod.getName());
		System.out.println("Descriptor unseres Moduls: " + mod.getDescriptor());

	}

}
