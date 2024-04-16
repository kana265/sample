class SimilarityCalculator {

    public static double calcScore(User user1, User user2) {
        double[] rating1 = user1.getRating();
        double[] rating2 = user2.getRating();

        double distance = 0;
        for (int i = 0; i < rating1.length; i++) {
            if (rating1[i] >= 0 && rating2[i] >= 0) {
                distance += Math.pow(rating1[i] - rating2[i], 2);
            }
        }
        double euclideanDistance = Math.sqrt(distance);

        return 1 / (euclideanDistance + 1);
    }

}
