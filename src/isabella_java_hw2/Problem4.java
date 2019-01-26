// code compiles but does not run

// GRADE: 1/10

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Circle 1 coordinates */
		Scanner circle_1_coords_input = new Scanner(System.in);
		System.out.println("What are circle 1's center coordinates?");
		String circle_1_coords = circle_1_coords_input.nextLine();
		String[] circle_1_coords_split = circle_1_coords.split("\\s");
		String circle_1_coord_1 = circle_1_coords_split[0];
		String circle_1_coord_2 =circle_1_coords_split[1];
		float circle_1_coord_1_int = Integer.parseInt(circle_1_coord_1);
		float circle_1_coord_2_int = Integer.parseInt(circle_1_coord_2);	
		
		/* Circle 2 coordinates */
		Scanner circle_2_coords_input = new Scanner(System.in);
		System.out.println("What are circle 2's center coordinates?");
		String circle_2_coords = circle_2_coords_input.nextLine();
		String[] circle_2_coords_split = circle_2_coords.split("\\s");
		String circle_2_coord_1 = circle_2_coords_split[0];
		String circle_2_coord_2 =circle_2_coords_split[1];
		float circle_2_coord_1_int = Integer.parseInt(circle_2_coord_1);
		float circle_2_coord_2_int = Integer.parseInt(circle_2_coord_2); 
		

	}

}
