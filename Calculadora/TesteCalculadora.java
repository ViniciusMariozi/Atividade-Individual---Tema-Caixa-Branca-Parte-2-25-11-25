public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes de sucesso
        System.out.println(calc.calcular(2, 3, "+")); // 5
        System.out.println(calc.calcular(10, 4, "-")); // 6
        System.out.println(calc.calcular(3, 5, "*")); // 15
        System.out.println(calc.calcular(8, 2, "/")); // 4

        // Teste de Divisão por Zero
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        // Teste de Operador Inválido
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
    }
}