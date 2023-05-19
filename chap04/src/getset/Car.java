package getset;

public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			this.stop = false;
		}else
			this.speed = speed;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == false) {
			speed = 0;
		}
	}
	
	
}
