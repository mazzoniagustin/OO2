import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static java.lang.Integer.parseInt;

public class RepeatServer extends SingleThreadTCPServer{


    @Override
    public void handleMessage(String message, PrintWriter out) {

        String[] args = message.split(" ");

        if (args.length < 2) {
            out.println("Se deben ingresar al menos 2 parámetros.");
            return;
        }

        String phrase = args[0];
        String ammount = args[1];
        String delimiter = " ";

        if (args.length == 3) {
            delimiter = args[2];
        }


        if (phrase.isEmpty() || ammount.isEmpty()) {
            out.println("Los argumentos no pueden estar vacios");
            return;
        }

        int count;
        try{
            count = Integer.parseInt(ammount);
        }
        catch (NumberFormatException e) {
            out.println("La cantidad debe ser un número");
            return;
        }

        if (count <= 0) {
            out.println("La cantidad debe ser mayor que 0");
            return;
        }

        String result = (phrase + delimiter).repeat(count);

        out.println(result);
    }
}

