// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.SharedInsight;
import com.microsoft.graph.requests.extensions.EntityRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shared Insight Request.
 */
public class SharedInsightRequest extends BaseRequest<SharedInsight> {
	
    /**
     * The request for the SharedInsight
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SharedInsightRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SharedInsight.class);
    }

    /**
     * Gets the SharedInsight from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SharedInsight> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SharedInsight from the service
     *
     * @return the SharedInsight from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SharedInsight get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SharedInsight> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SharedInsight delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SharedInsight with a source
     *
     * @param sourceSharedInsight the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SharedInsight> patchAsync(@Nonnull final SharedInsight sourceSharedInsight) {
        return sendAsync(HttpMethod.PATCH, sourceSharedInsight);
    }

    /**
     * Patches this SharedInsight with a source
     *
     * @param sourceSharedInsight the source object with updates
     * @return the updated SharedInsight
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SharedInsight patch(@Nonnull final SharedInsight sourceSharedInsight) throws ClientException {
        return send(HttpMethod.PATCH, sourceSharedInsight);
    }

    /**
     * Creates a SharedInsight with a new object
     *
     * @param newSharedInsight the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SharedInsight> postAsync(@Nonnull final SharedInsight newSharedInsight) {
        return sendAsync(HttpMethod.POST, newSharedInsight);
    }

    /**
     * Creates a SharedInsight with a new object
     *
     * @param newSharedInsight the new object to create
     * @return the created SharedInsight
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SharedInsight post(@Nonnull final SharedInsight newSharedInsight) throws ClientException {
        return send(HttpMethod.POST, newSharedInsight);
    }

    /**
     * Creates a SharedInsight with a new object
     *
     * @param newSharedInsight the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SharedInsight> putAsync(@Nonnull final SharedInsight newSharedInsight) {
        return sendAsync(HttpMethod.PUT, newSharedInsight);
    }

    /**
     * Creates a SharedInsight with a new object
     *
     * @param newSharedInsight the object to create/update
     * @return the created SharedInsight
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SharedInsight put(@Nonnull final SharedInsight newSharedInsight) throws ClientException {
        return send(HttpMethod.PUT, newSharedInsight);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SharedInsightRequest select(@Nonnull final String value) {
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
     public SharedInsightRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

