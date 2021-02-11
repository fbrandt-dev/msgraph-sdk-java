// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TargetedManagedAppProtection;
import com.microsoft.graph.models.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.requests.TargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.TargetedManagedAppPolicyAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Protection Request.
 */
public class TargetedManagedAppProtectionRequest extends BaseRequest<TargetedManagedAppProtection> {
	
    /**
     * The request for the TargetedManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public TargetedManagedAppProtectionRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends TargetedManagedAppProtection> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the TargetedManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TargetedManagedAppProtectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TargetedManagedAppProtection.class);
    }

    /**
     * Gets the TargetedManagedAppProtection from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppProtection> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TargetedManagedAppProtection from the service
     *
     * @return the TargetedManagedAppProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppProtection> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TargetedManagedAppProtection delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TargetedManagedAppProtection with a source
     *
     * @param sourceTargetedManagedAppProtection the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppProtection> patchAsync(@Nonnull final TargetedManagedAppProtection sourceTargetedManagedAppProtection) {
        return sendAsync(HttpMethod.PATCH, sourceTargetedManagedAppProtection);
    }

    /**
     * Patches this TargetedManagedAppProtection with a source
     *
     * @param sourceTargetedManagedAppProtection the source object with updates
     * @return the updated TargetedManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppProtection patch(@Nonnull final TargetedManagedAppProtection sourceTargetedManagedAppProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceTargetedManagedAppProtection);
    }

    /**
     * Creates a TargetedManagedAppProtection with a new object
     *
     * @param newTargetedManagedAppProtection the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppProtection> postAsync(@Nonnull final TargetedManagedAppProtection newTargetedManagedAppProtection) {
        return sendAsync(HttpMethod.POST, newTargetedManagedAppProtection);
    }

    /**
     * Creates a TargetedManagedAppProtection with a new object
     *
     * @param newTargetedManagedAppProtection the new object to create
     * @return the created TargetedManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppProtection post(@Nonnull final TargetedManagedAppProtection newTargetedManagedAppProtection) throws ClientException {
        return send(HttpMethod.POST, newTargetedManagedAppProtection);
    }

    /**
     * Creates a TargetedManagedAppProtection with a new object
     *
     * @param newTargetedManagedAppProtection the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppProtection> putAsync(@Nonnull final TargetedManagedAppProtection newTargetedManagedAppProtection) {
        return sendAsync(HttpMethod.PUT, newTargetedManagedAppProtection);
    }

    /**
     * Creates a TargetedManagedAppProtection with a new object
     *
     * @param newTargetedManagedAppProtection the object to create/update
     * @return the created TargetedManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppProtection put(@Nonnull final TargetedManagedAppProtection newTargetedManagedAppProtection) throws ClientException {
        return send(HttpMethod.PUT, newTargetedManagedAppProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TargetedManagedAppProtectionRequest select(@Nonnull final String value) {
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
     public TargetedManagedAppProtectionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

