package designPattern.Facade;

public class HomeThreatorFacade {

	RoomLight roomlight ;
	SoundSystem soundSystem;
	Television television ;
	
	public HomeThreatorFacade(RoomLight roomlight, SoundSystem soundSystem, Television television) {
		super();
		this.roomlight = roomlight;
		this.soundSystem = soundSystem;
		this.television = television;
	}
	
	public void watchMovie() {
		roomlight.lightDim();
		television.switchOnTv();
		soundSystem.switchOnSoundSystem();
	 
	}
	
	public void stopWatching() {
		roomlight.lightBright();
		television.switchOffTv();
		soundSystem.switchOffSoundSystem();
	}
}
