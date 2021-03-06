package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface Readable {

    List<Aplicant> readAplicant(String file) throws FileNotFoundException;
}
