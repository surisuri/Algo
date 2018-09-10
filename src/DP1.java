
public class DP1 {
	public static int binomial(int n, int k) {
		if(n==k || k==0) {
			return 1;
		}else {
			return binomial(n-1, k) + binomial(n-1, k-1);
		}
	}
}
