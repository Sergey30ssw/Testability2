public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weightKg = 94.555f;
        float heightM = 1.741f;
        float bmi = service.calculate(weightKg, heightM);
        System.out.println(bmi);
    }
}