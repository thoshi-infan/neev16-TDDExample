public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String returnString() {
        if( divisibleByNumber(3) && divisibleByNumber(5) )
            return "FizzBuzz";
        if( divisibleByNumber(3) )
            return "Fizz";
        if( divisibleByNumber(5) )
            return "Buzz";
        return Integer.toString(number);
    }

    public boolean divisibleByNumber(int divisor){
        return number % divisor == 0;
    }
}
