package Aufgaben_Karrer_Streams.Aufgabe3;

public class StringVerarbeitung {

	public static void main(String[] args) {

          String testString = getString();
          
          //Entferne die Satzzeichen und gib nur die W�rter aus, die mit einem Gro�buchstaben beginnen.
          //Die Klasse Pattern kann ab Java 8 die Treffer als Stream liefern.
          //Verwenden Sie "Pattern.compile("[^\\p{L}]")"
         
          
          //Z�hle die Gesamtanzahl der Zeichen in den W�rtern, die mit einem Gro�buchstaben beginnen
          
          
          
          //Partitioniere die W�rter in 2 Gruppen: beginnt mit Gro�buchstabe oder Kleinbuchstabe
          
          
          
          
          
          //Speichere pro Partition nur den lexikografisch gr��ten String
          
          
          
          //Speichere je Wort die H�ufigkeit des Auftretens
         
          

	}

	private static String getString() {
		return "Wer reitet so sp�t durch Nacht und Wind?"
				+ "Es ist der Vater mit seinem Kind;"
				+ "Er hat den Knaben wohl in dem Arm,"
				+ "Er fa�t ihn sicher,er h�lt ihn warm."
				;
	}

}