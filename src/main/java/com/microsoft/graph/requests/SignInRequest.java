// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SignIn;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sign In Request.
 */
public class SignInRequest extends BaseRequest<SignIn> {
	
    /**
     * The request for the SignIn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public SignInRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends SignIn> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the SignIn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SignInRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SignIn.class);
    }

    /**
     * Gets the SignIn from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SignIn> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SignIn from the service
     *
     * @return the SignIn from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SignIn get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SignIn> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SignIn delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SignIn with a source
     *
     * @param sourceSignIn the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SignIn> patchAsync(@Nonnull final SignIn sourceSignIn) {
        return sendAsync(HttpMethod.PATCH, sourceSignIn);
    }

    /**
     * Patches this SignIn with a source
     *
     * @param sourceSignIn the source object with updates
     * @return the updated SignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SignIn patch(@Nonnull final SignIn sourceSignIn) throws ClientException {
        return send(HttpMethod.PATCH, sourceSignIn);
    }

    /**
     * Creates a SignIn with a new object
     *
     * @param newSignIn the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SignIn> postAsync(@Nonnull final SignIn newSignIn) {
        return sendAsync(HttpMethod.POST, newSignIn);
    }

    /**
     * Creates a SignIn with a new object
     *
     * @param newSignIn the new object to create
     * @return the created SignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SignIn post(@Nonnull final SignIn newSignIn) throws ClientException {
        return send(HttpMethod.POST, newSignIn);
    }

    /**
     * Creates a SignIn with a new object
     *
     * @param newSignIn the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SignIn> putAsync(@Nonnull final SignIn newSignIn) {
        return sendAsync(HttpMethod.PUT, newSignIn);
    }

    /**
     * Creates a SignIn with a new object
     *
     * @param newSignIn the object to create/update
     * @return the created SignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SignIn put(@Nonnull final SignIn newSignIn) throws ClientException {
        return send(HttpMethod.PUT, newSignIn);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SignInRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public SignInRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

