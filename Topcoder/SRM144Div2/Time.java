public class Time {

	public String whatTime(int seconds) {
		int hours = (int)seconds / 3600;
		seconds = seconds - hours * 3600;
		int min   = (int)seconds / 60 ;
		seconds = seconds - min * 60;
		return  hours + ":" + min + ":" + seconds;
	}

}
