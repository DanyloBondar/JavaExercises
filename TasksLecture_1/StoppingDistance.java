package TasksLecture_1;

public class StoppingDistance {
    public static void main(String[] args) {
        double velocity = 120;
        double veolocityM = 120/ 3.6;
        double reactionTime = 0.3;

        double reactionDistance = Math.round(reactionTime * veolocityM);
        System.out.println("Reaction distance:" + reactionDistance);

        double brakingDistance = Math.round((veolocityM * veolocityM) / 16);
        System.out.println("brakingDistance:" + brakingDistance);

        double stoppingDistance = brakingDistance + reactionDistance;
        System.out.println("stoppingDistance:" + stoppingDistance);

    }
}
