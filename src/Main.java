public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 77;//вес
        int height = 170;//рост

        float finalBmi = service.bmiIndexCalc(weight, height);
        System.out.println("Индекс массы тела: " + finalBmi);
    }
}