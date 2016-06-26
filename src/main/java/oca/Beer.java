/**
 * 
 */
package oca;

/**
 * @author debmalyajash
 *
 */
public class Beer {
	
	public Beer() {
		System.out.print("Default Beer");
	}

	public Beer(final int age) {
		System.out.print("BeerAge");
	}
	
	public boolean withCheers() {
		return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KingFisher ks = new KingFisher(5);
		System.out.println(","+ks.withCheers());
		
		KingFisher ks1 = new KingFisher();
		

	}

	static class KingFisher extends Beer {
		public KingFisher(){
			System.out.println(" ,KingFisher no choice ");
		}
		public KingFisher(final int age) {
			System.out.print(" ,KingFisher by choice.");
		}
		
		public boolean withCheers() {
			return true;
		}
	}
}
