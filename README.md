# StringCalculator
    A simple Java-based calculator that parses and adds numbers from a string using customizable delimiters.

# Features
    1. Simple String calculator with a method signature like this:
            int add(string numbers)
        Input: a string of comma-separated numbers
        Output: an integer, sum of the numbers
    2. Allow the add method to handle any amount of numbers.
    3. Support different delimiters:
    4. To change the delimiter, the beginning of the string will contain a separate line that   looks like this: "//[delimiter]\n[numbers…]".
         For example, "//;\n1;2" where the delimiter is ";" should return 3
    5. Calling add with a negative number will throw an exception: "negative numbers not allowed <negative_number>".
        If there are multiple negative numbers, show all of them in the exception message, separated by commas.