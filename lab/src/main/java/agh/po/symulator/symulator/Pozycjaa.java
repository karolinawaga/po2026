package symulator;

public class Pozycjaa {
    private Double x;
    private Double y;
    public Pozycjaa(){
        this.x = 0.0;
        this.y = 0.0;

    }
    public Pozycjaa(double x, double y){
        this.x = x;
        this.y = y;
    }
    void aktualizujPozycję(double deltaX, double deltaY){
        this.x += deltaX;
        this.y += deltaY;

    }
    String getPozycja(){
        return "(  )";
    }

}
