import com.queueSystem.*;
import java.util.Scanner;
import static java.lang.Float.parseFloat;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FloatQueue valores = new FloatQueue();
        float valorF;
        int cantNums = 1;
        float out = 0;

        System.out.println("Introduzca un valor");
        String valorS = sc.nextLine();
        valores.enqueue(parseFloat(valorS));

        while (valorS.equals("Q") != true && valorS.equals("q") != true ) {
            System.out.println("Introduzca un valor");
            valorS = sc.nextLine();
            if (valorS.equals("Q") != true && valorS.equals("q") != true) {
                valorF = parseFloat(valorS);
                valores.enqueue(valorF);
                cantNums++;
            }
        }

        for (int i = 0; i < cantNums; i++) {
            out += valores.dequeue();
        }
        System.out.println(out);
    }
}
