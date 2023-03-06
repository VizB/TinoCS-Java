public class Test {
    public static int testCount = 0;
    public static void main(String[] args) {
        
        Test test = new Test();

        System.out.println("RUNNING TEST");
        // System.out.println(test.filterByExtension("Go.java,Go.class,Web.ctxt,help.txt,Bat.java", "java"));

        System.out.println("Done");

        
    }

    public boolean runTest(String start, String res){
        Test test = new Test();

        System.out.println("---Output for test"+Test.testCount+"---");
        boolean testRes = test.firstFour(start).equals(res);
        String resp = testRes ? "SUCESS":"FAILED :((";
        System.out.println("\n---Res for test"+Test.testCount+"\n" + resp + "\n---");
        Test.testCount = Test.testCount++;
        return testRes;

    }

    public String filterByExtension(String str, String ext) {
        String[] strArr = str.split(",");
        String res = "";

        for (int i = 0; i < strArr.length; i++) {

            if (strArr[i].substring(strArr[i].indexOf('.') + 1, strArr[i].length()).equals(ext)) {
                res += strArr[i] + ',';
            }
        }

        return res.substring(0, res.length() - 1);
    }

    public String firstFour(String str) {
        if (str.length() < 4) {
            return str;
        }

        String newStr = "XXXX";
        String firstFour = str.substring(0, 4);

        boolean shouldReplace = false;

        for (int i = 4; i < str.length(); i++) {
            int currIndex = str.indexOf(firstFour, i);
            if (currIndex < 0) {
                newStr += str.substring(i);
                break;
            }

            newStr += str.substring(i, currIndex);

            if (shouldReplace) {
                newStr += "XXXX";
            } else {
                newStr += firstFour;
            }

            i = currIndex + 3;
            shouldReplace = !shouldReplace;
        }

        return newStr;
    }
}