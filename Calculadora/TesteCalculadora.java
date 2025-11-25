public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes rápidos
        System.out.println(calc.calc(2, 3, "+")); // esperado: 5
        System.out.println(calc.calc(10, 4, "-")); // esperado: 6
        System.out.println(calc.calc(3, 5, "*")); // esperado: 15
        System.out.println(calc.calc(8, 2, "/")); // esperado: 4
        
        // Testes de erro
        calc.calc(8, 0, "/"); // divisao por zero
        calc.calc(5, 5, "x"); // operação inválida
    }
}