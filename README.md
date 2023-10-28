# Teste de Conex�o com um Servi�o em Spring Boot

Este � um exemplo de c�digo para testar a conex�o com um servidor criado em Spring Boot. 

O c�digo faz uma solicita��o HTTP GET para uma URL espec�fica e processa a resposta JSON usando a biblioteca Gson.

#### Bibliotecas Utilizadas:

1. **java.net.URL**: 
A classe `URL` � usada para representar uma URL e permite abrir uma conex�o com a mesma.

2. **java.net.HttpURLConnection**: 
A classe `HttpURLConnection` � usada para abrir uma conex�o HTTP com a URL fornecida e permite configurar a solicita��o, bem como ler a resposta.

3. **com.google.gson.Gson**: 
A biblioteca Gson � amplamente utilizada para a convers�o de objetos Java em nota��o JSON e vice-versa. Neste c�digo, ela � usada para analisar e desserializar a resposta JSON da API.

4. **com.google.gson.JsonParser**: 
A classe `JsonParser` � usada para analisar uma string JSON em um elemento JSON, o que torna mais f�cil a manipula��o dos dados JSON.

5. **com.google.gson.JsonArray e com.google.gson.JsonObject**: 
Essas classes representam elementos JSON que podem ser usados para acessar valores dentro do JSON. Um `JsonArray` representa uma matriz JSON, enquanto um `JsonObject` representa um objeto JSON.

6. **com.google.gson.reflect.TypeToken**: 
Essa classe � usada em conjunto com o Gson para analisar objetos JSON em listas de objetos Java. � �til quando voc� precisa analisar JSON em uma lista de objetos com tipos espec�ficos.
