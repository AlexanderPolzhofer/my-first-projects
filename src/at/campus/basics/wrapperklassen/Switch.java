package at.campus.basics.wrapperklassen;

public class Switch {
    public static void main(String[] args) {

        gradesNumber(1);
        gradesText("Sehr gut");

    }

    private static void gradesNumber(int number) {

        String grades = switch (number) {
            case 1 -> "Sehr gut!";
            case 2 -> "Gut!";
            case 3 -> "Befriedigend!";
            case 4 -> "Genügend!";
            case 5 -> "Nicht genügend!";
            default -> "Das ist keine gültige Schulnote!";
        };
        System.out.println(grades);
    }

    private static void gradesText(String text) {
        int grades = switch (text) {
            case "Sehr gut" -> 1;
            case "Gut" -> 2;
            case "Befriedigend" -> 3;
            case "Genügend" -> 4;
            case "Nicht genügend" -> 5;
            default -> 0;
        };
        System.out.println(grades);
    }

}