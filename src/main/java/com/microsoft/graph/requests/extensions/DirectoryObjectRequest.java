// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Request.
 */
public class DirectoryObjectRequest extends BaseRequest<DirectoryObject> {
	
    /**
     * The request for the DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DirectoryObjectRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends DirectoryObject> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryObject.class);
    }

    /**
     * Gets the DirectoryObject from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryObject> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DirectoryObject from the service
     *
     * @return the DirectoryObject from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DirectoryObject get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryObject> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DirectoryObject delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DirectoryObject with a source
     *
     * @param sourceDirectoryObject the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryObject> patchAsync(@Nonnull final DirectoryObject sourceDirectoryObject) {
        return sendAsync(HttpMethod.PATCH, sourceDirectoryObject);
    }

    /**
     * Patches this DirectoryObject with a source
     *
     * @param sourceDirectoryObject the source object with updates
     * @return the updated DirectoryObject
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DirectoryObject patch(@Nonnull final DirectoryObject sourceDirectoryObject) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectoryObject);
    }

    /**
     * Creates a DirectoryObject with a new object
     *
     * @param newDirectoryObject the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryObject> postAsync(@Nonnull final DirectoryObject newDirectoryObject) {
        return sendAsync(HttpMethod.POST, newDirectoryObject);
    }

    /**
     * Creates a DirectoryObject with a new object
     *
     * @param newDirectoryObject the new object to create
     * @return the created DirectoryObject
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DirectoryObject post(@Nonnull final DirectoryObject newDirectoryObject) throws ClientException {
        return send(HttpMethod.POST, newDirectoryObject);
    }

    /**
     * Creates a DirectoryObject with a new object
     *
     * @param newDirectoryObject the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryObject> putAsync(@Nonnull final DirectoryObject newDirectoryObject) {
        return sendAsync(HttpMethod.PUT, newDirectoryObject);
    }

    /**
     * Creates a DirectoryObject with a new object
     *
     * @param newDirectoryObject the object to create/update
     * @return the created DirectoryObject
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DirectoryObject put(@Nonnull final DirectoryObject newDirectoryObject) throws ClientException {
        return send(HttpMethod.PUT, newDirectoryObject);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DirectoryObjectRequest select(@Nonnull final String value) {
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
     public DirectoryObjectRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

