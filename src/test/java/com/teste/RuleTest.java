package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {

    /*
    Rules servem para ditar regras que devem ser executadas antes do teste
    A @rule do codigo abaixo solicita que criemos uma pasta
    e o @test cria um arquivo .txt e verifica se o arquivo criado é um
    arquivo de fato, e se o caminho gerado tanto para o arquivo quanto
    para a pasta é o mesmo.
    */

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    @Test
    public void shouldCreateFile() throws IOException{
        File create = temp.newFile("file.txt");

        assertTrue(create.isFile());
        assertEquals(temp.getRoot(), create.getParentFile());

    }
}
