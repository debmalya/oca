/**
 * 
 */
package oca.defaultinterface;

/**
 * @author debmalyajash
 *
 */
public interface IntSequence {
	/**
	 * Whether there is any remaining integer or not.
	 * @return true if there is any remaining integer, false otherwise.
	 */
	default boolean hasNext() { return true; }
	
	/**
	 * To get the next integer from the integer sequence.
	 * @return next integer if any.
	 */
	int next();
}
