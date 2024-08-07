package designPattern.Facade;

public class User {
	
	public static void main(String[] args) {
		
		RoomLight rt = new RoomLight();
		Television tt = new Television();
		SoundSystem ss = new SoundSystem();
		
		HomeThreatorFacade facade = new HomeThreatorFacade(rt,ss,tt);
		
		facade.watchMovie();
//		facade.stopWatching();
		
	}

}
