import java.util.ArrayDeque;
import java.util.Random;

public class CarQueue
{

	ArrayDeque <Integer> q1; 
	
	
	public CarQueue(){
		
		q1 = new ArrayDeque<Integer>();
		
		for (int i = 0; i < 5; i++) {
			q1.add(new Random().nextInt(4));
		}
	}
	
	public void addToQueue() 
	{
		class myQueue implements Runnable
		{

			@Override
			public void run() 
			{
				while (true)
				{
					q1.add(new Random().nextInt(4));
					try {
						Thread.sleep(500);
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		Runnable r = new myQueue();
		Thread t = new Thread(r);
		
		t.start();
		
	}

	public int deleteQueue() 
	{
		return q1.remove();
	}

	

	
}