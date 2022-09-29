
# Getting Started with Words API

## Introduction

Words API lets you retrieve information about English words, including definitions, synonyms, rhymes, pronunciation, syllables, and frequency of usage. It also can tell you about relationships between words, for instance that “math” has categories like “algebra” and “geometry”, or that a “finger” is part of a “hand”.

## Building

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Words%20API-Java&workspaceName=WordsAPI&projectName=WordsAPILib&rootNamespace=com.rapidapi.p.wordsapiv1&groupId=WordsAPILib&artifactId=words-apilib&version=1.0.2&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Words%20API-Java&workspaceName=WordsAPI&projectName=WordsAPILib&rootNamespace=com.rapidapi.p.wordsapiv1&groupId=WordsAPILib&artifactId=words-apilib&version=1.0.2&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=Words%20API-Java&workspaceName=WordsAPI&projectName=WordsAPILib&rootNamespace=com.rapidapi.p.wordsapiv1&groupId=WordsAPILib&artifactId=words-apilib&version=1.0.2&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=Words%20API-Java&workspaceName=WordsAPI&projectName=WordsAPILib&rootNamespace=com.rapidapi.p.wordsapiv1&groupId=WordsAPILib&artifactId=words-apilib&version=1.0.2&step=import3)

## Installation

The following section explains how to use the WordsAPILib library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=Words%20API-Java&workspaceName=WordsAPI&projectName=WordsAPILib&rootNamespace=com.rapidapi.p.wordsapiv1&groupId=WordsAPILib&artifactId=words-apilib&version=1.0.2&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Words%20API-Java&workspaceName=WordsAPI&projectName=WordsAPILib&rootNamespace=com.rapidapi.p.wordsapiv1&groupId=WordsAPILib&artifactId=words-apilib&version=1.0.2&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Words%20API-Java&workspaceName=WordsAPI&projectName=WordsAPILib&rootNamespace=com.rapidapi.p.wordsapiv1&groupId=WordsAPILib&artifactId=words-apilib&version=1.0.2&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=Words%20API-Java&workspaceName=WordsAPI&projectName=WordsAPILib&rootNamespace=com.rapidapi.p.wordsapiv1&groupId=WordsAPILib&artifactId=words-apilib&version=1.0.2&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=Words%20API-Java&workspaceName=WordsAPI&projectName=WordsAPILib&rootNamespace=com.rapidapi.p.wordsapiv1&groupId=WordsAPILib&artifactId=words-apilib&version=1.0.2&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *WordsAPILib* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Words%20API-Java&workspaceName=WordsAPI&projectName=WordsAPILib&rootNamespace=com.rapidapi.p.wordsapiv1&groupId=WordsAPILib&artifactId=words-apilib&version=1.0.2&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify WordsAPILib in `Group Id`, words-apilib in `Artifact Id` and 1.0.2 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Words%20API-Java&workspaceName=WordsAPI&projectName=WordsAPILib&rootNamespace=com.rapidapi.p.wordsapiv1&groupId=WordsAPILib&artifactId=words-apilib&version=1.0.2&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=Words%20API-Java&workspaceName=WordsAPI&projectName=WordsAPILib&rootNamespace=com.rapidapi.p.wordsapiv1&groupId=WordsAPILib&artifactId=words-apilib&version=1.0.2&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project WordsAPILib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

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

## Authorization

This API uses `Custom Header Signature`.

## List of APIs

* [AP Is](doc/controllers/ap-is.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [HttpCallback Interface](doc/http-callback-interface.md)
* [Headers](doc/headers.md)
* [ApiException](doc/api-exception.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)

