package tv.codely.solid_principles.single_responsability_principle;

final public class Client {

    public Client() {
        Book book = new Book();
        book.getCurrentPage();
    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}
