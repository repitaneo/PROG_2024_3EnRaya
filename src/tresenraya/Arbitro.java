package tresenraya;

public class Arbitro {

	public int hayGanadorVertical(char[][] tablero) {
		
		// miro las columnas y compruebo si en alguna hay un ganador
		for(int j=0;j<Tablero.DIMENSION;j++) {
			
			// memorizo la ficha de la fila 0
			char ficha0 = tablero[0][j];
			
			if(ficha0!=Tablero.FICHA_BLANCA && ficha0==tablero[1][j] 
				&& ficha0==tablero[2][j]) {
				
				return j;
			}
		}
		
		return -1;
	}

	
	
	
	
	public int hayGanadorHorizontal(char[][] tablero) {
		
		// miro las columnas y compruebo si en alguna hay un ganador
		for(int i=0;i<Tablero.DIMENSION;i++) {
			
			// memorizo la ficha de la fila 0
			char ficha0 = tablero[i][0];
			
			if(ficha0!=Tablero.FICHA_BLANCA && ficha0==tablero[i][1] 
				&& ficha0==tablero[i][2]) {
				
				return i;
			}
		}
		
		return -1;
	}
	
}
