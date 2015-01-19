package javastudy.Array.search;

/**
 * 
 * @author Nandi
 * 
 */
public class SearchBig {

	/**
	 * 
	 * @param array
	 * @return return the biggst number of array
	 */
	public static int search(int[] array) {

		int max = array[0];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				index = i;
				max = array[i];
			}
		}
		return index;
	}
}
