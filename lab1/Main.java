public class Main{
	public static void main(String[] args){
		if (args.length < 1)
			return;
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Laber1 lab1 = new Laber1();
		System.out.println("Original:");
		lab1.show(b);
		System.out.println("Edited: ");
		
		lab1.shift(b, Integer.parseInt(args[0]));
		lab1.show(b);
		
		int[] c1 = {1, 2, 3, 4, 4, 3, 2, 1};
		int[] c2 = {1, 2, 3, 4, 3, 2, 1};
		int[] c3 = {1, 1, 2, 2, 3, 3, 4, 4, 6, 7, 7};
		CMP cmp = new CMP();
		System.out.println(cmp.allPaired(c1));
		System.out.println(cmp.allPaired(c2));		
		System.out.println(cmp.allPaired(c3));
	}
}