package com.company;
//import java.util.Scanner; // #1
//import java.lang.Math; // #2 & #3
public class Main {

    public static void main(String[] args) {
    	// #1
//    	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//		System.out.println("Enter weight");
//		String inputW = myObj.nextLine();
//
//		int p = 0;
//		int w = Integer.parseInt(inputW);
//
//		if (w <= 2)
//	    	p = 3;
//		if ((2 < w) & (w <= 5))
//	    	p = 3 + (w - 2) * 2;
//		if (w > 5)
//	    	p = 3 + (2 * 3) + (w - 5) * 3;
//        	System.out.println(p);

        // #2
//		int a = 4;
//		double b= Math.pow(3, a);
//		System.out.println(b);

		// #3
//		int a = 4;
//		int b = 3;
//		double c = Math.pow (b, a);
//		System.out.println(c);

          // #4
//        boolean value = false;
//        int  n = 0;
//        int d = 47;
//
//        while (value == false)
//        {
//            if ((n*n*n + 91) % d == 0)
//                value = true;
//
//                else
//                n = n + 1;
//        }
//        System.out.println(n);

        //#5
        int t = 0;
        int bt1;
        int bt2;
        int bdm = 0;
        int btm = 0;

        while (t < 100)
        {
            bt1 = t * (t - 20) * (t - 100) + 120000;
            bt2 = (t+1)*((t+1)-20)*((t+1)-100)+120000;
            if (t==0)
            {
                bdm = bt2 - bt1;
                btm = t +1;
            }
            else
            {
                if (bt2 - bt1 < bdm)
                {
                    bdm = bt2 - bt1;
                    btm = t + 1;
                }
            }
            t = t + 1;
        }
        System.out.println(btm);

    }
}
