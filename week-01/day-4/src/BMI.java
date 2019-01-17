public class BMI {

    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        double bmi = massInKg / (heightInM * heightInM);

        System.out.println("The Body mass index (BMI): " + bmi);

    }
}
