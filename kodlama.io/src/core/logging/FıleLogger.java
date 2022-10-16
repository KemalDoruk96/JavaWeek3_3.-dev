package core.logging;

public class FıleLogger implements Logger {
	@Override
	public void log(String data) {
		System.out.println("Log to File" + data);
		
	}

}
