package Java17;
/*
Random number generation is the process of generating unpredictable number for application such as OTP generation, password generation and online gaming.
For this we are using random generator interface which is available in java.util.Random package.
*/

import java.util.random.RandomGenerator;

public class randomgeneratorDemo {

	public static void main(String[] args) {
		RandomGenerator r=RandomGenerator.getDefault();
		System.out.println(r.nextInt(1000));
		int otp= r.nextInt(1,100);
		System.out.println("OTP is : "+otp);
	}

}
