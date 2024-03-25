public class Party {

    public static void main(String[] args) {
        try {
            serveJuice();
        } catch (UnexpectedItemException e) {
            System.out.println("Oh no! Koi aur drink le lo!");
        }
    }


    static void serveJuice() throws UnexpectedItemException {
        // Imagine you're expecting a juice, but you get a pineapple instead!
        throw new UnexpectedItemException("Ye vodka kyun diya?");
    }
}

class UnexpectedItemException extends Exception {
    public UnexpectedItemException(String message) {
        super(message);
    }
}



