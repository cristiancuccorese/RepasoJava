package org.example;

import org.junit.Assert;
import org.junit.Test;

public class EscuelaTest {

    @Test
    public void testDePrueba(){
        Escuela escuela = new Escuela();
        Assert.assertNotNull(escuela);
    }
}
