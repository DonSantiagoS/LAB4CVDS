package hangman.model;
import com.google.inject.Inject;

public class BonusScore implements GameScore{
	private int puntaje;
	
	@Inject
	public BonusScore(){
            puntaje = 0;	
	}
	/**
	@pre El juego comienza en 100 puntos.
	@pos El juego inicia en 0 puntos.
	@param correctCount numero de  letras correctas
	@param incorrectCount numero de  letras incorrectas
	@throws Excepción parametro invalido (correctCount<0, incorrectCount<0)
	@return puntaje
	**/
    public int calculateScore(int correctCount,int incorrectCount) throws GameScoreException{
		if (incorrectCount <0 || correctCount<0) throw new GameScoreException(GameScoreException.NUMERO_NEGATIVO);
		else{
			puntaje+=correctCount*10;
			puntaje-=incorrectCount*5;
			if (puntaje < 0) puntaje=0;
		}
		
		
		return puntaje;
		
		
	}
}