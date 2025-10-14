package in.easysystems.generics;

// This means now only Number Values can be stored and printed using this class
// ONLY byte, double, float, int, long, and short ALLOWED
// This restricts your generic Type to only support specific types
public class Printer_BoundedGeneric<T extends Number> {
    T dataToPrint;

    public Printer_BoundedGeneric(T dataToPrint) {
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
