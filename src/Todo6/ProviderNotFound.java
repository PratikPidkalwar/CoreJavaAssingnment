package Todo6;

public class ProviderNotFound extends Exception {

	private String invalidProvider;
	
	public ProviderNotFound(String errorMessage, String invalidProvider) {
		super(errorMessage);
		this.invalidProvider=invalidProvider;
	}
	@Override
	public String getMessage(){
		String message = super.getMessage();//Invokes getMessage from Exception class
		String finalMessage = message + ": " + invalidProvider;
		return finalMessage;
	}

}
