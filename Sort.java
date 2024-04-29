
public class Sort {

    public static void sortUsers(User[] users) {
        //バブルソートで類似スコアが高い順に並び替える
        for (int i = 1; i < users.length; i++) {
            for (int j = 1; j < users.length - i; j++) {
                if (users[j].getSimilarityScore() < users[j + 1].getSimilarityScore()) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }
            }
        }
    }
}
