package br.com.gilmarioarantes.validacpf.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.gilmarioarantes.validacpf.model.ValidaCPF;

public class ValidaCPFTeste {
    ValidaCPF app;

    @Before
    public void setup(){
        app = new ValidaCPF();
    }

    @Test
    public void CT01(){
        Assert.assertFalse(app.isCPF("334624611689"));
    }

    @Test
    public void CT02(){
        Assert.assertFalse(app.isCPF("11111111111"));
    }

    @Test
    public void CT03(){
        Assert.assertTrue(app.isCPF("191"));
    }

    @Test
    public void CT04(){
        Assert.assertTrue(app.isCPF("01234567890"));
    }

    @Test
    public void CT05(){
        Assert.assertTrue(app.isCPF("33462461168"));
    }
    
    @Test
    public void CT06() {
    	Assert.assertTrue(app.isCPF("33339378088"));
    }
    
    @Test
    public void CT07() {
    	Assert.assertTrue(app.isCPF("48965130026"));
    }
    
    @Test
    public void CT08() {
    	Assert.assertTrue(app.isCPF("14700662034"));
    }
}
