package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
     /*
     Create a class named FieldTrip. Your school goes om aField Trip each year and the place you go will be based on your grade.
     Given a variable gradeNumber (1-6) figure out the details of your field trip.

     grade 1
     location - Apple orchard
     number of groups - 3
     teacher in charge - Ms.Smith

     grade 2
     location - Zoo
     number of groups - 7
     teacher in charge - Mr. Lee

     grade 3
     location - Aquariun
     number of groups - 5
     teacher in charge - Mr. Wilson

     grade 4
     location - Park
     number of groups - 4
     teacher in charge - Ms. Alan

     grade 5
     location - Stadium
     number of groups - 6
     teacher in charge - Mr. Bruce
      */

        int grade = 2;
        String location = null;
        int groupNumber = 0;
        String teacher = null;

        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple orchard";
                groupNumber = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquariun";
                groupNumber = 5;
                teacher = "Mr. Wilson";
            } else if (grade == 4) {
                location = "Park";
                groupNumber = 4;
                teacher = "Ms. Alan";
            } else if (grade == 5) {
                location = "Stadium";
                groupNumber = 6;
                teacher = "Mr. Bruce";
            }
        } else {
            System.out.println("Invalid Grade");
        }
        System.out.println("location - " + location);
        System.out.println("number of groups - " + groupNumber);
        System.out.println("teacher - " + teacher);

    }


}

