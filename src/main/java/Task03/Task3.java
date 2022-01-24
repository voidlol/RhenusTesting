package Task03;

import java.util.Objects;

public class Task3 {

    public Score getAverageScore(int[] votes) {
        int totalVotes = 0;
        int totalScore = 0;
        for (int i = 0; i < votes.length; i++) {
            totalVotes += votes[i];
            totalScore += votes[i] * (i + 1);
        }
        double avgScore = (double) totalScore / totalVotes;
        return new Score(Math.round(avgScore * 100.0) / 100.0, appendStars((int) Math.round(avgScore)));
    }

    private String appendStars(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }
        sb.append("\"");
        return sb.toString();
    }

    static class Score {
        private final double score;
        private final String stars;

        public Score(double score, String stars) {
            this.score = score;
            this.stars = stars;
        }

        public double getScore() {
            return score;
        }

        public String getStars() {
            return stars;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Score score1 = (Score) o;
            return Double.compare(score1.getScore(), getScore()) == 0 && Objects.equals(getStars(), score1.getStars());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getScore(), getStars());
        }

        @Override
        public String toString() {
            return "[" + score + ", " + stars + "]";
        }
    }
}
