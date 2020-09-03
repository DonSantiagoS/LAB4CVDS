package hangman.model;
import com.google.inject.Inject;

public class PowerScore implements GameScore{
	private int puntaje;
	
	@Inject
	public PowerScore(){
		puntaje = 0;	
	}
/**
	@pre El juego comienza en 100 puntos
	@pos El juego inicia en 0 puntos.
	@param correctCount numero de  letras correctas
	@param incorrectCount numero de  letras incorrectas
	@throws Excepción parametro invalido (correctCount<0, incorrectCount<0)
	@return puntaje
	**/
    public int calculateScore(int correctCount,int incorrectCount) throws GameScoreException{
		if (incorrectCount <0 || correctCount<0) throw new GameScoreException(GameScoreException.NUMERO_NEGATIVO);
		else{
			
			puntaje-=incorrectCount*8;
			for (int i=1; i<=correctCount; i++){
				puntaje+= Math.pow(5,i);
			}
			
			if (puntaje > 500) puntaje=500;
		
			if (puntaje < 0) puntaje=0;
		}
		
		
		return puntaje;
	}
}