package main;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import models.Documento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String apiUrl = "https://j-sb-drainage.ueredeveloper.repl.co/documento";

		try {
			// Create a URL object and open a connection to the URL
			URL url = new URL(apiUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// Set the request method to GET
			connection.setRequestMethod("GET");

			// Read the response from the connection
			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				// Create a BufferedReader to read the response
				BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				StringBuilder response = new StringBuilder();
				String line;
				while ((line = reader.readLine()) != null) {
					response.append(line);
				}
				reader.close();

				// Parse the JSON response using Gson
				Gson gson = new Gson();
				JsonElement jsonElement = JsonParser.parseString(response.toString());
				if (jsonElement.isJsonArray()) {
					JsonArray jsonArray = jsonElement.getAsJsonArray();
					for (JsonElement element : jsonArray) {
						System.out.println(element);
						// You can access the JSON elements as needed
					}
				}
			} else if (responseCode == HttpURLConnection.HTTP_CREATED) {
				// Handle the 201 response code (resource created)
				System.out.println("Resource created successfully.");
				// You can also parse the JSON response if it's available in the response body
				

                // Read and parse the JSON response in the body
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                System.out.println("reader");
                System.out.println(reader);
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                	System.out.println("line");
                	System.out.println(line);
                    response.append(line);
                }
                reader.close();

                Gson gson = new Gson();
                //JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
                //System.out.println(jsonObject);
                List<Documento> documentos = gson.fromJson(response.toString(), new TypeToken<List<Documento>>() {}.getType());

                for (Documento documento : documentos) {
                    System.out.println("doc_numero: " + documento.getDoc_numero());
                    System.out.println("doc_processo: " + documento.getDoc_processo());
                    System.out.println("doc_sei: " + documento.getDoc_sei());
                    //System.out.println("doc_tipo: " + documento.getDoc_tipo().getDt_descricao());
                }
                
                // Handle the JSON response as needed
			} else {
				System.err.println("HTTP Request failed with response code: " + responseCode);
			}

			// Close the connection
			connection.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
