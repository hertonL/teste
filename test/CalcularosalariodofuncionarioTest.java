

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalcularosalariodofuncionarioTest {
    private Calcularosalariodofuncionario calcularosalariodofuncionario;
            
    public CalcularosalariodofuncionarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calcularosalariodofuncionario = new Calcularosalariodofuncionario();
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void testCalcular_salario() {
       
         assertEquals((2400),calcularosalariodofuncionario.calcular_salario("DESENVOLVEDOR",3000));
         assertEquals((1500),calcularosalariodofuncionario.calcular_salario("DBA",2000));
         assertEquals((3500),calcularosalariodofuncionario.calcular_salario("GERENTE",5000));
         assertEquals((1500),calcularosalariodofuncionario.calcular_salario("TESTADOR",2000));
    }
    
}
