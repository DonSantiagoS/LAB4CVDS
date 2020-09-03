package hangman.model;
import com.google.inject.Inject;
public class OriginalScore implements GameScore{
	
	private int puntaje;
	@Inject
	public OriginalScore(){
		puntaje = 100;	
	}
	/**
	@pre El juego comienza en 100 puntos
	@pos El juego inicia en 100 puntos
	@param correctCount numero de  letras correctas
	@param incorrectCount numero de  letras incorrectas
	@throws Excepción parametro invalido (correctCount<0, incorrectCount<0)
	@return puntaje
	**/
    public int calculateScore(int correctCount,int incorrectCount)  throws GameScoreException{
		if (incorrectCount <0 || correctCount<0) throw new GameScoreException(GameScoreException.NUMERO_NEGATIVO);
		else{
			puntaje-=incorrectCount*10;
			if (puntaje < 0) puntaje=0;
		}
		return puntaje;
	}
}