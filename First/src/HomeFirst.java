public class HomeFirst {
    public static void main(String[] args) {
        // 1. String.
        String before = "you have a few random symbols in this line";
        System.out.println("before length: " + before.length());
        String after1 = before.substring(0, 21), after2 = before.substring(22, 42);
        System.out.println("after1 substring: " + after1 + "\n" + "after2 substring: " + after2);

        System.out.println();

        // 2. 7 in the end
        int num = 5247564;
        String numStr = Integer.toString(num);
        int last = numStr.length() - 1;
        char containSeven = numStr.charAt(last);
        if(containSeven == '7') {
            System.out.println("Number contains 7 in the end");
        } else {
            System.out.println("There is no 7 in the end");
        }

        System.out.println();

        // 3. a, b & r
        int a = 4, b = 7, radius = 8;
        int diagonalRect = (int)Math.sqrt((int)Math.pow(a, 2) + (int)Math.pow(b, 2));
        if(diagonalRect <= (radius * 2)) {
            System.out.println("Circle has been cover the rectangle");
        } else {
            System.out.println("Circle died");
        }

        System.out.println();

        // 4. Money has no honey
        int money = 351;
        int x = money % 100;
        int y = money % 10;
        if (x == 1 || y == 1) {
            System.out.println(money + " рубль");
        }
        if (5 > x && x > 1 || y > 1 && y < 5) {
            System.out.println(money + " рубля");
        }
        if (20 > x && x > 10 || y >= 5 && y <= 10) {
            System.out.println(money + " рублей");
        }

        System.out.println();

        // 5. ? and #
       StringBuffer strbuf = new StringBuffer("? lel #");
       strbuf.deleteCharAt(0).insert(0, "HELLO").deleteCharAt(10).insert(10, "");
       System.out.println(strbuf);

        System.out.println();

        // 6. Hi, sin!
        double w, v = 3, t = 4, s = 3, sin = Math.sin(Math.pow(v, t));

        w = Math.pow(sin, 2)/Math.sqrt(1 + Math.pow(v, s));

        System.out.println("w = " + w);


    }
}
