package sobrecarga;

public class Sobrecarga {
	public int suma(int x,int y) {
		int r=x+y;
		return r;
	}
	//esto si es una sobrecarga de método
	public double suma(double x,double y) {
		return x+y;
	}
	
	
	public int resta(int x,int y) {
		return x-y;
	}
	
}
