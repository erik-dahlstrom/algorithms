//incomplete

package CodeFights;

import java.util.Arrays;

public class MakeArrayConsecutive {

    public static void main(String[] args) {
        int [] statues = new int[] {6, 2, 3, 8};
        System.out.println(makeArrayConsecutive2(statues));
        //expected result = 3
        // 2, 3, (4), (5), 6, (7), 8

    }
    private static int makeArrayConsecutive2(int[] statues) {
        int result = 0;

        Arrays.sort(statues);

        int smallest = statues[0];
        int largest = statues[statues.length-1];

        System.out.println("Smallest: " + smallest + ", Largest: " + largest);

        for (int i = smallest+1; i < largest; i++) {
            System.out.println("Test: " + i);
            if (!Arrays.asList(statues).contains(i)) {
                result ++;
            }
        }

        return result;
    }
}
