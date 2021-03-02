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
	//Restar
	public Integer restar() {
		
		return this.a - this.b;
	}
	//multiplicar
	public Integer multiplicar() {
		return this.a * this.b;
	}
	//Dividir
	public Integer dividir() {
		
		return this.a/this.b;
	}

}
