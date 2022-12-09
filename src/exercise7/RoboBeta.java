package exercise7;

public class RoboBeta extends RoboAbstrato {
	protected void imprimePosicao() {
		System.out.println("Robô beta: (" + this.getX() + ", " + this.getY() + ")");
	}
	
	@Override
	protected void moveDireita(double dx, double par) {
		this.setX(this.getX() + (int) dx);
	}
	
	@Override
	protected void moveEsquerda(double dx, double par) {
		this.setX(this.getX() - (int) dx);
	}
	
	@Override
	protected void moveCima(double dy, double par) {
		this.setY(this.getY() + (int) dy);
	}
	
	@Override
	protected void moveBaixo(double dy, double par) {
		this.setY(this.getY() - (int) dy);
	}
}
