public class TestCaseTest extends TestCase {

    public TestCaseTest(String name) {
        super(name);
    }

    public static TestSuite suite() {
        // TestSuite suite = new TestSuite();
        // suite.add(new TestCaseTest("testTemplateMethod"));
        // suite.add(new TestCaseTest("testResult"));
        // suite.add(new TestCaseTest("testFailedResultFormatting"));
        // suite.add(new TestCaseTest("testFailedResult"));
        // suite.add(new TestCaseTest("testSuite"));

        // 모든 테스트 케이스를 자동으로 추가 
        TestSuite suite = new TestSuite(TestCaseTest.class);
        return suite;
    }

    public void testTemplateMethod() {
        WasRun wasRun = new WasRun("testMethod");
        TestResult result = new TestResult();
        wasRun.run(result);
        Assert.assertEquals("setUp testMethod tearDown", wasRun.log);
    }

    public void testResult() {
        WasRun wasRun = new WasRun("testMethod");
        TestResult result = new TestResult();
        wasRun.run(result);
        Assert.assertEquals("1 run, 0 failed", result.getSummary());
    }

    public void testFailedResultFormatting() {
        TestResult result = new TestResult();
        result.testStarted();
        result.testFailed();
        Assert.assertEquals("1 run, 1 failed", result.getSummary());
    }

    public void testFailedResult() {
        WasRun wasRun = new WasRun("testBrokenMethod");
        TestResult result = new TestResult();
        wasRun.run(result);
        Assert.assertEquals("1 run, 1 failed", result.getSummary());
    }

    public void testSuite() {
        TestSuite suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));
        TestResult result = new TestResult();
        suite.run(result);
        Assert.assertEquals("2 run, 1 failed", result.getSummary());
    }
}
