package by.bsuir.stolbovskaya.task9.classes;

public class Ball {
    private String color;
    private double weight;

    public String GetColor(){
        return  color;
    }
    public double GetWeight(){
        return weight;
    }
    public void SetColor(String newColor){
        if (newColor == null){
            throw new NullPointerException();
        }
        color = newColor.toLowerCase();
    }

    public Ball(String newColor, double newWeight){
        if (newWeight < 0){
            throw new IllegalArgumentException();
        }
        if (newColor == null){
            throw new NullPointerException();
        }

        color = newColor.toLowerCase();
        weight = newWeight;
    }
    public Ball(){
        color = "blue";
        weight = 1.2;
    }

    @Override
    public String toString() {
        return getClass().getName() + " { color: " + color + ", weight: " + weight + "}";
    }
}
