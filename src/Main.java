public class Main {

    public static void main(String[] args) {
        int[] array = {1, 4, 7, 9, 10, 21, 34, 18, 2, 32, 21, 213};
        int key = 15;

        int resultI = Binary.binarySearchI(array, key);
        System.out.println(resultI);
        int resultR = Binary.binarySearchR(array, key);
        System.out.println(resultR);

    }

}
