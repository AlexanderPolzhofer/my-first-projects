package at.campus.jdbc.databaseImport.databaseTester;

import java.io.*;

public class FilmTester {

    public static void main(String[] args) {

        try {
          BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DCV\\Downloads\\movilineOK\\movilineOK.csv"));
          BufferedWriter bw = new BufferedWriter((new FileWriter("movieDatabase.txt")));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                String[] ssPlit = sCurrentLine.split(";");
                System.out.println(ssPlit[0]);
                bw.write(sCurrentLine+"\n");
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
