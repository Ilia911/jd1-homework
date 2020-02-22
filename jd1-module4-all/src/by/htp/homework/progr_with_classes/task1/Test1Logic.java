package by.htp.homework.progr_with_classes.task1;

public class Test1Logic {
	
	public int sum(Test1 test) {
		int sum;
		sum = test.getNum1() + test.getNum2();
		return sum;
	}
	public int findMax(Test1 test) {
		int max;
		max = test.getNum2();
		if (test.getNum1() > test.getNum2()) {
			max = test.getNum1();
		}
		return max;
	}

}
