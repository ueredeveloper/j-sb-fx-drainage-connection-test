# Teste de Conexão com um Serviço em Spring Boot

Este é um exemplo de código para testar a conexão com um servidor criado em Spring Boot. 

O código faz uma solicitação HTTP GET para uma URL específica e processa a resposta JSON usando a biblioteca Gson.

#### Bibliotecas Utilizadas:

1. **java.net.URL**: 
A classe `URL` é usada para representar uma URL e permite abrir uma conexão com a mesma.

2. **java.net.HttpURLConnection**: 
A classe `HttpURLConnection` é usada para abrir uma conexão HTTP com a URL fornecida e permite configurar a solicitação, bem como ler a resposta.

3. **com.google.gson.Gson**: 
A biblioteca Gson é amplamente utilizada para a conversão de objetos Java em notação JSON e vice-versa. Neste código, ela é usada para analisar e desserializar a resposta JSON da API.

4. **com.google.gson.JsonParser**: 
A classe `JsonParser` é usada para analisar uma string JSON em um elemento JSON, o que torna mais fácil a manipulação dos dados JSON.

5. **com.google.gson.JsonArray e com.google.gson.JsonObject**: 
Essas classes representam elementos JSON que podem ser usados para acessar valores dentro do JSON. Um `JsonArray` representa uma matriz JSON, enquanto um `JsonObject` representa um objeto JSON.

6. **com.google.gson.reflect.TypeToken**: 
Essa classe é usada em conjunto com o Gson para analisar objetos JSON em listas de objetos Java. É útil quando você precisa analisar JSON em uma lista de objetos com tipos específicos.
