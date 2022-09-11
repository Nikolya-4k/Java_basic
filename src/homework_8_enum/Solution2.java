package homework_8_enum;

public class Solution2 {
    /*
 Implement enum Week, that each element has the name of the week (String) and the number of weekday (int)
 Print these values to the console in the formant - Monday - day of the week: 1
  */
    public static void main(String[] args) {
        for (Week week : Week.values()) {
            System.out.println(week.name() + " - day of the week: " + (week.ordinal() + 1));
        }
    }

    public enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }
}
