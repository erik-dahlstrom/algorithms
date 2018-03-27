//completed

package CodeFights;

public class AdjacentElementsProduct {

    public static void main(String[] args) {
        int[] inputArray = new int[] {3, 6, -2, -5, 7, 4};
        int[] inputArray2 = new int[] {-23, 4, -3, 8, -12};
        int[] inputArray3 = new int[] {1, 0, 1, 0, 1000};
        System.out.println("result: " + adjacentElementProduct(inputArray3));
    }
    private static int adjacentElementProduct(int[] inputArray) {
        int index = 0;
        int largest = inputArray[0] * inputArray[1];
        int result = 0;

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Index: " + index + ", Value: " + inputArray[i]);

            if (index == inputArray.length-1) {
                if (result >= largest) {
                    return result;
                } else
                return largest;
            }
            result = inputArray[i] * inputArray[i+1];

            if (result >= largest) {
                largest = result;
            }
            index++;
        }

        return largest;
    }
}
