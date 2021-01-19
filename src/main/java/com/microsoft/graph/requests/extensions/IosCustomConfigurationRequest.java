// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.IosCustomConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Custom Configuration Request.
 */
public class IosCustomConfigurationRequest extends BaseRequest<IosCustomConfiguration> {
	
    /**
     * The request for the IosCustomConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosCustomConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosCustomConfiguration.class);
    }

    /**
     * Gets the IosCustomConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCustomConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IosCustomConfiguration from the service
     *
     * @return the IosCustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCustomConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCustomConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IosCustomConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosCustomConfiguration with a source
     *
     * @param sourceIosCustomConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCustomConfiguration> patchAsync(@Nonnull final IosCustomConfiguration sourceIosCustomConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceIosCustomConfiguration);
    }

    /**
     * Patches this IosCustomConfiguration with a source
     *
     * @param sourceIosCustomConfiguration the source object with updates
     * @return the updated IosCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCustomConfiguration patch(@Nonnull final IosCustomConfiguration sourceIosCustomConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosCustomConfiguration);
    }

    /**
     * Creates a IosCustomConfiguration with a new object
     *
     * @param newIosCustomConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCustomConfiguration> postAsync(@Nonnull final IosCustomConfiguration newIosCustomConfiguration) {
        return sendAsync(HttpMethod.POST, newIosCustomConfiguration);
    }

    /**
     * Creates a IosCustomConfiguration with a new object
     *
     * @param newIosCustomConfiguration the new object to create
     * @return the created IosCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCustomConfiguration post(@Nonnull final IosCustomConfiguration newIosCustomConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosCustomConfiguration);
    }

    /**
     * Creates a IosCustomConfiguration with a new object
     *
     * @param newIosCustomConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCustomConfiguration> putAsync(@Nonnull final IosCustomConfiguration newIosCustomConfiguration) {
        return sendAsync(HttpMethod.PUT, newIosCustomConfiguration);
    }

    /**
     * Creates a IosCustomConfiguration with a new object
     *
     * @param newIosCustomConfiguration the object to create/update
     * @return the created IosCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCustomConfiguration put(@Nonnull final IosCustomConfiguration newIosCustomConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosCustomConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosCustomConfigurationRequest select(@Nonnull final String value) {
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
     public IosCustomConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

