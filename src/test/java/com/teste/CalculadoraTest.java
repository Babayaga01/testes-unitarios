package com.teste;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSomar(){
        Calculadora c = new Calculadora();
        int soma = c.somar("1+1+3");
        assertEquals(5, soma); // asserts indicam se o resultado foi igual ao esperado em um ponto do codigo

    }

}
