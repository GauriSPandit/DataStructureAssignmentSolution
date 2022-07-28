package Service;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DailyFloors {
	
	public static void countDaysFloor( int totalFloors ,Queue<Integer> floorQueue) {
		
		int todaysMaxFloor= totalFloors;//creating a copy of totalFloors for calculation
		
		Queue<Integer> tempQueue = new LinkedList<>();//created a helping queue
		
		System.out.println("\nThe order of construction is as follows");

		for (int dayWiseFloor = 1; dayWiseFloor <= totalFloors; dayWiseFloor++) //loop for daywise display
		{
			System.out.println("\nDay:"+ dayWiseFloor);
			
			int floor = (int) floorQueue.remove();
		
				if(floor== todaysMaxFloor) 
				{
					System.out.print(floor+" ");
					todaysMaxFloor--;
					if(!tempQueue.isEmpty()) {
							for (int a = 0; a <=tempQueue.size(); a++) {
								
								int tempFloor = (int) tempQueue.remove();
								
								if(todaysMaxFloor== tempFloor) {
									System.out.print(tempFloor+" ");
									a=0;
									todaysMaxFloor--;
									
								}
								else {
									tempQueue.add(tempFloor);
								}
								
								}
					}
				}
				else {
					tempQueue.add(floor);
				}
		}
	return;		

	}

}
