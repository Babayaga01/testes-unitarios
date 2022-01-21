package com.teste;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ExceptionTest {

    //Ao testar exceptions devemos informar o erro esperado da exception na annotation do teste

    /*
    No primeiro exemplo abaixo estamos tentando pegar o primeiro elemento de uma lita vazia
    ocasionando um erro e gerando assim a exception esperada, e rodando com sucesso o teste
    No segundo exemplo tentamos acessar o primeiro elemento de uma lista populada,
    não ocasiona nenhum erro o que resulta na falha do teste pois era esperado uma exception
     */

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){

        new ArrayList<Object>().get(0);

       /* List<String> lista = new ArrayList<>();
        lista.add("Henrique");
        lista.get(0); */
    }
}
