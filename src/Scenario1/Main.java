package Scenario1;

import java.io.*;
import java.lang.reflect.Method;

/**
 * Created by Eigenaar on 21-11-2016.
 */
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr);	// Dit zijn de verschillende input velden.
        BufferedReader br2 = new BufferedReader(isr);
        BufferedReader br3 = new BufferedReader(isr);

        ArrayList<Format> formats = new ArrayList();

        formats.add(new Word97());
        formats.add(new XML());
        formats.add(new Text());
        formats.add(new HTML());
        formats.add(new RTF());

        System.out.println("Inhoud bestand:");

        String inhoud = "";

        String regel = br1.readLine();	// Met deze loop kun je het bestand schrijven.
        while (!regel.equals("")) {		// Systeem blijft om input vragen totaal de gebruiker alleen op Enter drukt.
            inhoud += regel + System.lineSeparator();
            regel = br1.readLine();
        }



        System.out.println("Save file als: (geef index)");
        int i = 1;
        for(Format f : formats) {
            System.out.println(i + " " + f.getFormat());
            i++;
        }

        String naam = br2.readLine();	// Hiermee kan een gebruiker input geven.

        while(true){
            String type1 = br3.readLine();	// Hiermee kan een gebruiker input geven.
            try {	// Als de gebruiker geen int invult komt er geen error, maar kan de gebruiker gewoon opnieuw proberen.
                int type2 = Integer.parseInt(type1);	// Maakt van String een int.

                if (formats.size() < type2-1 || type2 <= 0){
                    System.out.println("Selecteer een geldig getal");
                    continue;	// Ga terug naar begin van de while loop.
                } else {
                    String fm = naam + formats.indexOf(type2);	// Maakt van de ingevoerde gegevens een String, om deze gemakkelijk meerdere keren te gebruiken.
                    FileWriter fw1 = new FileWriter(fm);		// Hiermee wordt de file ook echt opgeslagen in de workspace folder.
                    PrintWriter pw1 = new PrintWriter(fw1);
                    pw1.println(inhoud);
                    pw1.close();
                    System.out.println("File is opgeslagen als " + fm);
                    break;		// Verlaat de while loop.
                }
            }
            catch (NumberFormatException e){	// Deze Exception komt voor wanneer je van een String een int wilt maken en de String bestaat uit iets anders dan een int.
                System.out.println("Voer een geldig getal in");
                continue;		// Ga terug naar begin van de while loop.
            }
        }
        br1.close();
        br2.close();
        br3.close();
//        try {
//            Class c = SaveAs.class;
//            Method[] m = c.getDeclaredMethods();
//            String z = null;
//            for (int i = 0; i < m.length; i++){
//                z = m[i].toString();
//                String[] x = z.split(" ");
//                String methodName = x[2];
//                String method1 = methodName.split("\\.")[1];
//                System.out.println(i + " " + method1);
//            }
//        } catch (Throwable e) {
//            System.err.println(e);
//        }

//        Scanner scanner = new Scanner(System.in);
//        out.println("Kies uw index: ");
//        int index = new Integer(scanner.next());

//
//        try {
//            Class c = SaveAs.class;
//            Method[] m = c.getDeclaredMethods();
//            String z = null;
//
//            z = m[index].toString();
//            String[] x = z.split(" ");
//            String methodName = x[2];
//            String method1 = methodName.split("\\.")[1];
//            Method methode = SaveAs.class.getDeclaredMethod(method1.substring(0, method1.length() - 2));
//            System.out.println(methode.invoke(save));
//
//        } catch (Throwable e) {
//            System.err.println(e);
//        }

//
//
//
//
//        for(Format f : formats) {
//            if(index == f.getIndex()) {
//                System.out.println("De format: " + f.getFormat() + " is gekozen");
//            }
//        }
    }
}