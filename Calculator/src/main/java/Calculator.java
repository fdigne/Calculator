
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

/**Permet de diviser les deux nombres passés en paramètre
 * 
 * @param a : Premier nombre de type float
 * @param b : Deuxième nombre de type float
 * @return a*b
 */
public static float diviser(float a , float b) {	
		return a/b;
	}

/**Permet de soustraire les deux nombres passés en paramètre
 * 
 * @param a : Premier nombre de type float
 * @param b : Deuxième nombre de type float
 * @return a-b
 */
public static float soustraire(float a , float b) {	
	return a-b;
}
/**Permet de faire une opération complexe les deux nombres passés en paramètre
 * 
 * @param a : Premier nombre de type float
 * @param b : Deuxième nombre de type float
 * @return (a*b)+(a/b)
 */
public static float complexe(float a , float b) {
	
	return (a*b)+(a/b);
}


/**
 * Mettre en arguments 2 nombre
 * @param args
 */
	public static void main(String[] args) {
		
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		
		System.out.println("Le nombre a est : "+ a);
		System.out.println("Le nombre b est : "+ b);
		System.out.println("Le résultat de l'addition est : "+ additionner(a,b));
		System.out.println("Le résultat de la multiplication est : "+ multiplier(a,b));
		System.out.println("Le résultat de la division est : "+ diviser(a,b));
		System.out.println("Le résultat de la soustraction est : "+ soustraire(a,b));
		System.out.println("Le résultat de la complexe est : "+ complexe(a,b));
	}

}
