//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //1
        System.out.println("Використання циклу for");
        for (int i = 500; i <=650 ; i+=10) {
            System.out.println(i);
        }
        System.out.println("Використання циклу while");
        int v = 500;
        while (v<=650){
            System.out.println(v);
            v+=10;
        }
        System.out.println("Використання циклу do-while");
        int r =500;
        do {
            System.out.println(r);
            r+=10;
        }
        while (r<=650);
        //2
        int a = 2;
        while (a<5000){
            a= 2*a-1;
            System.out.println(a + " ");
        }
        //3
        int x = 10;
        System.out.println("Додатні дільники числа"+ x ) ;
        for (int i= 1; i <=x  ; i++) {
            if (x % i ==0){
                System.out.println(i);
            }
        }
        //4
        System.out.println("За допомогою циклу for");
        int t = 10;
        long f = 1;
        for (int i = 1; i <= t; i++) {
            f *=i;
        }
        System.out.println("Факторіал числа" + t + "=" + f);
        System.out.println("За допомогою циклу while");
        int b = 10;
        long f1 = 1;
        int c = 1;
        while (c<=b){
            f1 *=c;
            c++;
            System.out.println("Факторіал числа"+ b+ "="+ f1);
        }
    }
}