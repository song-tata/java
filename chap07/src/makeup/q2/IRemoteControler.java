package makeup.q2;

public interface IRemoteControler {
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
}
