package Driver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Service.DailyFloors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println("Enter the total no of floors in the building");	//Input for Total Floors
	Scanner sc = new Scanner(System.in);
	int totalFloors = sc.nextInt();//Storing the Total No of Floors
	
	Queue<Integer> floorQueue = new LinkedList<>();//Declaring queue for storing the data;
	/*Queue (FIFO) is selected since order of input is important in current scenario */
	
	for (int dayInput = 1; dayInput <= totalFloors; dayInput++) {
		
		System.out.println("Enter the floor size given on day : " + dayInput);
		int floor = sc.nextInt(); //Floor size to store day wise
		
		if(floor==0 )//considering error if floor is entered as 0
		{
			System.out.println("Entered value is 0 ");
			System.out.println("Kindly retry" +"\n");
			dayInput--;
		}else if(floorQueue.contains(floor)) //considering error for duplicate values
		{
			System.out.println("Input is duplicate value: " + floor);
			System.out.println("Previously entered values " + floorQueue);
			System.out.println("Kindly retry" +"\n");
			dayInput--;
		}else if(floor>totalFloors)// considering error if entered value is greater than total floors 
		{
			System.out.println("Input value is greater than the total no of floors in the building("+totalFloors+")");
			System.out.println("Entered value is " + floor);
			System.out.println("Kindly retry" +"\n");
			dayInput--;
		}
		else{
		floorQueue.add(floor);//if none of the above errors are found the value is added to the queue
		}
	}
	
	DailyFloors.countDaysFloor(totalFloors,floorQueue);//calling the service to diplayconstruction plan

	}
}
	