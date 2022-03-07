package org.rdoblas.fibonacci;

public class Fibonacci {

    /*
    *
    * Calcula el numero de fibonacci de forma iterativa
    *
     */
    public int compute(int value){
        if(value < 0){
            throw new RuntimeException();
        }else{
            int firstNumber = 0, secondNumber = 1;
            int counter = 1;
            int result = 0;

            while (counter < value) {
                result = secondNumber + firstNumber;
                firstNumber = secondNumber;
                secondNumber = result;
                counter ++;
            }
            return result;
        }
    }
}
