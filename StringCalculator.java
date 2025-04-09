

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        StringCalculator calc = new StringCalculator();

        System.out.println(calc.add("1\n2,3"));         
        System.out.println(calc.add("//;\n1;2"));       
        System.out.println(calc.add("//|\n2|5|7"));
    }
}