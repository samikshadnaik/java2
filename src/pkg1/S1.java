package pkg1;
public class S1 {
	public static void  genotp(int size,int qty) {
		for(int i=0;i<qty;i++){
			double d1=Math.random()*(Math.pow(10,size));
			int otp1=(int)d1;
			System.out.println(otp1);
	}
	}

	public static void main(String[] args) {
		genotp(4,10);
		//genotp(6,10);		
		
	}
	
}
