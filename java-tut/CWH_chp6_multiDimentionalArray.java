public class CWH_chp6_multiDimentionalArray {
    public static void main(String[] args) {
        int marks[]=new int[5];//! 1D array
        int flats[][]=new int[2][3];//! 2D array
        flats[0][1]=101;
        flats[0][2]=102;
        flats[0][0]=103;
        flats[1][1]=201;
        flats[1][2]=202;
        flats[1][0]=203;

        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        // for (int elements:flats){

        // }
        

    }
}
