
public class EnumTest {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Incorrect args");
            System.exit(1);
        }

        Integer num = Integer.parseInt(args[0]);
        if (num < 0 || num > 6) {
            System.out.println("Not a weekday value");
            System.exit(2);
        }

        Weekdays[] allWeekdays = Weekdays.values();
        Weekdays day = allWeekdays[num];

        String end;
        if (day == Weekdays.SATURDAY || day == Weekdays.SUNDAY) {
            end = " ";
        } else {
            end = "not ";
        }
        System.out.println("Day "+num+" of the week is: "+day+". It is "+end+"a weekend.");
    }
}
