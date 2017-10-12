package Thread;
//package is Thread
public class ThreadExample extends Thread  {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
	//classes are the basics of opps(object oriented programming)
	public void run()
	//void is used to define the return type of the method
	//public void run-if this thread object was instantiated using a runnable 
	//target, the run() method is invoked on that runnable
		
		/*here we create run method which will execute when thread is
		 * Called
		 */
		
		{
	/*the code is prone to exceptions is placed in the try block
	*when exception occurs that exception occurred is handled by the 
	*catch block associated with it
	*/
			for(int n=1;n<=10;n++){
				//loop will go for 10 times
				//here sleep() it makes current executing thread to sleep
				//for a specified interval of time. Time is in milli seconds.
				//sleep method throws InterruptedException
				try
			{
					Thread.sleep(3000);
		//here thread will sleep for every given no.of seconds
			}
			catch(InterruptedException e)
			{
		//if not it will get interrupted or terminated		
			}
	//system is final class
	//out is a static member of system class and type printStream
	//println is method of printStream class.ln means nextline
					
			System.out.println("Welcome to Acadgild");
			//it will print for 3 seconds
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
	//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		ThreadExample object=new ThreadExample();//new object is created
		object.start();//thread gets started.
	
	}

}
