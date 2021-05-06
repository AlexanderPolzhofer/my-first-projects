package oop.beispiel2;


public class TestRaumPlayer {
    public static void main(String[] args) {
        Room mRoom = new Room("CodeCampus");
        Player mPlayer = new Player(mRoom, "Alex", 28, 'm');
        Player mPlayer2 = new Player(mRoom, "Ali", 38, 'm');
        Player mPlayer3 = new Player(mRoom, "Max", 33, 'm');
        Player mPlayer4 = new Player(mRoom, "Dominik", 30, 'm');
        Player mPlayer5 = new Player(mRoom, "Jamal", 36, 'm');
        Player mPlayer6 = new Player(mRoom, "Stefan", 30, 'm');
        Player mPlayer7 = new Player(mRoom, "Lisa", 31, 'f');
        Player mPlayer8 = new Player(mRoom, "Markus", 46, 'm');

        mRoom.addPlayerList(mPlayer);
        mRoom.addPlayerList(mPlayer2);
        mRoom.addPlayerList(mPlayer3);
        mRoom.addPlayerList(mPlayer4);
        mRoom.addPlayerList(mPlayer5);
        mRoom.addPlayerList(mPlayer6);
        mRoom.addPlayerList(mPlayer7);
        mRoom.addPlayerList(mPlayer8);
        mPlayer.setMyRoom(mRoom);
        mRoom.printPlayers();
        mRoom.getAge();
        mRoom.searchAge(30);

    }


}
