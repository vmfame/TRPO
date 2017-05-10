public class RightShifter extends Shifter{
	@Override
	public void makeShift(int[] a){
		int temp = a[a.length-1];
		for (int i=a.length-1; i>0; i--)
			a[i] = a[i-1];
		a[0] = temp;
	}
}