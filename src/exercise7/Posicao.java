package exercise7;

abstract public class Posicao {
	protected int x, y;

	protected int getX() {
		return x;
	}

	protected void setX(int x) {
		this.x = x;
	}

	protected int getY() {
		return y;
	}

	protected void setY(int y) {
		this.y = y;
	}
	
	protected String retornaPosicao() {
		return "(" + this.getX() + ", " + this.getY() + ")";
	}
}
