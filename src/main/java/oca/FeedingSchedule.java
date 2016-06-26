/**
 * 
 */
package oca;

/**
 * @author debmalyajash
 *
 */
public class FeedingSchedule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean keepGoing = true;
		int count = 0;
		int x = 3;
		while (count++ < 3) {
			int y = (1 + 2 * count) % 3;
			System.out.println(y+" "+x);
			switch(y) {
				
				case 0: x -= 1; break;
				case 1: x += 5; break;
				default: break;
			}
			
		}
		System.out.println(x);

	}

}
