package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	PirateArrayListTest.class,
	CurrencyTest.class,
	ServletTest.class,
	PirateTest.class})
public class TestSuite {

}