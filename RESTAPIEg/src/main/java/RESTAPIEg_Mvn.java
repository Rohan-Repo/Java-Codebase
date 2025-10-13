import java.net.http.*;
import java.net.URI;
import org.json.JSONArray;
import org.json.JSONObject;

public class RESTAPIEg_Mvn {
    public static void main(String[] args) throws Exception {
        // 1️⃣ Define the URL
        String url = "https://jsonplaceholder.typicode.com/users";

        // 2️⃣ Create an HTTP client and request
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // 3️⃣ Send the request and get the response as a String
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // 4️⃣ Parse the JSON response
        JSONArray users = new JSONArray(response.body());

        // 5️⃣ Print all user data
        for (int i = 0; i < users.length(); i++) {
            JSONObject user = users.getJSONObject(i);

            System.out.println("\nFor User ID : " + user.getInt("id"));
            System.out.println("\tName: " + user.getString("name"));
            System.out.println("\tEmail: " + user.getString("email"));
            System.out.println("\tPhone: " + user.getString("phone"));

            JSONObject address = user.getJSONObject("address");
            System.out.println("\tCity: " + address.getString("city"));

            System.out.println("\tWebsite: " + user.getString("website"));

            JSONObject company = user.getJSONObject("company");
            System.out.println("\tCompany Name: " + company.getString("name"));
        }
    }
}
