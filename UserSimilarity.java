
public class  UserSimilarity{

    // ユーザー間の類似度を計算するメソッド
    public static void calcSimilarity(User[] users) {
        for (int i = 1; i < users.length; i++) {
            double similarity = SimilarityCalculator.calcScore(users[0], users[i]);
            users[i].setSimilarityScore(similarity);
        }
    }
}
