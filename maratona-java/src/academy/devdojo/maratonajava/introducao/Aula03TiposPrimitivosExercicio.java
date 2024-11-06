package academy.devdojo.maratonajava.introducao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Alberto";
        String address = "Avenida Magalhães, 653";
        String currencyType = "R$";
        double salary = new BigDecimal("2654.95")
                .abs() // Converter o Número para Positivo
                .setScale(2, RoundingMode.DOWN) // Colocar 2 números no final e arrendodar para baixo o resto
                .doubleValue();
        String salaryWithCurrencyType = currencyType + salary;
        String salaryReceiptDate = "15/11/2023";

        String receiptReport = "Eu " + name + ", morando no endereço " + address +
                ", confirmo que recebi o salário de " + salaryWithCurrencyType +
                ", na data" + " " + salaryReceiptDate + ".";

        System.out.println(receiptReport);
    }
}
