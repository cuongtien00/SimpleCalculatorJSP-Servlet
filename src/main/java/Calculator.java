public class Calculator {
    public Calculator() {
    }

    public static float calculate(float firstO, float secondO, String operator) {
        switch (operator) {
            case "+":
                return firstO + secondO;
            case "-":
                return firstO - secondO;
            case "*":
                return firstO * secondO;
            case "/":
                try{
                    return firstO / secondO;
                }catch (ArithmeticException a){
                    a.printStackTrace();
                }

            default:
                return -1;
        }

    }
}
