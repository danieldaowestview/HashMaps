
public class MapThread extends Thread{
	int count = Animate.frames.length;
	public void run() {
		int counter = 0;
		while(counter++ < count) {
			System.out.println(Animate.frames[counter%count]);
			try {
				sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	 
	
}
