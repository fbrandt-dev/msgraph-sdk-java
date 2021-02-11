// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedAppConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Configuration Request.
 */
public class ManagedAppConfigurationRequest extends BaseRequest<ManagedAppConfiguration> {
	
    /**
     * The request for the ManagedAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagedAppConfigurationRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ManagedAppConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagedAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppConfiguration.class);
    }

    /**
     * Gets the ManagedAppConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagedAppConfiguration from the service
     *
     * @return the ManagedAppConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagedAppConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedAppConfiguration with a source
     *
     * @param sourceManagedAppConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppConfiguration> patchAsync(@Nonnull final ManagedAppConfiguration sourceManagedAppConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceManagedAppConfiguration);
    }

    /**
     * Patches this ManagedAppConfiguration with a source
     *
     * @param sourceManagedAppConfiguration the source object with updates
     * @return the updated ManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppConfiguration patch(@Nonnull final ManagedAppConfiguration sourceManagedAppConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAppConfiguration);
    }

    /**
     * Creates a ManagedAppConfiguration with a new object
     *
     * @param newManagedAppConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppConfiguration> postAsync(@Nonnull final ManagedAppConfiguration newManagedAppConfiguration) {
        return sendAsync(HttpMethod.POST, newManagedAppConfiguration);
    }

    /**
     * Creates a ManagedAppConfiguration with a new object
     *
     * @param newManagedAppConfiguration the new object to create
     * @return the created ManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppConfiguration post(@Nonnull final ManagedAppConfiguration newManagedAppConfiguration) throws ClientException {
        return send(HttpMethod.POST, newManagedAppConfiguration);
    }

    /**
     * Creates a ManagedAppConfiguration with a new object
     *
     * @param newManagedAppConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppConfiguration> putAsync(@Nonnull final ManagedAppConfiguration newManagedAppConfiguration) {
        return sendAsync(HttpMethod.PUT, newManagedAppConfiguration);
    }

    /**
     * Creates a ManagedAppConfiguration with a new object
     *
     * @param newManagedAppConfiguration the object to create/update
     * @return the created ManagedAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppConfiguration put(@Nonnull final ManagedAppConfiguration newManagedAppConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newManagedAppConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedAppConfigurationRequest select(@Nonnull final String value) {
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
     public ManagedAppConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

