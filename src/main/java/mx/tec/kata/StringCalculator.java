package mx.tec.kata;

public class StringCalculator {

	public int add(String numbers) {
		if (!numbers.isBlank()) {
			String[] numbersArray = numbers.split(",");
			int sum = 0;
			for (String num: numbersArray) {
				sum += Integer.parseInt(num);
			}
			return sum;
		} else return 0;
	}
	
	
}