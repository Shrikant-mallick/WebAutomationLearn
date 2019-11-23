package WTW;

import java.util.Random;

public class RandomNo {

	public static void main(String[] args) 
	{

		Random objGenerator = new Random();
        for (int iCount = 0; iCount< 10; iCount++)
        {
          int randomNumber = objGenerator.nextInt(10);
          System.out.println("Random No : " + randomNumber); 
//          //int random = Math.random();
//          //System.out.println(Math.random());
        }
		
	}

}
