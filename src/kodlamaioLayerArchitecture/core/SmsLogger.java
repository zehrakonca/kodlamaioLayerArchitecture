package kodlamaioLayerArchitecture.core;

public class SmsLogger implements Logger{

	@Override
	public void Log() {
		System.out.println("SMS sent to the specified address.");
		
	}

}
