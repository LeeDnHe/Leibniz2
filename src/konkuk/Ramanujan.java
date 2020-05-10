package konkuk;

public class Ramanujan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i =0;
		double n =1;
		double sum = 1;
		double total = 0;
		while(i<20) {
			double ffac = factorial(4*(int) i);
			double fac = Math.pow(factorial((int) i),i);
			double pow = Math.pow(396, 4*(int)i);
			n = (ffac*(1103+26390*i))/(fac*pow);
			sum += n;
			i++;
		}
		total = 1.0/((Math.pow(8, 0.5)/9801)*sum);
		System.out.println(total);
	}
	public static int factorial(int num) {
		
		if(num == 0)
			return 1;
		num *= factorial(num-1);
		return num;
	}

}
