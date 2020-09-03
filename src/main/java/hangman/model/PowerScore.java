package hangman.model;

public interface PowerScore{
	/**
	@pre El juego comienza en 100 puntos
	@pos El juego inicia en 0 puntos.
	@param correctCount punto por letra correcta
	@param incorrectCount punto por letra incorrecta
	**/
    public int calculateScore(int correctCount,int incorrectCount){
	}
}