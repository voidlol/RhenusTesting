package Task01;

public class Task1 {

    public int calcSumOfMissingNumbers(int[] array) {
        int[] maxAndMin = getMaxAndMin(array);
        int sum = 0;
        for (int number = maxAndMin[1] + 1; number < maxAndMin[0]; number++) {
            boolean isPresent = false;
            for (int numberInArray : array) {
                if (numberInArray == number) {
                    isPresent = true;
                    break;
                }
            }
            sum += isPresent ? 0 : number;
        }
        return sum;
    }

    private int[] getMaxAndMin(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int number : array) {
            if (number > max) max = number;
            if (number < min) min = number;
        }
        return new int[] {max, min};
    }
}
