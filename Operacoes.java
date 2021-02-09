
public class Operacoes {

	private int resultado,resultadoDivide;
	private double resultadoMedia,resultadoSoma,resultadoSubtrai,resultadoMulti;
	
	public double getResultadoMedia() {
		return resultadoMedia;
	}
	public void setResultadoMedia(double resultadoMedia) {
		this.resultadoMedia = resultadoMedia;
	}
	public int getResultadoDivide() {
		return resultadoDivide;
	}
	public void setResultadoDivide(int resultadoDivide) {
		this.resultadoDivide = resultadoDivide;
	}
	public double getResultadoSoma() {
		return resultadoSoma;
	}
	public void setResultadoSoma(double resultadoSoma) {
		this.resultadoSoma = resultadoSoma;
	}
	public double getResultadoSubtrai() {
		return resultadoSubtrai;
	}
	public void setResultadoSubtrai(double resultadoSubtrai) {
		this.resultadoSubtrai = resultadoSubtrai;
	}
	public double getResultadoMulti() {
		return resultadoMulti;
	}
	public void setResultadoMulti(double resultadoMulti) {
		this.resultadoMulti = resultadoMulti;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	public void soma(int n1, int n2) {
	this.resultadoSoma = n1 + n2;

	}
	public void subtrai(int n1, int n2) {
		this.resultadoSubtrai = n1 - n2;
	}
	public void multiplica(int n1,int n2) {
		this.resultadoMulti = n1 * n2;
	}
	public void divide(int n1,int n2) {
		this.resultadoDivide = n1 / n2;
	}
	public void media(double n1, double n2, double n3) {
		this.resultadoMedia = n1 + n2 + n3;
		
	}
	
	
	
	
	
}
