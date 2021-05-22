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
}