public class Lesson {
    public static void main(String[] args) {
        int x = 12, y = 5;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = ++x - y--;
        System.out.println(x);
        System.out.println(y);
        x = x++;
        y = x++ + --y;
        int z = x + y++;
        System.out.println(x++);
        System.out.println(y++);
        System.out.println(z);
        int n = --z + --x - ++y;
        System.out.println(n);
        System.out.println(n+=x);

        boolean g = n<20 && n>x;
        System.out.println(g);


    }
}
