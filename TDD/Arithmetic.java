public class Arithmetic {
    public int add(int number1, int number2){
        return (number1+number2);
    }
    public int substract(int number1, int number2){
        return (number1-number2);
    }
    public int multiply(int number1, int number2){
        return (number1*number2);
    }
    public int divide(int number1, int number2){
        if(number1==0 && number2>0){
            return 0;
        }
        else if(number2==0 && number1>0){
            return -1;
        }
        else {
            return (number1 / number2);
        }
    }
}
