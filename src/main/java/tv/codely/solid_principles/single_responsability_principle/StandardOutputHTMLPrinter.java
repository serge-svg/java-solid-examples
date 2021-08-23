package tv.codely.solid_principles.single_responsability_principle;

public class StandardOutputHTMLPrinter implements Printer {
    @Override
    public void printPage(String page) {
        System.out.println("<div>" + page + "</div>");
    }
}
