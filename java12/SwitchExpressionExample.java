package java12.switchExpression;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        String day = "MONDAY";
        String result = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> throw new IllegalArgumentException("Unknown day: " + day);
        };
        System.out.println(result);
    }
}
