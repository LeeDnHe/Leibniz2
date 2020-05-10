package konkuk;

public class Euler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		double n =1;
		double sum = 0;
		while(n > 0.0001) {
			n = 1.0 /(i*i);
			sum += n;
			i++;
		}
		System.out.println(sum);
	}


}
