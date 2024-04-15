class User {
    private int id;
    private double[] rating;
    private double similarityScore;

    public User(int id, double[] rating) {
        this.id = id;
        this.rating = rating;

    }

    public double[] getRating() {
        return rating;
    }

    public int getId() {
        return id;
    }

    public void setSimilarityScore(double similarityScore) {
        this.similarityScore = similarityScore;
    }

    
    public double getSimilarityScore() {
        return similarityScore;
    }
}
