import java.io.PrintWriter;
import java.util.*;

public class PassWordServer extends SingleThreadTCPServer {

    public void handleMessage(String message, PrintWriter out) {

        String[] args = message.split(" ");

        if (args.length != 3) {
            out.println("Se deben ingresar 3 parámetros.");
            return;
        }

        String letters = args[0];
        String numbers = args[1];
        String special = args[2];

        if (letters.isEmpty() || numbers.isEmpty() || special.isEmpty()) {
            out.println("Los argumentos no pueden estar vacios");
            return;
        }

        Random random = new Random();

        List<Character> password = new LinkedList<Character>();

        password.add(letters.charAt(random.nextInt(letters.length())));
        password.add(numbers.charAt(random.nextInt(numbers.length())));
        password.add(special.charAt(random.nextInt(special.length())));

        while (password.size() < 8) {

            if (random.nextBoolean()) {
                password.add(letters.charAt(random.nextInt(letters.length())));
            }
            else {
                password.add(numbers.charAt(random.nextInt(numbers.length()));
            }

        }

        Collections.shuffle(password);

        StringBuilder result = new StringBuilder();
        for (char c: password) {
            result.append(c);
        }

        out.println(result);
    }
}
