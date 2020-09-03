package src.test;
import hangman.model.*;
import org.junit.Assert;
import org.junit.Test;
/**
		ORIGINAL SCORE
		
													 Resultado
		Clase1   correctCount<0 || incorrectCount<0  Invalido
		Clase2   0<=incorrectCount<10				 Valido
		Clase3   10<=incorrectCount                  Valido 0
		
		BONUS SCORE
		
															Resultado
		Clase1   correctCount<0 || incorrectCount<0  		Invalido
		Clase2   0<=incorrectCount=<5 && 0<correctCount<10  Valido
		Clase3   1<=incorrectCount && correctcount==0      Valido 0
		
		POWER SCORE
		
															Resultado
		Clase1   correctCount<0 || incorrectCount<0  		Invalido
		Clase2   0<=incorrectCount=<5 && 0<correctCount<10  Valido
		Clase3   0<=incorrectCount<10 && correctCount>3     Valido 500
		Clase4    1<=incorrectCount && correctcount==0         Valido 0
	**/
public class GameScoreTest{
	//original score
	@Test
    public void DeberiaLanzarExcepcion1() throws GameScoreException {
        GameScore puntaje= new OriginalScore();
		try{
		 int score= puntaje.calculateScore(-5,-4);
         int fail= 500/0;
		 }
      catch(Exception ex){
       }
    }
	@Test
    public void DeberiaCalcularPuntaje1() throws GameScoreException{
		GameScore puntaje= new OriginalScore();
        int score= puntaje.calculateScore(2,5);
        Assert.assertEquals(score,50);
    }
	@Test
    public void DeberiaCalcularPuntaje2() throws GameScoreException{
		GameScore puntaje= new OriginalScore();
        int score= puntaje.calculateScore(1,11);
        Assert.assertEquals(score,0);
    }
	//bonus score
	@Test
    public void DeberiaLanzarExcepcion2() throws GameScoreException{
        GameScore puntaje= new BonusScore();
		try{
		 int score= puntaje.calculateScore(-1,-9);
         int fail= 500/0;
		 }
      catch(Exception ex){
       }
      
    }
	@Test
    public void DeberiaCalcularPuntaje3() throws GameScoreException{
		GameScore puntaje= new BonusScore();
        int score= puntaje.calculateScore(3,5);
        Assert.assertEquals(score,5);
    }
	@Test
    public void DeberiaCalcularPuntaje4() throws GameScoreException{
		GameScore puntaje= new BonusScore();
        int score= puntaje.calculateScore(0,2);
        Assert.assertEquals(score, 0);
    }
	
	
	//power score
	@Test
    public void DeberiaLanzarExcepcion3() throws GameScoreException{
        GameScore puntaje= new PowerScore();
		try{
		 int score= puntaje.calculateScore(-2,-2);
         int fail= 500/0;
		 }
      catch(Exception ex){
       }
      
    }
	@Test
    public void DeberiaCalcularPuntaje5() throws GameScoreException{
		GameScore puntaje= new PowerScore();
        int score= puntaje.calculateScore(2,3);
        Assert.assertEquals(score,6);
    }
	@Test
    public void DeberiaCalcularPuntaje6() throws GameScoreException{
		GameScore puntaje= new PowerScore();
        int score= puntaje.calculateScore(4,2);
        Assert.assertEquals(score,500);
    }
	@Test
    public void DeberiaCalcularPuntaje7() throws GameScoreException{
		GameScore puntaje= new PowerScore();
        int score= puntaje.calculateScore(0,5);
        Assert.assertEquals(score,0);
    }
}