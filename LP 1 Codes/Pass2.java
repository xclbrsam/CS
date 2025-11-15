import java.util.*;

class Pass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of IC lines: ");
        int n = sc.nextInt();
        sc.nextLine();
        String IC[] = new String[n];
        for (int i = 0; i < n; i++) {
            IC[i] = sc.nextLine();
        }
        System.out.print("Enter number of symbols: ");
        int m = sc.nextInt();
        sc.nextLine();
        Map<String, String> sym = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String s = sc.next();
            String addr = sc.next();
            sym.put(s, addr);
        }
        for (String line : IC) {
            String op = line.substring(4, 6);
            String symb = line.split(" ")[1];
            System.out.println(op + " " + sym.get(symb));
        }
    }
}
