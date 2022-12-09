package exercise7;

public class TesteRobo {
	public static void main(String[] args) {
		RoboAlfa alfa = new RoboAlfa();
		RoboBeta beta = new RoboBeta();
		
		alfa.imprimePosicao();
		beta.imprimePosicao();
		
		alfa.moveBaixo(2, 4);
		beta.moveCima(21, 8);
		alfa.moveDireita(2, 0);
		beta.moveEsquerda(45, 12);
		
		alfa.imprimePosicao();
		beta.imprimePosicao();
	}
}
