//package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    //zadanie1
    public static void main(String[] args) {
        ArrayList<Integer> wylosowane = new ArrayList<>();
        Random random = new Random();
        int min = 1;
        int max = 49;
        while(wylosowane.size() < 6){
            int liczba = random.nextInt( max- min + 1) + min;
            if(!wylosowane.contains(liczba)){
                wylosowane.add(liczba);

            }
        }
        //zadanie 2
        ArrayList<Integer> moje = new ArrayList<>();
        for (String arg : args){
            moje.add(Integer.parseInt(arg));
        }
        int traf=0;
        for(int liczba : moje){
            if(wylosowane.contains(liczba)){
                traf++;
            }
        }


        System.out.println("moje " + moje);
        System.out.println("wylosowane liczby: " + wylosowane + " ");
        System.out.println("trafienia: " + traf);
        }

    }


