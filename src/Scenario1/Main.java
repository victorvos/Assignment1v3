package Scenario1;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
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
        new RTF();      //init nieuw format

        System.out.println("Inhoud bestand:");

        String inhoud = "";

        String regel = br1.readLine();
        while (!regel.equals("")) {
            inhoud += regel + System.lineSeparator();
            regel = br1.readLine();
        }

        System.out.println("Save file als: (geef index)");
        int i = 1;
        for(String s : classNames) {
            System.out.println(i + " " + s);
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        while(true){

            try {
                out.println("getal tussen 1 en " + classNames.size() + ":");
                int index = new Integer(scanner.next());
                if (index>=1 && index<=classNames.size()){
                    index -= 1;
                    String formatChoice = classNames.get(index);        // String van geselecteerde Class naam
                    Class<?> c = Class.forName("Scenario1." + formatChoice);
                    Object obj = c.newInstance();
                    Method m = c.getDeclaredMethod("getFormat");
                    String format = (String) m.invoke(obj);                         // de geimplementeerde SaveAs methode kan met m.invoke(args) worden uitgevoerd.
                    String fm = "filenaam" + format;
                    FileWriter fw1 = new FileWriter(fm);
                    PrintWriter pw1 = new PrintWriter(fw1);
                    pw1.println(inhoud);
                    pw1.close();
                    System.out.println("File is opgeslagen als " + fm);
                    break;
                }
                else{
                    out.println("Onjuiste index...");
                    continue;
                }
            }
            catch (NumberFormatException e){
                System.out.println("Voer een geldig getal in");
                continue;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            scanner.close();
    }

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