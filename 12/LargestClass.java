import java.util.*;
import java.io.*;
import java.util.Map.Entry;

public class LargestClass {

    public static void main(String[] args) {

        Map<String, Integer> courses = new HashMap<>();

        File f = new File("students.txt");
        try {
            Scanner scan = new Scanner(f);
            while(scan.hasNextLine()) {
                String[] line = scan.nextLine().split(":");
                String[] currentCourses = line[1].split(",");

                for (String c : currentCourses) {
                    if (courses.containsKey(c)) {
                        courses.put(c, courses.get(c) + 1);
                    }
                    else {
                        courses.put(c, 1);
                    }
                }
            }

            String mostPopularCourse = "";
            int maxNumOfStudents = 0;

            for (Entry<String, Integer> e : courses.entrySet()) {
                if (e.getValue() > maxNumOfStudents) {
                    mostPopularCourse = e.getKey();
                    maxNumOfStudents = e.getValue();
                }
            }

            System.out.println(mostPopularCourse + " - " + maxNumOfStudents + " students");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
