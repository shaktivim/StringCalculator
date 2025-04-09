

public class StringCalculator {

    public String getDelimiter() {
        String delimiter = ",|\n"; // default delimiters having comma or newline
        return delimiter;
    }

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        
        String delimiter = getDelimiter();
        String[] parts = numbers.split(delimiter);
        
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
        // System.out.println(calc.add("//;\n1;2"));       
        // System.out.println(calc.add("//|\n2|5|7"));
    }
}