package StructuralPatterns.Adapter;

public class PrinterAdapter implements NewPrinter {
    private final OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print(String text) {
        oldPrinter.print(text);
    }
}
