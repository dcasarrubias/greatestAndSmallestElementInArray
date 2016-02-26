/* David Casarrubias-Mena
 * In this program I prompt the user for 5 numbers, store them in an integer array, and then print out the largest and smallest number 
 * entered by the user. I also display the current value in the array. 
 */
import java.util.*;
public class CompSciReview {
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int [] array = new int[10];
		
		double largest = array[0];
		double smallest = array[0];
		
		for(int i = 0; i < 5; i++){
			System.out.println("Enter number: ");
			array[i] = input.nextInt();
			
			
			System.out.println("Current value in array " + array[i]);
			
			if(array[i] > largest){
				largest = array[i];
			}
			
			else if(array[i] < smallest){
				smallest = array[i];
			}

		}
		System.out.println("Largest element is : " + largest);
		System.out.println("Smallest element is: " + smallest);

		
	}
		
		
}

	

