package dad.codesignal;

public class TheJourneyBegins {

	//1º ejercicio
	int add(int param1, int param2) {
	    return param1+param2;
	}
	
	//2º ejercicio
	int centuryFromYear(int year) {
	    return (int)Math.floor(year / 100) + ((year % 100.0 == 0)? 0 : 1);
	}
}
