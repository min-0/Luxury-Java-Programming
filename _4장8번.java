import java.util.Scanner;

class phone {
    private int n;
    Scanner sc = new Scanner(System.in);

    public phone() {

    }

    public phone(int n) {
        this.n = n;
    }
}

class phoneBook extends phone {

    public phoneBook() {
        super();
    }

    public int num() {
        int n = sc.nextInt();
        sc.close();
        return n;
    }
}

public class _4장8번 {

    public static void main(String[] args) {

        System.out.println("인원수>> ");
    }
}