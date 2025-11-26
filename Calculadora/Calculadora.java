/**
 * Classe responsável por realizar operações matemáticas básicas.
 * Fornece métodos para soma, subtração, multiplicação e divisão,
 * além de um método centralizador para escolha da operação.
 * * @author Vinicius Reimberg Mariozi
 * @version 3.0
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     * * @param a O primeiro operando.
     * @param b O segundo operando.
     * @return O resultado da soma de a e b.
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     * * @param a O primeiro operando.
     * @param b O segundo operando.
     * @return O resultado da subtração (a - b).
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     * * @param a O primeiro operando.
     * @param b O segundo operando.
     * @return O resultado da multiplicação de a por b.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão entre dois números inteiros.
     * * @param a O dividendo.
     * @param b O divisor.
     * @return O resultado da divisão de a por b.
     * @throws IllegalArgumentException Se o divisor (b) for igual a zero.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    /**
     * Executa a operação matemática solicitada com base no operador informado.
     * <p>Operadores aceitos:</p>
     * <ul>
     * <li>+: Soma</li>
     * <li>-: Subtração</li>
     * <li>*: Multiplicação</li>
     * <li>/: Divisão</li>
     * </ul>
     * * @param a O primeiro número.
     * @param b O segundo número.
     * @param operador O símbolo da operação desejada.
     * @return O resultado da operação.
     * @throws IllegalArgumentException Se o operador não for válido.
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}