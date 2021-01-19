// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ManagedMobileLobApp;
import com.microsoft.graph.requests.extensions.MobileAppContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Mobile Lob App Request.
 */
public class ManagedMobileLobAppRequest extends BaseRequest<ManagedMobileLobApp> {
	
    /**
     * The request for the ManagedMobileLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagedMobileLobAppRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ManagedMobileLobApp> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagedMobileLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedMobileLobAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedMobileLobApp.class);
    }

    /**
     * Gets the ManagedMobileLobApp from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedMobileLobApp> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagedMobileLobApp from the service
     *
     * @return the ManagedMobileLobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedMobileLobApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedMobileLobApp> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagedMobileLobApp delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedMobileLobApp with a source
     *
     * @param sourceManagedMobileLobApp the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedMobileLobApp> patchAsync(@Nonnull final ManagedMobileLobApp sourceManagedMobileLobApp) {
        return sendAsync(HttpMethod.PATCH, sourceManagedMobileLobApp);
    }

    /**
     * Patches this ManagedMobileLobApp with a source
     *
     * @param sourceManagedMobileLobApp the source object with updates
     * @return the updated ManagedMobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedMobileLobApp patch(@Nonnull final ManagedMobileLobApp sourceManagedMobileLobApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedMobileLobApp);
    }

    /**
     * Creates a ManagedMobileLobApp with a new object
     *
     * @param newManagedMobileLobApp the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedMobileLobApp> postAsync(@Nonnull final ManagedMobileLobApp newManagedMobileLobApp) {
        return sendAsync(HttpMethod.POST, newManagedMobileLobApp);
    }

    /**
     * Creates a ManagedMobileLobApp with a new object
     *
     * @param newManagedMobileLobApp the new object to create
     * @return the created ManagedMobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedMobileLobApp post(@Nonnull final ManagedMobileLobApp newManagedMobileLobApp) throws ClientException {
        return send(HttpMethod.POST, newManagedMobileLobApp);
    }

    /**
     * Creates a ManagedMobileLobApp with a new object
     *
     * @param newManagedMobileLobApp the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedMobileLobApp> putAsync(@Nonnull final ManagedMobileLobApp newManagedMobileLobApp) {
        return sendAsync(HttpMethod.PUT, newManagedMobileLobApp);
    }

    /**
     * Creates a ManagedMobileLobApp with a new object
     *
     * @param newManagedMobileLobApp the object to create/update
     * @return the created ManagedMobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedMobileLobApp put(@Nonnull final ManagedMobileLobApp newManagedMobileLobApp) throws ClientException {
        return send(HttpMethod.PUT, newManagedMobileLobApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedMobileLobAppRequest select(@Nonnull final String value) {
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
     public ManagedMobileLobAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

