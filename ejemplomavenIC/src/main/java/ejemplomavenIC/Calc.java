package ejemplomavenIC;

public class Calc {
	
	private int a;
	private int b;

	public Calc(int i, int j) {
		this.a = i;
		this.b = j;
	}

	public Integer sumar() {
		
		return this.a + this.b;
	}

	public Integer restar() {
		
		return this.a - this.b;
	}

	public Integer multiplicar() {
		return this.a * this.b;
	}

	public Integer dividir() {
		
		return this.a/this.b;
	}

}