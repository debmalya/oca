/**
 * 
 */
package oca.defaultinterface;

/**
 * @author debmalyajash
 *
 */
public class DigitSequence implements IntSequence {
	
	private int number;
	
	public DigitSequence(int num) {
		number = num;
	}
	
	public boolean hasNext() {
		return number != 0;
	}

	/* (non-Javadoc)
	 * @see oca.defaultinterface.IntSequence#next()
	 */
	@Override
	public int next() {
		int n = number % 10;
		number /= 10;
		return n;
	}

}
