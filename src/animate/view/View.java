package animate.view;

import java.util.Scanner;

import animate.controller.Controller;
import animate.model.MoveObject;
import java.util.Arrays;

public class View {
  
	
 
  //private MoveObject moveObject;
	
	public View() {
		

	

	}

		public void process() {
			Controller cont=new Controller(null, null);
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the width of the table");
			int width=scan.nextInt();
			
			System.out.println("Enter the height of the table");
			int height=scan.nextInt();
			
			System.out.println("Enter the starting position ");
			String position=scan.next();
			System.out.println("Enter the direction");
			String direct=scan.next();
			
		
		MoveObject moveObject= new MoveObject(width, height, position, direct);
			int rows = moveObject.getRows();
			int cols = moveObject.getCols();
			
			System.out.println("rows"+rows);
			

			String[][] matrix = new String[rows][cols];
			String currentPosition = moveObject.getCurrentPosition();
			String direction =moveObject.getDirection();
			System.out.println(direction);



			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = i +"," + j;

				}
				System.out.println("");
			}


			for (int x = 0; x < matrix.length; x++) {
				for (int y = 0; y < matrix[x].length; y++) {
					System.out.print(matrix[x][y] + " ");
					//	
				}
				System.out.println("");
			}

			System.out.println("matrix.size: \n" +matrix.length);
			System.out.println("matrix.size: \n" +matrix[0].length);
			System.out.println("matrix[2][2] : \n" +matrix[0][1]);

			Scanner commandStream = new Scanner(System.in);

			System.out.println("Enter 0 = quit simulation and print results to ​stdout\n" + 
					"1 = move forward one step\n" + 
					"2 = move backwards one step\n" + 
					"3 = rotate clockwise 90 degrees (eg north to east)\n" + 
					"4 = rotate counterclockwise 90 degrees (eg west to south) ");
			// Numerical input


			while (commandStream.hasNext()) {
				int command = commandStream.nextInt();
				System.out.println("command: " + command);
				if(command < 0 || command > 4)
				{
					System.out.println("Please only enter the following input - \n"
							+   "0 = quit simulation and print results to ​stdout\n" + 
							"1 = move forward one step\n" + 
							"2 = move backwards one step\n" + 
							"3 = rotate clockwise 90 degrees (eg north to east)\n" + 
							"4 = rotate counterclockwise 90 degrees (eg west to south) ");
				}

				else if(command == 0)
				{
					System.out.println("Current Postion After Exit : " +currentPosition);
					break;
				}
				else if(command == 1 ||command == 2)
				{
					currentPosition = cont.move(direction, command,currentPosition, matrix);
					System.out.println("Current Position: " +currentPosition);
				}

				else if (command == 3 || command == 4)
				{
					direction = cont.changeDirection(direction, command);
					System.out.println("Current Direction: " +direction);
				}

			}

			
		}

	

	
}






