package suites;

import categories.TesteRight;
import categories.TesteUrgente;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.GrupaTest;
import teste.GrupaTestWithFakes;
import teste.GrupaTestWithMocks;
import teste.GrupaTestWithStub;

@RunWith(Categories.class)
//@RunWith(Suite.class) //ruleaza tot, trece peste tot
@Suite.SuiteClasses(CompleteTestSuite.class)
//@Categories.IncludeCategory(TesteRight.class)
@Categories.IncludeCategory(TesteUrgente.class)
@Categories.ExcludeCategory(TesteRight.class)
public class CustomTestSuite {
}
