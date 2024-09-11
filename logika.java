public class logika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        {
            //AND
            boolean hasil = a && b;
            System.out.println(hasil);
        }

        {
            //OR
            boolean hasil = a || b;
            System.out.println(hasil);
        }

        {
            // XOR
            boolean hasil = a ^ b;
            System.out.println(hasil);
        }

    }
}
