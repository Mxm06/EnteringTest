package EnteringTest;

public class MathOperations {
    //Switch с операциями
    public int MathSwitch(String symbol,int firstDigitInt,int secondDigitInt) {
        int result=0;
        switch (symbol) {
            case ("+") -> result = firstDigitInt + secondDigitInt;
            case ("-") -> result = firstDigitInt - secondDigitInt;
            case ("*") -> result = firstDigitInt * secondDigitInt;
            case ("/") -> result = firstDigitInt / secondDigitInt;

            default -> throw new NullPointerException("Неподходящая математическая операция");
        }

        return result;
    }
}