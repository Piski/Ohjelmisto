import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestTimeUtils {
    static int caseCount = 0;
    static int passCount = 0;
    static int failCount = 0;

    public static void main(String [] args) {
        File file = new File("casesSecToTime.txt");
        PrintWriter writer = null;
        try {
            Scanner sc = new Scanner(file);
            writer = new PrintWriter("testResults.txt");
            writer.println("Starting tests...");
            writer.println("");
            while (sc.hasNextLine()) {
                testSecToTime(sc.nextLine(), writer);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer.println("");
        writer.println("Total amount of tests: " + caseCount);
        writer.println("Total tests passed: " + passCount);
        writer.println("Total tests failed: " + failCount);
        writer.close();
    }

    public static void testSecToTime(String test, PrintWriter writer) {
        writer.print("Case #" + caseCount++ + ": ");
        int testCase = parseTestCase(test);
        String expected = parseExpected(test);
        String result = TimeUtils.secToTime(testCase);
        if(result.equals(expected)) {
            writer.println("PASS");
            passCount++;
        } else {
            writer.println("FAIL => expected " + result + " to be " + expected);
            failCount++;
        }
    }

    public static int parseTestCase(String test) {
        String testCase = test.split(" ")[0];
        return Integer.parseInt(testCase);
    }

    public static String parseExpected(String test) {
        return test.split(" ")[1];
    }
}
