package algorithms.experiment;

/**
 * ŷ������㷨��ȡ���Լ��
 * 
 * @author T460p
 *
 */
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		int rs = gcd(21, 8);
		System.out.println("rs=" + rs);
	}

	public static int gcd(int p, int q) {

		if (p % q == 0)
			return q;

		int r = p % q;

		System.out.println("q=" + q + ",r=" + r);

		return gcd(q, r);
	}
	
}
