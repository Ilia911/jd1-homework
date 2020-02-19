package by.htp.homework.algorithmization;

public class Fraction {

	private int num;
	private int den;

	Fraction() {
		num = 0;
		den = 1;
	}

	Fraction(int _num, int _den) {
		num = _num;
		den = _den;
	}

	public void setValues(int _num, int _den) {
		if (_den == 0) {
			_den = 1;
		}
		num = _num;
		den = _den;
	}

	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}

	public void print() {
		System.out.print(num + "/" + den + "; ");
	}

	
}
