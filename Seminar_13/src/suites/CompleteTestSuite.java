package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.GrupaTest;
import teste.GrupaTestWithFakes;
import teste.GrupaTestWithMocks;
import teste.GrupaTestWithStub;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestWithFakes.class, GrupaTestWithMocks.class, GrupaTestWithStub.class})
public class CompleteTestSuite {
}
