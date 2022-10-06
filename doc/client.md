
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |
| `xRapidAPIKey` | `String` | This is an API key from RapidAPI. |

The API client can be initialized as follows:

```java
WordsAPIClient client = new WordsAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .customHeaderAuthenticationCredentials("X-RapidAPI-Key")
    .build();
```

## Words APIClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getAPIsController()` | Provides access to APIs controller. | `APIsController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

