package org.iftm.atividadea2.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void testeConstrutorVazioMemoriaZero() {
        // Verificar se ao criar uma nova calculadora a memória inicia com valor 0

        // Arrange 
        Calculadora calculadora = new Calculadora();

        // Act 
        int memoriaAtual = calculadora.getMemoria();

        // Assert 
        // o valor esperado é zero "0" porem o que estar amarzenado é um "1"
        assertEquals(0, memoriaAtual);
    }

    @Test
    public void testeConstrutorPositivo() {
        // Verificar se ao criar a calculadora com valor 3, a mamória inicia com 3

        Calculadora calculadora = new Calculadora();


        // Act
        int memoriaAtual = calculadora.getMemoria();

        assertEquals(3, memoriaAtual);
        // o Valor deveria ser 3, porem esta armazendo 1
    }

    @Test
    public void testeConstrutorComParametroNegativo() {
        // Verificar se ao criar a calculadora com valor -3,
        // a memória inicia com -3

        // Arrange
        Calculadora calculadora = new Calculadora(-3);

        // Act
        int memoriaAtual = calculadora.getMemoria();

        // Assert
        assertEquals(-3, memoriaAtual);
    }

    @Test
    public void testeSomarNumeroPositivo() {

        // Caso de Teste: verificar se somar 2 em memória 3 resulta em 5

        // Arrange
        Calculadora calc = new Calculadora(3);

        // Act
        calc.somar(2);
        int resultado = calc.getMemoria();

        // Assert
        assertEquals(5, resultado);
    }

    @Test
    public void testeSomarNumeroNegativo() {

        // Caso de Teste: verificar se somar -2 em memória 3 resulta em 1

        // Arrange
        Calculadora calc = new Calculadora(3);

        // Act
        calc.somar(-2);
        int resultado = calc.getMemoria();

        // Assert
        assertEquals(1, resultado);
    }

    @Test
    public void testeSubtrairNumeroPositivo() {

        // Arrange
        Calculadora calc = new Calculadora(3);

        // Act
        calc.subtrair(2);
        int resultado = calc.getMemoria();

        // Assert
        assertEquals(1, resultado);
    }

    @Test
    public void testeSubtrairNumeroNegativo() {

        // Arrange
        Calculadora calc = new Calculadora(3);

        // Act
        calc.subtrair(-2);
        int resultado = calc.getMemoria();

        // Assert
        assertEquals(5, resultado);
    }

    @Test
    public void testeMultiplicarPositivo() {

        // Arrange
        Calculadora calc = new Calculadora(3);

        // Act
        calc.multiplicar(2);
        int resultado = calc.getMemoria();

        // Assert
        assertEquals(6, resultado);
    }

    @Test
    public void testeMultiplicarNegativo() {

        // Arrange
        Calculadora calc = new Calculadora(3);

        // Act
        calc.multiplicar(-2);
        int resultado = calc.getMemoria();

        // Assert
        assertEquals(-6, resultado);
    }

    @Test
    public void testeDividirPositivo() throws Exception {

        // Arrange
        Calculadora calc = new Calculadora(6);

        // Act
        calc.dividir(2);
        int resultado = calc.getMemoria();

        // Assert
        assertEquals(3, resultado);
    }

    @Test
    public void testeDividirNegativo() throws Exception {

        // Arrange
        Calculadora calc = new Calculadora(6);

        // Act
        calc.dividir(-2);
        int resultado = calc.getMemoria();

        // Assert
        assertEquals(-3, resultado);
    }

@Test
    public void testeDividirPorZero() {

    // Arrange
    Calculadora calc = new Calculadora(3);

    // Act + Assert
    assertThrows(Exception.class, () -> {
        calc.dividir(0);
    });
}

@Test
    public void testeExponenciar() throws Exception {


    // Arrange
    Calculadora calc = new Calculadora(3);

    // Act
    calc.exponenciar(1);
    int resultado = calc.getMemoria();

    // Assert
    assertEquals(3, resultado);
}


    @Test
    public void testeExponenciar10() throws Exception {

        // Arrange
        Calculadora calc = new Calculadora(2);

        // Act
        calc.exponenciar(10);
        int resultado = calc.getMemoria();

        // Assert
        assertEquals(1024, resultado);
    }

    @Test
    public void testeExponenciarValorInvalido() {

        // Arrange
        Calculadora calc = new Calculadora(2);

        // Act + Assert
        assertThrows(Exception.class, () -> {
            calc.exponenciar(20);
        });

    }

    @Test
    public void testeZerarMemoria() {

        // Arrange
        Calculadora calc = new Calculadora(5);

        // Act
        calc.zerarMemoria();
        int resultado = calc.getMemoria();

        // Assert
        assertEquals(0, resultado);
    }
}
