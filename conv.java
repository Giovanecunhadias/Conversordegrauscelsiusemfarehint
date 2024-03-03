import java.util.Scanner;

public class conv{
    public static void main(String[] args) {
        class Conversor{
            public void converter_grau_celsiu_para_farehint(){
                double farehint = 0.0;
                Scanner input = new Scanner(System.in);
                System.out.print("Digite o valo que você deseja Converter para farehint: ");
                double c = input.nextDouble();
                farehint = (c * 1.8)+32;
                System.out.println("Valor da temperatura em farehint: "+ farehint);
            }
        }
        Conversor n;
        n = new Conversor();
        n.converter_grau_celsiu_para_farehint();
    }

}