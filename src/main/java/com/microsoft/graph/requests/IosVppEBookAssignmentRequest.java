// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosVppEBookAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp EBook Assignment Request.
 */
public class IosVppEBookAssignmentRequest extends BaseRequest<IosVppEBookAssignment> {
	
    /**
     * The request for the IosVppEBookAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosVppEBookAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosVppEBookAssignment.class);
    }

    /**
     * Gets the IosVppEBookAssignment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppEBookAssignment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IosVppEBookAssignment from the service
     *
     * @return the IosVppEBookAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppEBookAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppEBookAssignment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IosVppEBookAssignment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosVppEBookAssignment with a source
     *
     * @param sourceIosVppEBookAssignment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppEBookAssignment> patchAsync(@Nonnull final IosVppEBookAssignment sourceIosVppEBookAssignment) {
        return sendAsync(HttpMethod.PATCH, sourceIosVppEBookAssignment);
    }

    /**
     * Patches this IosVppEBookAssignment with a source
     *
     * @param sourceIosVppEBookAssignment the source object with updates
     * @return the updated IosVppEBookAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppEBookAssignment patch(@Nonnull final IosVppEBookAssignment sourceIosVppEBookAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosVppEBookAssignment);
    }

    /**
     * Creates a IosVppEBookAssignment with a new object
     *
     * @param newIosVppEBookAssignment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppEBookAssignment> postAsync(@Nonnull final IosVppEBookAssignment newIosVppEBookAssignment) {
        return sendAsync(HttpMethod.POST, newIosVppEBookAssignment);
    }

    /**
     * Creates a IosVppEBookAssignment with a new object
     *
     * @param newIosVppEBookAssignment the new object to create
     * @return the created IosVppEBookAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppEBookAssignment post(@Nonnull final IosVppEBookAssignment newIosVppEBookAssignment) throws ClientException {
        return send(HttpMethod.POST, newIosVppEBookAssignment);
    }

    /**
     * Creates a IosVppEBookAssignment with a new object
     *
     * @param newIosVppEBookAssignment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppEBookAssignment> putAsync(@Nonnull final IosVppEBookAssignment newIosVppEBookAssignment) {
        return sendAsync(HttpMethod.PUT, newIosVppEBookAssignment);
    }

    /**
     * Creates a IosVppEBookAssignment with a new object
     *
     * @param newIosVppEBookAssignment the object to create/update
     * @return the created IosVppEBookAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppEBookAssignment put(@Nonnull final IosVppEBookAssignment newIosVppEBookAssignment) throws ClientException {
        return send(HttpMethod.PUT, newIosVppEBookAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosVppEBookAssignmentRequest select(@Nonnull final String value) {
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
     public IosVppEBookAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

