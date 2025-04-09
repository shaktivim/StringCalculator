import java.util.regex.Pattern;

public class StringCalculator {

    public String[] getNumbersWithDelimiter(String numbers) {
        String delimiter = ",|\n"; // default delimiters having comma or newline
        
        // Check for custom delimiter
        if (numbers.startsWith("//")) {
            int delimiterEndIndex = numbers.indexOf("\n");
            delimiter = Pattern.quote(numbers.substring(2, delimiterEndIndex)); // Escape regex symbols
            numbers = numbers.substring(delimiterEndIndex + 1);
        }
        return numbers.split(delimiter);
    }

    public int add(String numbers) {
        // Will return zero if number string passed is either blank of null
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        
        // Get the parts of numbers after delimiters
        String[] parts = getNumbersWithDelimiter(numbers);
        
        // Initializing the sum value
        int sum = 0;
        for (String part : parts) {
            int number = Integer.parseInt(part.trim());
            sum += number;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        StringCalculator calc = new StringCalculator();

        System.out.println(calc.add("1,2,3"));         
        System.out.println(calc.add("1\n2,5"));         
        System.out.println(calc.add("//;\n1;2"));       
        // System.out.println(calc.add("//|\n2|5|7"));
    }
}