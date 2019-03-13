package by.bsuir.stolbovskaya.task3.function;


public class Function {

    //returns arr 2x(b-a)/h+1
    public double[][] Calculate(double a, double b, double h) throws Exception {

        CheckArguments(a, b, h);

        if (a == b && h == 0){
            h = 1;
        }

        int len = (int)((b - a) / h) + 1;

        double[][] result = new double[len][2];

        int i = 0;

        for(double x = a; x <= b; x += h){

            result[i][0] = x;
            result[i][1] = Math.tan(x);

            i++;
        }

        return result;
    }

    private void CheckArguments(double a, double b, double h) throws Exception {

        String errorMess = "";
        boolean result = false;
        if (a > b){
            errorMess = "wrong line segment a < b";
            result = true;
        }

        if (h == 0 && a != b){
            errorMess = "wrong h";
            result = true;
        }

        if (result){
            throw new Exception(errorMess);
        }
    }
}
