package by.htp.homework.basic_of_oop.task2;

public class View {

	public static void print(Payment payment) {

		System.out.println("Payment num: " + payment.getPaymentId());
		for (Payment.Product p : payment.getList()) {
			System.out.println(p.toString());
		}
		System.out.println("Result sum: " + payment.getResultSum());

	}

}
