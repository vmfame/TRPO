public class CMP{
	public int allPaired(int[] a){
		int res = a[0];
		for (int i=1; i<a.length; i++)
			res ^= a[i];
		return res;	
	}
}