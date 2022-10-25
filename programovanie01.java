package text;

public class programovanie01 {
public static  void main(String[] args){
    //create an 5x6 array with randomly generated numbers
    int[][] array = new int[5][6];
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 6; j++) {
            array[i][j] = (int) (Math.random() * 50);
        }
    }

    //print out the array
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 6; j++) {
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }

    //find min and max in each row

    for (int i = 0; i < 5; i++) {              //and get the arithmetic mean of the row
        int min = array[i][0];
        int max = array[i][0];
        for (int j = 0; j < 6; j++) {
            if (array[i][j] < min) {
                min = array[i][j];
            }
            if (array[i][j] > max) {
                max = array[i][j];
            }
        }

        int sum = 0;
        for (int j = 0; j < 6; j++) {
            sum += array[i][j];
        }
        double mean = (double) sum / 6;




    }
    //print out the diagonal sum up
    int diagonalSum = 0;
    for (int j = 0; j < 5; j++) {
        diagonalSum += array[j][j];
    }
    System.out.println("Diagonal sum: " + diagonalSum);


}

}
