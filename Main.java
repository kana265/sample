import java.util.Scanner;

class Main{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int countUsers = scanner.nextInt();
        int countBooks = scanner.nextInt();

        double [][] scores = new double[countUsers][countBooks];

        for(int i=0; i<countUsers; i++){
            for(int j=0; j<countBooks; j++){
                scores[i][j] = scanner.nextDouble();
            }
        }

        

        for (int i = 0; i < countUsers; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < countBooks; j++) {
                if (scores[i][j] < 0) {
                    System.out.print("Absent ");
                } else {
                    System.out.print(scores[i][j] + " ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
