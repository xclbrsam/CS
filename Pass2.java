import java.util.*;

class Pass2 {
    public static void main(String[] args) {
        String IC[] = {"(IS,04) A", "(IS,02) B"};
        Map<String,String> sym = Map.of("A","205", "B","210");

        for (String line : IC) {
            String op = line.substring(4,6);
            String symb = line.split(" ")[1];
            System.out.println(op + " " + sym.get(symb));
        }
    }
}
