/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
                int base, exponent;
		Scanner sc=new Scanner(System.in);
		base=sc.nextInt();
	            exponent=sc.nextInt();
        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println(+result);
	}
}
