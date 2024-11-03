import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] temperatureinCelsius = {12, 9, 22, 25, 31};
        System.out.println(Arrays.toString(temperatureinCelsius));
        temperatureinCelsius[2] = 10;
        System.out.println(Arrays.toString(temperatureinCelsius));
        for (int i = 0; i < temperatureinCelsius.length; i++) {
            System.out.println("The temperature in degrees Celsius is " + temperatureinCelsius[i]);
        }
    }
}