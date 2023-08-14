public class HW09 {
    public static void main(String[] args) {
        int shuttleNum = 1;
        for (int i = 0; i < 100; i++) {


            if (shuttleNum % 10 == 4 || shuttleNum % 10 == 9) {
                shuttleNum++;

            }
           if(shuttleNum / 10 % 10 == 4 || shuttleNum / 10 % 10 == 9){
               shuttleNum +=10;
           }

            System.out.println(shuttleNum);
            shuttleNum++;
        }

    }
}
