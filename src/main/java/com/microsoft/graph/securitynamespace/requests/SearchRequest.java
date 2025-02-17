// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.Search;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Request.
 */
public class SearchRequest extends BaseRequest<Search> {
	
    /**
     * The request for the Search
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public SearchRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends Search> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Search
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SearchRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Search.class);
    }

    /**
     * Gets the Search from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Search> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Search from the service
     *
     * @return the Search from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Search get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Search> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Search delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Search with a source
     *
     * @param sourceSearch the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Search> patchAsync(@Nonnull final Search sourceSearch) {
        return sendAsync(HttpMethod.PATCH, sourceSearch);
    }

    /**
     * Patches this Search with a source
     *
     * @param sourceSearch the source object with updates
     * @return the updated Search
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Search patch(@Nonnull final Search sourceSearch) throws ClientException {
        return send(HttpMethod.PATCH, sourceSearch);
    }

    /**
     * Creates a Search with a new object
     *
     * @param newSearch the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Search> postAsync(@Nonnull final Search newSearch) {
        return sendAsync(HttpMethod.POST, newSearch);
    }

    /**
     * Creates a Search with a new object
     *
     * @param newSearch the new object to create
     * @return the created Search
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Search post(@Nonnull final Search newSearch) throws ClientException {
        return send(HttpMethod.POST, newSearch);
    }

    /**
     * Creates a Search with a new object
     *
     * @param newSearch the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Search> putAsync(@Nonnull final Search newSearch) {
        return sendAsync(HttpMethod.PUT, newSearch);
    }

    /**
     * Creates a Search with a new object
     *
     * @param newSearch the object to create/update
     * @return the created Search
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Search put(@Nonnull final Search newSearch) throws ClientException {
        return send(HttpMethod.PUT, newSearch);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SearchRequest select(@Nonnull final String value) {
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
     public SearchRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

