// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ConditionalAccessPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Policy Request.
 */
public class ConditionalAccessPolicyRequest extends BaseRequest<ConditionalAccessPolicy> {
	
    /**
     * The request for the ConditionalAccessPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConditionalAccessPolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConditionalAccessPolicy.class);
    }

    /**
     * Gets the ConditionalAccessPolicy from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConditionalAccessPolicy> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ConditionalAccessPolicy from the service
     *
     * @return the ConditionalAccessPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConditionalAccessPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConditionalAccessPolicy> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ConditionalAccessPolicy delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ConditionalAccessPolicy with a source
     *
     * @param sourceConditionalAccessPolicy the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConditionalAccessPolicy> patchAsync(@Nonnull final ConditionalAccessPolicy sourceConditionalAccessPolicy) {
        return sendAsync(HttpMethod.PATCH, sourceConditionalAccessPolicy);
    }

    /**
     * Patches this ConditionalAccessPolicy with a source
     *
     * @param sourceConditionalAccessPolicy the source object with updates
     * @return the updated ConditionalAccessPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConditionalAccessPolicy patch(@Nonnull final ConditionalAccessPolicy sourceConditionalAccessPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceConditionalAccessPolicy);
    }

    /**
     * Creates a ConditionalAccessPolicy with a new object
     *
     * @param newConditionalAccessPolicy the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConditionalAccessPolicy> postAsync(@Nonnull final ConditionalAccessPolicy newConditionalAccessPolicy) {
        return sendAsync(HttpMethod.POST, newConditionalAccessPolicy);
    }

    /**
     * Creates a ConditionalAccessPolicy with a new object
     *
     * @param newConditionalAccessPolicy the new object to create
     * @return the created ConditionalAccessPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConditionalAccessPolicy post(@Nonnull final ConditionalAccessPolicy newConditionalAccessPolicy) throws ClientException {
        return send(HttpMethod.POST, newConditionalAccessPolicy);
    }

    /**
     * Creates a ConditionalAccessPolicy with a new object
     *
     * @param newConditionalAccessPolicy the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConditionalAccessPolicy> putAsync(@Nonnull final ConditionalAccessPolicy newConditionalAccessPolicy) {
        return sendAsync(HttpMethod.PUT, newConditionalAccessPolicy);
    }

    /**
     * Creates a ConditionalAccessPolicy with a new object
     *
     * @param newConditionalAccessPolicy the object to create/update
     * @return the created ConditionalAccessPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConditionalAccessPolicy put(@Nonnull final ConditionalAccessPolicy newConditionalAccessPolicy) throws ClientException {
        return send(HttpMethod.PUT, newConditionalAccessPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ConditionalAccessPolicyRequest select(@Nonnull final String value) {
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
     public ConditionalAccessPolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

