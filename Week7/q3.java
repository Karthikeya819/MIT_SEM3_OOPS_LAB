/*
Design an interface called Series with the following methods
i) Get Next (returns the next number in series)
ii) reset(to restart the series)
iii) set Start (to set the value from which the series should start)
Design a class named By Twos that will implement the methods of the interface Series
such that it generates a series of numbers, each two greater than the previous one.
Also design a class which will include the main method for referencing the interface.
*/

interface Series{
	public int GetNext();
	public void reset();
	public void setStart(int start);
}
class ByTwos implements Series{
	int prev = 0;
	public int GetNext(){
		prev += 2;
		return prev;
	}
	public void reset(){
		prev = 0;
	}
	public void setStart(int start){
		prev = start;
	}
}

class q3{
	public static void main(String args[]){
		Series ser;
		ser = new ByTwos();
		System.out.println(ser.GetNext());
	}
}
