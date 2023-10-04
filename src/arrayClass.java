public class arrayClass {
    public static void main(String[] args) {
        int[] lotteryNumbers = new int[5];

        for(int lotteryNumber: lotteryNumbers){
            System.out.println(lotteryNumber);
        }

        int[][] weeklyLotteryNumbers = {
                {1, 2, 3, 4, 5},
                {111, 20, 3, 4, 57},
                {12, 21, 38, 43, 55},
                {13, 20, 34, 44, 57}
        };

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                System.out.print(weeklyLotteryNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
