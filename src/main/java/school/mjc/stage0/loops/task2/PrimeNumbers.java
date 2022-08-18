package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int low = 0;
        while (low < printToInclusive) {
            boolean flag = false;
            int i =2;
            while (i <= low/2){
                // condition for nonprime number
                if (low % i == 0) {
                    flag = true;
                    break;
                }
                ++i;
            }
            if (!flag && low != 0 && low != 1)
                System.out.println(low);
            ++low;
        }
    }
}

