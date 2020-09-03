package hangman.model;
public class GameScoreException extends Exception{
	public static final String NUMERO_NEGATIVO = "Numero invalido";
	
	public GameScoreException (String message){
		super(message);
	}
}