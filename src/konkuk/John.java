package konkuk;

public class John {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i =2;
		double n =1;
		double sum = 1;
		while(i<200) {
			n = ((i-1)*(i+1))/(i*i);
			sum *= n;
			i += 2.0;
		}
		System.out.println(sum);
	}

}
