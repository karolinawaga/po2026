package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;

public class Lotto {
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
        System.out.print("wylosowane liczby: " + wylosowane + " ");
        }

    }


