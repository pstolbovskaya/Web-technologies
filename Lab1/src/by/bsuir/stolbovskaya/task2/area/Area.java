package by.bsuir.stolbovskaya.task2.area;


public class Area {

    public static boolean ContainsPoint(int x, int y){

        if (x <= 6 && x >= -6 && y <= 0 && y >= -3
                || x <= 4 && x >= -4 && y <= 5 && y >= 0){
            return true;
        } else{
            return false;
        }
    }

}