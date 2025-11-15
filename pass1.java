import java.util.*;

class Pass1 {
    public static void main(String[] args) {

        String code[] = {
            "START 100",
            "MOVER AREG, B",
            "ADD AREG, C",
            "END"
        };

        Map<String, Integer> sym = new HashMap<>();
        int lc = 0;

        for (String line : code) {

            String p[] = line.split(" ");

            if (p[0].equals("START")) {
                lc = Integer.parseInt(p[1]);
                continue;
            }

            if (p[0].equals("END")) {
                break;
            }

            String opnd = p[p.length - 1].replace(",", "");

            if (Character.isLetter(opnd.charAt(0))) {
                sym.put(opnd, lc);
            }

            lc++;
        }

        System.out.println("Symbol Table: " + sym);
    }
}
