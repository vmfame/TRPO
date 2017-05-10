public class LeftShifter extends Shifter{
	@Override
	public void makeShift(int[] a){
		int temp = a[0];
		for (int i=0; i<a.length-1; i++)
			a[i] = a[i+1];
		a[a.length-1] = temp;
	}
}