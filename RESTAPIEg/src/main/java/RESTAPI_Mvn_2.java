import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class RESTAPI_Mvn_2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/users");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Parse JSON directly from stream
            JsonReader reader = Json.createReader(new InputStreamReader(conn.getInputStream()));
            JsonArray users = reader.readArray();

            for (JsonObject user : users.getValuesAs(JsonObject.class)) {
                System.out.println("\nFor User ID: " + user.getInt("id"));
                System.out.println("\tName: " + user.getString("name"));
                System.out.println("\tEmail: " + user.getString("email"));
                System.out.println("\tPhone: " + user.getString("phone"));
                System.out.println("\tCity: " + user.getJsonObject("address").getString("city"));
                System.out.println("\tWebsite: " + user.getString("website"));
                System.out.println("\tCompany: " + user.getJsonObject("company").getString("name"));
            }

            reader.close();
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
