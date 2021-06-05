package teste;

import categories.TesteRight;
import categories.TesteUrgente;
import clase.Grupa;
import mock.StudentStub;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class GrupaTestWithStub {

    @Test
    @Category({TesteRight.class, TesteUrgente.class})
    public void testGetPromovabilitate() {
        Grupa grupa = new Grupa(1088);
        StudentStub studentStub = new StudentStub();
        grupa.adaugaStudent(studentStub);

        assertEquals(0, grupa.getPromovabilitate(), 0.01f);
    }

}