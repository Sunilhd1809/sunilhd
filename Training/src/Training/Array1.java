package Training;
import java.util.*;
public class Array1 {
	public static void main(String args[])
	{
		int i[]= {9,19,18};
		//jagged array
		int i2[][]= {{45,3,23},{34,76,89},{9,19}};
 		//length is a property of every array
 		for(int j=0;j<i.length;j++)
 			System.out.println(i[j]);
 		System.out.println();
 		for(int t:i)
 			System.out.println(t);
 		System.out.println();
 		for(int a[]:i2)
 			for(int b:a)
 		System.out.println(b);		
	}

}

