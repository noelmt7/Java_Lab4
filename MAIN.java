package LAB4;
abstract class Robber {
    public void RobberClass() {
        System.out.println("MScAI&ML");
    }
    public void MachineLearning() {
        System.out.println("I love MachineLearning");
    }
}

class JAVAProfessionalRobber extends Robber {
    int max = 0;
    int RowHouses(int[] money) {
        for(int i=0;i<2;i++){
            int temp = money[i] + money[i+2];
            int newmax = temp;
            if(newmax > max)
                max = newmax;
        }
        if(money[0] + money[money.length-1] > max)
            max = money[0] + money[money.length-1];
        return max;
    }
    int RoundHouses(int[] money){
        int max =0;
        for(int i=0;i<2;i++){
            int temp = money[i] + money[i+2];
            int newmax = temp;
            if(newmax > max)
                max = newmax;
        }
        return max;
    }
    int SquareHouse(int[] money){
        max = 0;
        for(int i=0;i<2;i++){
            int temp = money[i] + money[i+2];
            int newmax = temp;
            if(newmax > max)
                max = newmax;
        }
        return max;
    }
    int MultiHouseBuilding(int[][] money) {
        max = 0;

        for (int i = 0; i < 2; i++) {
            for(int j=0;j<2;j++) {
                int temp = money[i][j] + money[i][2];
                int newmax = temp;
                if (newmax > max)
                    max = newmax;
            }
        }
        return max;
    }
}
public class MAIN {

    public static void main(String[] args) {
        JAVAProfessionalRobber j = new JAVAProfessionalRobber();
        int result = j.RowHouses(new int[]{1, 2, 3, 0});
        System.out.println("Maximum money that can be robbed: " + result);
        int result2 = j.RoundHouses(new int[]{1, 2, 3, 4});
        System.out.println("Maximum money that can be robbed: " + result2);
        int result3 = j.SquareHouse(new int[]{5, 10, 2, 7});
        System.out.println("Maximum money that can be robbed: " + result3);
        int result4 = j.MultiHouseBuilding(new int[][] { { 5, 3, 8, 2 }, { 10, 12, 7, 6 }, { 4, 9, 11, 5 }, { 8, 6, 3, 7 } });
        System.out.println("Maximum money that can be robbed: " + result4);
    }

}