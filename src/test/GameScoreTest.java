package src.test;
import src.main.java.hangman.model.*;
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
		Clase4   4<=incorrectCount && 0<correctCount<2       Valido 0x
**/
public class GameScoreTest{
	


}