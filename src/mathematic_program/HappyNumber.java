public class HappyNumber {
	public static void main(String[]args) {
		System.out.println(happynumber(82));
		System.out.println(happynumber(19));
	}
	
	private static boolean happynumber(int a) {
		Set<Integer>set = new HashSet<>();
		while(true) {
			int sum=0;
			while(a!=0) {
				sum+=Math.pow(a%10, 2.0);
				a=a/10;
			}
			if(sum==1)return true;
			a=sum;
			if(set.contains(a)) return false;
			set.add(a);
		}
	}
 }
