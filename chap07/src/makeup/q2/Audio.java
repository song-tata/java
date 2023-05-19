package makeup.q2;

public class Audio implements IRemoteControler{

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio On");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio Off");
	}

	@Override
	public void setVolume(int volume) {
		
		if(volume>IRemoteControler.MAX_VOLUME) {
			this.volume = IRemoteControler.MAX_VOLUME;
		}else if(volume < IRemoteControler.MIN_VOLUME) {
			this.volume = IRemoteControler.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: "+this.volume);
		
	}		
}


