public class Task7 {
    public static void main(String[] args) {
        // Creating a 2D array with 4 rows and 3 columns
        String[][] fruitsArray = new String[4][3];

        // Filling only the first column with fruits
        fruitsArray[0][0] = "Apple";
        fruitsArray[1][0] = "Banana";
        fruitsArray[2][0] = "Orange";
        fruitsArray[3][0] = "Grapes";

        // Printing the array
        for (int i = 0; i < fruitsArray.length; i++) {
            for (int j = 0; j < fruitsArray[i].length; j++) {
                System.out.print(fruitsArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}