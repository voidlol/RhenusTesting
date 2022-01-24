package Task02;

public class Task2 {

    public int[] unionArrays(int[] firstArray, int[] secondArray) {
        if (!isSorted(firstArray) || !isSorted(secondArray)) {
            throw new ArrayStoreException();
        }
        int[] result = new int[firstArray.length + secondArray.length];
        int resultIndex = 0;
        int firstIter, secondIter;
        for (firstIter = 0, secondIter = 0; firstIter < firstArray.length && secondIter < secondArray.length;) {
            if (firstArray[firstIter] < secondArray[secondIter]) {
                result[resultIndex++] = firstArray[firstIter++];
            } else {
                result[resultIndex++] = secondArray[secondIter++];
            }
        }
        while (firstIter < firstArray.length) {
            result[resultIndex++] = firstArray[firstIter++];
        }

        while (secondIter < secondArray.length) {
            result[resultIndex++] = secondArray[secondIter++];
        }
        return result;
    }

    private boolean isSorted(int[] a)
    {
        if (a.length <= 1) {
            return true;
        }
        
        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
