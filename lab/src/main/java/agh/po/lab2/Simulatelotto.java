package main.java.agh.po.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Simulatelotto {
    public static void main(String[] args){
        ArrayList<Integer> moje = new ArrayList<>();
        moje.add(7);
        moje.add(10);
        moje.add(28);
        moje.add(32);
        moje.add(39);
        moje.add(48);
        Collections.sort(moje);
        Random random = new Random();
        long licznik = 0;
        long start = System.currentTimeMillis();

        while(true){
            licznik++;
            ArrayList<Integer> wylosowane = new ArrayList<>();

            while (wylosowane.size() < 6){
                int liczba = random.nextInt(49) +1;
                if (!wylosowane.contains(liczba)){
                    wylosowane.add(liczba);
                }
            }
            Collections.sort(wylosowane);
            if(wylosowane.equals(moje)) {
                break;
            }
        }
        long koniec = System.currentTimeMillis();
        long czastrwania = koniec - start;

        System.out.println("liczba losowan "+ licznik);
        System.out.println("czas "+ czastrwania + "ms");



    }
}
