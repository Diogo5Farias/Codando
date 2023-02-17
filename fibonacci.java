public class fibonacci {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int cont = 0;
        System.out.println(x);
        System.out.println(y);
        x = 1;
        while(cont < 15) {
            System.out.println(y);
            x = y + x;
            System.out.println(x);
            y = x + y;
            cont++;
        }
    }
}
