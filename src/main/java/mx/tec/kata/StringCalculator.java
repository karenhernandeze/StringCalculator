package mx.tec.kata;

import java.util.ArrayList;
import java.util.List;

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
			List<Integer> negativeNumbers = new ArrayList();
			for (String num: numbersArray) {
				int number = Integer.parseInt(num);
				if (number < 0) {
					negativeNumbers.add(number);
				}
				sum += number;
			}
			if (!negativeNumbers.isEmpty()) {
				String negativeList = negativeNumbers.toString().substring(1, negativeNumbers.toString().length()-1);
				throw new UnsupportedOperationException("negatives not allowed "+ negativeList);
			}
			return sum;
		} else return 0;
	}
	
	
}