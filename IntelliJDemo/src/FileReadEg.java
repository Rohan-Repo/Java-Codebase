import java.io.*;

public class FileReadEg {
    public static void main(String[] args) {
        File file = new File( "src/Test.txt" );

        try {
                BufferedReader reader = new BufferedReader( new FileReader(file) );

                String s = reader.readLine();
                double d1 = Double.parseDouble( reader.readLine() );
                double d2 = Double.parseDouble( reader.readLine() );
                double d3 = Double.parseDouble( reader.readLine() );
                int n1 = Integer.parseInt( reader.readLine() );

            System.out.println( s + " - " + d1 + " - " + d2 + " - " + d3 + " -- " + n1 );

            } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
