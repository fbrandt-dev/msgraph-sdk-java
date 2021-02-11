// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IdentityContainer;
import com.microsoft.graph.requests.ConditionalAccessRootRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Container Request.
 */
public class IdentityContainerRequest extends BaseRequest<IdentityContainer> {
	
    /**
     * The request for the IdentityContainer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityContainerRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IdentityContainer.class);
    }

    /**
     * Gets the IdentityContainer from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityContainer> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IdentityContainer from the service
     *
     * @return the IdentityContainer from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IdentityContainer get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityContainer> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IdentityContainer delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IdentityContainer with a source
     *
     * @param sourceIdentityContainer the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityContainer> patchAsync(@Nonnull final IdentityContainer sourceIdentityContainer) {
        return sendAsync(HttpMethod.PATCH, sourceIdentityContainer);
    }

    /**
     * Patches this IdentityContainer with a source
     *
     * @param sourceIdentityContainer the source object with updates
     * @return the updated IdentityContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IdentityContainer patch(@Nonnull final IdentityContainer sourceIdentityContainer) throws ClientException {
        return send(HttpMethod.PATCH, sourceIdentityContainer);
    }

    /**
     * Creates a IdentityContainer with a new object
     *
     * @param newIdentityContainer the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityContainer> postAsync(@Nonnull final IdentityContainer newIdentityContainer) {
        return sendAsync(HttpMethod.POST, newIdentityContainer);
    }

    /**
     * Creates a IdentityContainer with a new object
     *
     * @param newIdentityContainer the new object to create
     * @return the created IdentityContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IdentityContainer post(@Nonnull final IdentityContainer newIdentityContainer) throws ClientException {
        return send(HttpMethod.POST, newIdentityContainer);
    }

    /**
     * Creates a IdentityContainer with a new object
     *
     * @param newIdentityContainer the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityContainer> putAsync(@Nonnull final IdentityContainer newIdentityContainer) {
        return sendAsync(HttpMethod.PUT, newIdentityContainer);
    }

    /**
     * Creates a IdentityContainer with a new object
     *
     * @param newIdentityContainer the object to create/update
     * @return the created IdentityContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IdentityContainer put(@Nonnull final IdentityContainer newIdentityContainer) throws ClientException {
        return send(HttpMethod.PUT, newIdentityContainer);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IdentityContainerRequest select(@Nonnull final String value) {
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
     public IdentityContainerRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

