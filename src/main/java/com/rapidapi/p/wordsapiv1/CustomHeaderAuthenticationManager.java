/*
 * WordsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.rapidapi.p.wordsapiv1;

import com.rapidapi.p.wordsapiv1.http.request.HttpRequest;
import java.util.concurrent.CompletableFuture;

public class CustomHeaderAuthenticationManager implements AuthManager, CustomHeaderAuthenticationCredentials {

    private String xRapidAPIKey;

    /**
     * Constructor that sets custom header parameters.
     */
    public CustomHeaderAuthenticationManager(String xRapidAPIKey) {
        this.xRapidAPIKey = xRapidAPIKey;
    }

    /**
     * String value for xRapidAPIKey.
     * @return xRapidAPIKey
     */
    public String getXRapidAPIKey() {
        return xRapidAPIKey;
    }

    /**
     * Checks if provided credentials matched with existing ones.
     * @param xRapidAPIKey String value for credentials.
     * @return true if credentials matched.
     */
    public boolean equals(String xRapidAPIKey) {
        return xRapidAPIKey.equals(getXRapidAPIKey());
    }

    /**
     * Converts this CustomHeaderAuthenticationManager into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomHeaderAuthenticationManager [" + "xRapidAPIKey=" + xRapidAPIKey + "]";
    }

    /**
     * Adds custom header parameters (if present) to the given HttpRequest.
     */
    public HttpRequest apply(HttpRequest httpRequest) {
        httpRequest.getHeaders().add("X-RapidAPI-Key", xRapidAPIKey);
        return httpRequest;
    }

    /**
     * Adds custom header parameters (if present) to the given HttpRequest.
     */
    public CompletableFuture<HttpRequest> applyAsync(HttpRequest httpRequest) {
        return CompletableFuture.completedFuture(apply(httpRequest));
    }
}
