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
		
//		String SALTCHARS = "1234567890";
//        StringBuilder salt = new StringBuilder();
//        Random rnd = new Random();
//        while (salt.length() < 10) 
//        { 
//        	// length of the random string.
//            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
//            salt.append(SALTCHARS.charAt(index));
//        }
//        String saltStr = salt.toString();
//        return saltStr;
	}

}
