public class TesteCalculadora {
    @Teste
    public void testeSoma1() {
        Calculadora calc = new Calculadora();
        int resultadoRetornado = calc.soma (2,3);
        assertEquals(5, resultadoRetornado);
    }
}