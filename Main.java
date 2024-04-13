import java.util.Scanner;
import java.util.Arrays;

class Main{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int countUsers = scanner.nextInt();
        int countBooks = scanner.nextInt();

        double [][] review = new double[countUsers][countBooks];
        double [] dist = new double [countUsers-1];
        double distance = 0;
        double [] score = new double [countUsers-1];
        

        for(int i=0; i<countUsers; i++){
            for(int j=0; j<countBooks; j++){
                review[i][j] = scanner.nextDouble();
            }
        }

        for (int i=1; i<countUsers; i++){
           for(int j=0; j<countBooks; j++){
            if(review[0][j] < 0 || review[i][j] < 0)
            {
                continue;
            }else
            {
                distance = distance + (review[0][j] - review[i][j]) * (review[0][j] - review[i][j]);
                System.out.println("a^2 + b^2) = " + distance + " ");
            }
           }
           
           dist[i-1] = Math.sqrt(distance);
           System.out.println(" heihocon " + dist[i-1] + " ");
           distance = 0;

           score[i-1] = 1/(dist[i-1] + 1);
           System.out.println(" score is " + score[i-1] + " ");

           for (int i = 1; i < countUsers; i++) {
            for (int j = 1; j < countUsers - i; j++) {
                if (score[i] < score[j + 1]) {
                    double temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }
        }
    }
           

        

        scanner.close();
    }
}
