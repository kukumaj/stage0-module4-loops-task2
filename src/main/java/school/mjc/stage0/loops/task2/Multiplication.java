package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            return;
        }
        int number = 0;
        int result;
        if (multiplyByAndToInclusive < 0) {
            while (number >= multiplyByAndToInclusive) {
                result = -number *  (multiplyByAndToInclusive);
                System.out.println(result);
                number--;
            }}
        else{
                while (number <= multiplyByAndToInclusive) {
                    result = number *  (multiplyByAndToInclusive);
                    System.out.println(result);
                    number++;
                }
            }

        }
//        while (number <= multiplyByAndToInclusive) {
//            if (number == 0) {
//                System.out.println(number * multiplyByAndToInclusive);
//            }
//            else if (multiplyByAndToInclusive < 0){
//                System.out.println(number * (-multiplyByAndToInclusive));
//                number
//            }
//            else {
//                System.out.println(number * multiplyByAndToInclusive);
//            }
//            number++;
//        }
    }

