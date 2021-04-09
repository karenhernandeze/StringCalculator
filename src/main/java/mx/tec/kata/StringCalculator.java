package mx.tec.kata;

public class StringCalculator {

	public int add(String numbers) {
		String delimiter = ",";
		if (!numbers.isBlank()) {
			if(numbers.startsWith("//")) {
				delimiter = numbers.substring(2,3);
				numbers = numbers.substring(4);
			}
			String sanitizedNumbers = numbers;
			String[] numbersArray = sanitizedNumbers.split("\\n|" + delimiter);
			int sum = 0;
			for (String num: numbersArray) {
				sum += Integer.parseInt(num);
			}
			return sum;
		} else return 0;
	}
	
	
}