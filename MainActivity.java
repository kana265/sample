import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNum = scanner.nextInt();
        int bookNum = scanner.nextInt();

        User[] users = new User[userNum];
        
        for (int i = 0; i < userNum; i++) {
            int id = i + 1;
            double[] ratings = new double[bookNum];
            for (int j = 0; j < bookNum; j++) {
                ratings[j] = scanner.nextDouble();
            }
            users[i] = new User(id, ratings);
        }

        for (int i = 1; i < userNum; i++) {
                double similarity = SimilarityCalculator.calcScore(users[0], users[i]);
                users[i].setSimilarityScore(similarity);
        }
        

        for (int i = 1; i < userNum; i++) {
            for (int j = 1; j < userNum - i; j++) {
                if (users[j].getSimilarityScore() < users[j + 1].getSimilarityScore()) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }
            }
        }

        for (int i = 1; i < userNum; i++) {
             System.out.println(users[i].getId() + " " + users[i].getSimilarityScore());
        }
        scanner.close();
    }
}
