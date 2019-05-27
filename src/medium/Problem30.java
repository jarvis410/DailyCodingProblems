package medium;

/**
 * calculate water filled between given height walls
 * 
 * @author makad
 *
 */
public class Problem30 {

	public static void main(String[] args) {

//		int[] walls = { 2, 1, 2 };
		int[] walls = { 3, 0, 1, 3, 0, 5 };

		int lw = 0, rw;

		int i = 1;
		while (i < walls.length) {
			while (walls[lw] < walls[i]) {
				lw = i++;
			}
			while (walls[i] < walls[lw]) {
				i++;
			}
			rw = i;
			calculateWaterFilled(walls, lw, rw);
			lw = i++;
		}
	}

	/**
	 * calculate water filled between given two walls
	 * 
	 * @param walls length of walls
	 * @param lw    index of left wall
	 * @param rw    index of right wall
	 */
	public static void calculateWaterFilled(int[] walls, int lw, int rw) {
		int wallLength = walls[lw];
//		int waterFilled = 0;

		for (int i = lw + 1; i < rw; i++) {
//			waterFilled += wallLength - walls[i];
			System.out.println((wallLength - walls[i]) + " at index " + i);
		}

//		System.out.println(waterFilled);
	}

}
