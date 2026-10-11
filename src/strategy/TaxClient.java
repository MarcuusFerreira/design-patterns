package strategy;

import java.math.BigDecimal;

public class TaxClient {
    /*
     * Um dos "problemas" do padrão de projeto strategy é que ele joga
     * a responsabilidade do contexto para cima, então o cliente fica
     * responsavel por saber qual tipo/parametro ele deve passar.
     *
     * Dessa forma a nossa classe está fechada para modificação e aberta para extensão
     * Além da classe só ter um motivo para mudar, caso o imposto mude.
     */
    static void main() {
        var type = "ICMS";
        var taxType = switch (type) {
            case "ISS" -> new ISS();
            case "ICMS" -> new ICMS();
            case "IPI" -> new IPI();
            default -> throw new IllegalArgumentException("Invalid tax type.");
        };
        var taxCalculator = new TaxCalculator();
        var amount = BigDecimal.valueOf(1000);
        var result = taxCalculator
                .setTaxType(taxType)
                .calculate(amount);
        System.out.printf(
                "\nA porcentagem do imposto é %s",
                result
        );
    }
}
