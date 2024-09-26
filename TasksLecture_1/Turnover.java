package TasksLecture_1;

public class Turnover {
    public static void main(String[] args) {
        int turnover;
        int weekDay;
        int saturday;
        weekDay = 52 * 5;
        saturday = 52;
        turnover = weekDay * 20 * 10 + saturday * 8 * 30;
        System.out.println(turnover);
    }
}
