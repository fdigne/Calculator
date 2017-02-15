
public class Calculator {

/**Permet d'ajouter les deux nombres passés en paramètre
 * 
 * @param a : Premier nombre de type float
 * @param b : Deuxième nombre de type float
 * @return a+b
 */
public static float additionner(float a , float b) {
		return a+b;
	}

/**Permet de multiplier les deux nombres passés en paramètre
 * 
 * @param a : Premier nombre de type float
 * @param b : Deuxième nombre de type float
 * @return a*b
 */
public static float multiplier(float a , float b) {	
		return a*b;
	}

/**
 * Mettre en arguments 2 nombres
 * @param args
 */
	public static void main(String[] args) {
		
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		
		System.out.println("Le nombre a est : "+ a);
		System.out.println("Le nombre b est : "+ b);
		System.out.println("Le résultat de l'addition est : "+ additionner(a,b));
		System.out.println("Le résultat de la multiplication est : "+ multiplier(a,b));
	}

}
