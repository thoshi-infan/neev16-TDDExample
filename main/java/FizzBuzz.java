public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String returnString() {
        if(number % 3 == 0) return "Fizz";
        return null;
    }
}
