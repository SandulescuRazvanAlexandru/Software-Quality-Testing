package ro.ase.cts.teste;

import org.junit.Test;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getNume() {
        //fail("not yet implemented");
    }

    @Test
    public void testConstructorWorksCorectlyForName() {
        String nume = "Gigel";
        Student student = new Student(nume);

//        if(nume.equals(student.getNume())) {
//            System.out.println("e in regula");
//        } else {
//            System.out.println("constructorul nu initializeaza numele direct");
//        }

        assertEquals(nume, student.getNume());
    }

    @Test
    public void setNume() {
        String nume = "Popescu";
        Student student = new Student();
        student.setNume(nume);

        assertEquals(nume, student.getNume());
    }

    @Test
    public void testDefaultConstructorWorksCorectly() {
        Student student = new Student();

        //assertNotEquals(null, student.getNote());
        assertNotNull("Lista de note nu a fost initializata", student.getNote());
        assertNotNull("Numele nu a fost initializat", student.getNume());
    }

    @Test
    public void adaugatNota() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));
    }

    @Test
    public void testGetNota() {
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(7);
        student.adaugaNota(9);
        student.adaugaNota(4);
        assertEquals(9, student.getNota(2));
    }

    @Test
    public void testAdauga1SinguraNota() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(1, student.getNote().size());
    }

    @Test
    public void adaugaNotaIncorecta() {
        Student student = new Student();
        //1
        try {
            //2
            student.adaugaNota(-1);
            //3 - nu ajunge aici
            fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie");
        } catch (IllegalArgumentException ex) {
            //4
        } catch (Exception e) {
            //5 - nu ajunge aici
            fail("Nu arunca o exceptie de tipul IllegalArgumentException");
        }
        //6
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdaugaNotaIncorectaJUnit4() {
        Student student = new Student();
        student.adaugaNota(-1);
    }

    @Test
    public void testStudetnulAreRestante() {
        Student student = new Student();
        student.adaugaNota(3);
        assertTrue(student.areRestante());
    }

    @Test
    public void testStudetnulNuAreRestante() {
        Student student = new Student();
        student.adaugaNota(10);
        assertFalse(student.areRestante());
    }

    @Test
    public void testCalculeazaMedieCorecta() {
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        //assertEquals(9.5f, student.calculeazaMedie());
        assertEquals(9.5, student.calculeazaMedie(), 0.0001);
    }
}