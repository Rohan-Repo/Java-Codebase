package in.easysystems.generics;

public class Printer_Generic<T> {
    T dataToPrint;

    public Printer_Generic(T dataToPrint) {
        this.dataToPrint = dataToPrint;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Printer_Generic{");
        sb.append(" dataToPrint = ").append(dataToPrint);
        sb.append("\t DataType = ").append(dataToPrint.getClass().getSimpleName());
        sb.append('}');
        return sb.toString();
    }
}
