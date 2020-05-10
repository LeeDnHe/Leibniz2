package konkuk;

public class Leibniz {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		double temp =0;
		while(1.0/(2*n-1)>0.00001) {
			if(n%2==0) {
				temp = temp - 1.0/(2*n-1);
			}
			else
				temp = temp + 1.0/(2*n-1);
			n++;
		}
		System.out.println(temp);
	}

}
