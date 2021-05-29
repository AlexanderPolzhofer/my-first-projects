package at.campus.oop.club;

public class Main {
    public static void main(String[] args) {
        Club club = new Club("music club", 1919);

        Member member = new Member("null", "null", 0, 0);
        Secretary secretary = new Secretary("James", "kings palace 14", 29, member.getMembership());
        Cashier cashier = new Cashier("Richard", "queens street 8", 32, member.getMembership());
        Board board = new Board("Prince", "house of parliament", 36, member.getMembership());

        //membership
        System.out.println(secretary.getMembership() + " €");
        System.out.println(cashier.getMembership() + " €");
        board.getBoardMembership();

        //club
        System.out.println(club.getName() + " was founded in " + club.getFoundingYear());

        //addAndPrintMembers
        club.addMembers(secretary);
        club.addMembers(cashier);
        club.addMembers(board);

        club.printMembers();
    }
}
