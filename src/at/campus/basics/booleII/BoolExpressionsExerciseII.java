package at.campus.basics.booleII;

public class BoolExpressionsExerciseII {

    public static void main(String[] args) {
        // Der Fahrer darf das Motorrad fahren, wenn er 24 Jahre oder älter ist oder den
        // Motorradführerschein besitzt aber nicht mehr in der Probezeit ist

        boolean isAllowedToDrive = true;
        boolean hasDrivingLicense = true;
        boolean hasProbationTime = false;
        int driverAge = 24;

        if (driverAge >= 24 || hasDrivingLicense && hasProbationTime) {
            System.out.println("Congratulations, you are allowed to drive!");
        } else {
            System.out.println("Sorry, you are not allowed to drive!");
        }


        // ODER

        String isAllowedtoDriveExampleTwo = driverAge > 18 ? "You are allowed to drive!" : "You are not allowed to drive!";
        System.out.println(isAllowedtoDriveExampleTwo);

        // Das Kind darf den Kinofilm sehen, wenn es älter als 14 ist oder einen Elternteil mit
        // dabei hat.

        boolean isAllowedToWatchMovie = true;
        int childrenAge = 14;
        boolean hasParent = true;

        if (childrenAge >= 14 || hasParent) {
            System.out.println("You are allowed to watch this movie!");
        } else {
            System.out.println("Sorry, you are not allowed to watch this movie!");
        }

        // ODER

        String isAllowedToWatchTheMovieExampleTwo = childrenAge >= 14 || hasParent ? "Have fun!" : "Grow up or take you mom and dad with you!";
        System.out.println(isAllowedToWatchTheMovieExampleTwo);

        // Wenn ich den Kurs “Softwarearchitekturen” besuchen möchte, muss ich den Coding
        // Campus besucht haben oder bereits 2 Jahre Berufserfahrung vorweisen.

        boolean isAllowedForSoftwareArchitecture = true;
        boolean hasCodingCampus = false;
        int workExperience = 2;

        if (hasCodingCampus || workExperience >= 2) {
            System.out.println("Nice to meet you at the course software architecture.");
        } else {
            System.out.println("Sorry, we hope to see you in the future again.");
        }

        // ODER

        String isAllowedAttendingSoftwareArchitecture = hasCodingCampus || workExperience >= 2 ? "Welcome!" : "Sorry!";
        System.out.println(isAllowedAttendingSoftwareArchitecture);

        // Der Bewerber hat eine Chance auf eine Anstellung wenn er bereits über 5 Jahre
        // Erfahrung vorweist oder einen Master Abschluss besitzt und auf jeden Fall eine
        // einwandfreies Leumundszeugnis besitzt.

        boolean job = true;
        int workExperiences = 3;
        boolean hasMasterDegree = true;
        boolean isReputation = true;

        if (workExperiences > 5 || hasMasterDegree && isReputation) {
            System.out.println("You have a chance to work with us.");
        } else {
            System.out.println("Sorry, we don't match.");
        }

        // ODER

        String jobApplication = workExperience > 5 || hasMasterDegree && isReputation ? "You got a chance!" : "Sorry, you don't have a chance!";
        System.out.println(jobApplication);
    }
}
