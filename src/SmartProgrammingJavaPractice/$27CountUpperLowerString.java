package SmartProgrammingJavaPractice;

public class $27CountUpperLowerString {
    public static void main(String[] args) {
        String str = "WElcome To AutoMatioN";
        int countUp = 0;
        int countDn = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                countUp++;
            } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                countDn++;
            } else {
                continue;
            }
        }
        System.out.println("Capital : " + countUp);
        System.out.println("Small : " + countDn);
    }
}
