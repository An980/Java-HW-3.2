public class BmiService {

    public float bmiIndexCalc(float a, float b) {

        float c = (b * b / 10000);
        float result = (a / c);

        //далее идет костыль из двух строк для округления индекса до формата xx.xx
        result = Math.round(result * 100);
        result = result / 100;


        return result;
    }

}
