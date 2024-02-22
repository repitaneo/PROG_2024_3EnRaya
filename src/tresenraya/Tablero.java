package tresenraya;

public class Tablero {

	public static final int DIMENSION = 3;
	public static final char FICHA_BLANCA = '#';
	public static final char FICHA_1 = 'X';
	public static final char FICHA_2 = 'O';
	
	private char tablero[][];

	
	public Tablero() {
		
		tablero = new char[DIMENSION][DIMENSION];
		for(int i=0;i<DIMENSION;i++) {
			for(int j=0;j<DIMENSION;j++) {
				
				tablero[i][j] = FICHA_BLANCA;
			}
		}
	}
	
	
	
	private void imprimir() {
		
		System.out.println("\n\n>>>>>>>>>>>>>>>>>>>>>>>");
		for(int i=0;i<DIMENSION;i++) {
			for(int j=0;j<DIMENSION;j++) {
				
				System.out.print(tablero[i][j]+" ");
			}
			System.out.println();
		}		
	}


	
	
	public void jugar() throws InterruptedException {

		char fichaColocar = FICHA_1;
		// veces que voy a colocar fichas
		for(int veces=0;veces<6;veces++) {
			
			int fila = (int)(Math.random()*DIMENSION);
			int columna = (int)(Math.random()*DIMENSION);
			while(tablero[fila][columna]!=FICHA_BLANCA) {
				
				fila = (int)(Math.random()*DIMENSION);
				columna = (int)(Math.random()*DIMENSION);
			}
			tablero[fila][columna] = fichaColocar;
			
			if(fichaColocar == FICHA_1) {
				fichaColocar = FICHA_2;
			}
			else fichaColocar = FICHA_1;
			
			imprimir();
			Thread.sleep(20);
			
			Arbitro arbitro = new Arbitro();
			int col = arbitro.hayGanadorVertical(tablero); 
			int fil = arbitro.hayGanadorHorizontal(tablero);
			
		}
		
	}
	
	
	
	
	
}
