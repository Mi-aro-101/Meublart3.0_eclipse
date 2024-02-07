/**
 * 
 */
package org.miframework.helper;

/**
 * @author miaro
 *
 */
public class MeubleHelper {
	
	public static int[] conversion(String[] chaine){
        int[] rep = new int[chaine.length];
        int k=0;
        for (String i : chaine) {
            rep[k] = Integer.parseInt(i);
            k++;
        }
        return rep;
    }
	
	public static String arrayToStringQuery(int[] ids) {
		String result = "";
		
		for(int id : ids) {
			result += "'"+id+"',";
		}
		
		return result.substring(0, result.length()-1);
	}

}
