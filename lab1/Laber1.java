public class Laber1{
	private Shifter shifter;
	public void rightShift(int[] a){
		Shifter rs = new RightShifter();
		rs.makeShift(a);
	}
	public void leftShift(int[] a){
		Shifter rs = new LeftShifter();
		rs.makeShift(a);
	}
	
	public void shift(int[] a, int k){
		if (k<0){
			shifter = new LeftShifter();
			k = k*(-1);
		}else
			shifter = new RightShifter();
		for (int i=0; i<k; i++)
			shifter.makeShift(a);
	}
	
	public void show(int[] a){
		for (int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	
}