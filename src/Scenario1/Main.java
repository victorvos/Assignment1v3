package Scenario1;

import java.io.*;
import java.lang.reflect.Method;

/**
 * Created by Eigenaar on 21-11-2016.
 */
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;
import static java.util.logging.Logger.global;

public class Main {
    public static ArrayList<String> classNames = new ArrayList();

    public void Register(String className){
        classNames.add(className);
    }


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr);
        BufferedReader br2 = new BufferedReader(isr);
        BufferedReader br3 = new BufferedReader(isr);

        new HTML();
        new XML();
        new Text();
        new Word97();
        new RTF();

        System.out.println("Inhoud bestand:");

        String inhoud = "";

        String regel = br1.readLine();
        while (!regel.equals("")) {
            inhoud += regel + System.lineSeparator();
            regel = br1.readLine();
        }
        System.out.println(classNames.get(3));


        System.out.println("Save file als: (geef index)");
        int i = 1;
        for(String s : classNames) {
            System.out.println(i + " " + s);
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        out.println("Kies uw index: ");
        int index = new Integer(scanner.next());
        if (index>=1 && index<=classNames.size()){
            index -= 1;
        }
        else{
            scanner.close();
            out.println("Onjuiste index...");
        }

        String formatChoice = classNames.get(index);        // String van geselecteerde Class naam

        String naam = br2.readLine();

        while(true){
            String type1 = br3.readLine();
            try {
                int type2 = Integer.parseInt(type1);

                if (classNames.size() < type2-1 || type2 <= 0){
                    System.out.println("Selecteer een geldig getal");
                    continue;
                } else {
                    String fm = naam + classNames.indexOf(type2+1);
                    FileWriter fw1 = new FileWriter(fm);
                    PrintWriter pw1 = new PrintWriter(fw1);
                    pw1.println(inhoud);
                    pw1.close();
                    System.out.println("File is opgeslagen als " + fm);
                    break;
                }
            }
            catch (NumberFormatException e){
                System.out.println("Voer een geldig getal in");
                continue;
            }
        }
        br1.close();
        br2.close();
        br3.close();
//        try {
//            Class c = c.class;
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