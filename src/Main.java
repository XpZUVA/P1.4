import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    int num;
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un numero entero positivo: ");
    num = sc.nextInt();
    Conversor conv = new Conversor(num);
    conv.toBase(num);
    conv.toBinary();
    conv.toHex();
    conv.toOctal();




    }
}