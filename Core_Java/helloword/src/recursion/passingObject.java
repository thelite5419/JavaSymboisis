package recursion;


public class passingObject {

    public static void main(String[] args) {
        PassObj ps = new PassObj();
        ps.getNumber(100, 200);
        ps.putNumber();

        PassObj c3 = new PassObj();
        c3.getNumber(4, 5);
        c3.putNumber();

        PassObj c4 = ps.add(c3); 
        c4.putNumber(); 
    }
}

class PassObj {
    int a, b;

    void getNumber(int x, int y) {
        a = x;
        b = y;
    }

    void putNumber() {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }

    PassObj add(PassObj t10) { 
        PassObj temp = new PassObj();
        temp.a = this.a + t10.a; 
        temp.b = this.b + t10.b;
        return temp;
    }
}
