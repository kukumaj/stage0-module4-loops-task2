package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int countLowest = 0;
        int sum = 1;
        while (countLowest <= printToInclusive) {
            if (countLowest == 0)
                sum = sum * (countLowest + 1);
            else
                sum = sum * countLowest;
            countLowest++;
            System.out.println(sum);
        }
    }
}

