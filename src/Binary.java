public class Binary {
    private static int binarySearchAux(int[] sortedList, int left, int right, int key) {
        if (left > right) { // value not found
            return left + (right - left) / 2;
        }

        int middle = (left + right) / 2;
        if (key == sortedList[middle]) {
            return middle;
        } else if (key < sortedList[middle]) {
            return binarySearchAux(sortedList, left, middle - 1, key);
        } else {
            return binarySearchAux(sortedList, middle + 1, right, key);
        }
    }

    // returns element index in list OR -1 for "not found"
    public static int binarySearchR(int[] sortedList, int key) {
        return binarySearchAux(sortedList, 0, sortedList.length - 1, key);
    }

    // returns element index in list OR -1 for "not found"
    public static int binarySearchI(int[] sortedList, int key) {
        int left = 0, right = sortedList.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (key == sortedList[middle]) {
                return middle;
            } else if (key < sortedList[middle]) {
                right = middle - 1;
            } else if (key > sortedList[middle]) {
                left  = middle + 1;
            }
        }

        return left + (right - left) / 2;
    }
}
