// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.WorkforceIntegration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workforce Integration Request.
 */
public class WorkforceIntegrationRequest extends BaseRequest<WorkforceIntegration> {
	
    /**
     * The request for the WorkforceIntegration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkforceIntegrationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkforceIntegration.class);
    }

    /**
     * Gets the WorkforceIntegration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkforceIntegration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkforceIntegration from the service
     *
     * @return the WorkforceIntegration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkforceIntegration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkforceIntegration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkforceIntegration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkforceIntegration with a source
     *
     * @param sourceWorkforceIntegration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkforceIntegration> patchAsync(@Nonnull final WorkforceIntegration sourceWorkforceIntegration) {
        return sendAsync(HttpMethod.PATCH, sourceWorkforceIntegration);
    }

    /**
     * Patches this WorkforceIntegration with a source
     *
     * @param sourceWorkforceIntegration the source object with updates
     * @return the updated WorkforceIntegration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkforceIntegration patch(@Nonnull final WorkforceIntegration sourceWorkforceIntegration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkforceIntegration);
    }

    /**
     * Creates a WorkforceIntegration with a new object
     *
     * @param newWorkforceIntegration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkforceIntegration> postAsync(@Nonnull final WorkforceIntegration newWorkforceIntegration) {
        return sendAsync(HttpMethod.POST, newWorkforceIntegration);
    }

    /**
     * Creates a WorkforceIntegration with a new object
     *
     * @param newWorkforceIntegration the new object to create
     * @return the created WorkforceIntegration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkforceIntegration post(@Nonnull final WorkforceIntegration newWorkforceIntegration) throws ClientException {
        return send(HttpMethod.POST, newWorkforceIntegration);
    }

    /**
     * Creates a WorkforceIntegration with a new object
     *
     * @param newWorkforceIntegration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkforceIntegration> putAsync(@Nonnull final WorkforceIntegration newWorkforceIntegration) {
        return sendAsync(HttpMethod.PUT, newWorkforceIntegration);
    }

    /**
     * Creates a WorkforceIntegration with a new object
     *
     * @param newWorkforceIntegration the object to create/update
     * @return the created WorkforceIntegration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkforceIntegration put(@Nonnull final WorkforceIntegration newWorkforceIntegration) throws ClientException {
        return send(HttpMethod.PUT, newWorkforceIntegration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkforceIntegrationRequest select(@Nonnull final String value) {
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
     public WorkforceIntegrationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

