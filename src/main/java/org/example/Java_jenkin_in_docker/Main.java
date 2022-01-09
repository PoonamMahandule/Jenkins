package org.example.Java_jenkin_in_docker;

/**
 * Hello world!
 *
 */
public class Main 

{
	public static boolean checkIfInputIsAnEventNumber(int number) {
		return number % 2 == 0;
	}
    public static void main( String[] args )
    {
        System.out.println(checkIfInputIsAnEventNumber(10));
    }
}
