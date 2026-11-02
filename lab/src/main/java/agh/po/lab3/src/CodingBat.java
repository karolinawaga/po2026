package agh.po.lab3.src;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.println(cb.close10(9,9));
        System.out.println(cb.makes10(2,8));
        System.out.println(cb.only14(new int[]{1, 1, 7}));
        System.out.println(cb.seeColor("redblue"));

    }
    public int close10(int a, int b) {
        int aa = Math.abs(10-a);
        int bb = Math.abs(10-b);
        if(aa < bb){
            return a;
        }
        if (aa > bb){
            return b;
        }else
            return 0;
    }
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a+b == 10);
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }






}
