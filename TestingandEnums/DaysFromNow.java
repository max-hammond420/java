public class DaysFromNow {
    
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Wrong args");
            System.exit(1);
        } 
        Integer dayIndex = Integer.parseInt(args[0]);
        Integer dayOffset = Integer.parseInt(args[1]);

        Weekdays[] weekdays = Weekdays.values();
        Weekdays day = weekdays[dayIndex];

        Integer offset = (dayIndex + dayOffset)%7;
        Weekdays futureDay = weekdays[offset];

        System.out.println("Current day: " + day);
        System.out.println("In " + dayOffset + " days it will be: " + futureDay);
    } 
}
