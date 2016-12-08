package main;

public class LatchedDigitalInput {/*delay one input and get the original input
*maybe loop over and over
*how to take input over and over
*/
//private static int maxValue = 100;
//private static boolean[] streamOne = new boolean[maxValue];//make array that carries over every instance and use it as stream
//private static int metCompl = 0;//used to put things into arrays
public boolean pushed;
private static boolean prevPush;
private int sum;

	{//do other option to get late option/*have to figure out how to do it in the end
		
		//streamOne[metCompl] = pushed;
		//metCompl++;
}
	public boolean toBoolean(double push){
		if(push >= 0.2){
		pushed = true;	
		}
		else{
			pushed=false;
		}
		int prevValue = (prevPush == true)? 1:0;
		int curValue =(pushed == true)? 1:0;
		sum = prevValue + curValue;
		if(sum == 1){/*have to figure out how to do it in the end
		*/
			prevPush =!prevPush;
		}
		return sum == 1;
	}
}