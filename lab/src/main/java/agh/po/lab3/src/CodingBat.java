public class CodingBat {
    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.println(cb.close10(9,9));
        System.out.println(cb.makes10(2,8));

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


}
