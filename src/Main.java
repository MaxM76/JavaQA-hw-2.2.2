public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = (float) 1.7;
        int weight = 80;
        float bmi = service.calculate(weight, height);
        System.out.println("Рост составляет " + height + " м");
        System.out.println("Масса тела составляет " + weight + " кг");
        System.out.println("Индекс массы тела составляет " + bmi);
    }
}
