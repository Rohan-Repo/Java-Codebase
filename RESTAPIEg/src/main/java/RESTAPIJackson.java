import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

// Define POJOs (recommended industry approach)
@JsonIgnoreProperties(ignoreUnknown = true)
class Address {
    public String city;
}
class Company {
    public String name;
}
class User {
    public int id;
    public String name;
    public String email;
    public String phone;
    public String website;
    public Address address;
    public Company company;
}

 public class RESTAPIJackson {
    public static void main(String[] args) throws Exception {
        String url = "https://jsonplaceholder.typicode.com/users";

        // 1️⃣ Use modern Java HttpClient
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // 2️⃣ Parse JSON into Java objects (Jackson is industry standard)
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        User[] users = mapper.readValue(response.body(), User[].class);

        // 3️⃣ Print results
        for (User user : users) {
            System.out.println("\nFor User ID: " + user.id);
            System.out.println("\tName: " + user.name);
            System.out.println("\tEmail: " + user.email);
            System.out.println("\tPhone: " + user.phone);
            System.out.println("\tCity: " + user.address.city);
            System.out.println("\tWebsite: " + user.website);
            System.out.println("\tCompany: " + user.company.name);
        }
    }
}
