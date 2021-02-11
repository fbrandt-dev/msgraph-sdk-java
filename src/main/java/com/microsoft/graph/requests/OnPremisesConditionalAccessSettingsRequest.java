// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OnPremisesConditionalAccessSettings;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Conditional Access Settings Request.
 */
public class OnPremisesConditionalAccessSettingsRequest extends BaseRequest<OnPremisesConditionalAccessSettings> {
	
    /**
     * The request for the OnPremisesConditionalAccessSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnPremisesConditionalAccessSettingsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnPremisesConditionalAccessSettings.class);
    }

    /**
     * Gets the OnPremisesConditionalAccessSettings from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnPremisesConditionalAccessSettings> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OnPremisesConditionalAccessSettings from the service
     *
     * @return the OnPremisesConditionalAccessSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnPremisesConditionalAccessSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnPremisesConditionalAccessSettings> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OnPremisesConditionalAccessSettings delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OnPremisesConditionalAccessSettings with a source
     *
     * @param sourceOnPremisesConditionalAccessSettings the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnPremisesConditionalAccessSettings> patchAsync(@Nonnull final OnPremisesConditionalAccessSettings sourceOnPremisesConditionalAccessSettings) {
        return sendAsync(HttpMethod.PATCH, sourceOnPremisesConditionalAccessSettings);
    }

    /**
     * Patches this OnPremisesConditionalAccessSettings with a source
     *
     * @param sourceOnPremisesConditionalAccessSettings the source object with updates
     * @return the updated OnPremisesConditionalAccessSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnPremisesConditionalAccessSettings patch(@Nonnull final OnPremisesConditionalAccessSettings sourceOnPremisesConditionalAccessSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnPremisesConditionalAccessSettings);
    }

    /**
     * Creates a OnPremisesConditionalAccessSettings with a new object
     *
     * @param newOnPremisesConditionalAccessSettings the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnPremisesConditionalAccessSettings> postAsync(@Nonnull final OnPremisesConditionalAccessSettings newOnPremisesConditionalAccessSettings) {
        return sendAsync(HttpMethod.POST, newOnPremisesConditionalAccessSettings);
    }

    /**
     * Creates a OnPremisesConditionalAccessSettings with a new object
     *
     * @param newOnPremisesConditionalAccessSettings the new object to create
     * @return the created OnPremisesConditionalAccessSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnPremisesConditionalAccessSettings post(@Nonnull final OnPremisesConditionalAccessSettings newOnPremisesConditionalAccessSettings) throws ClientException {
        return send(HttpMethod.POST, newOnPremisesConditionalAccessSettings);
    }

    /**
     * Creates a OnPremisesConditionalAccessSettings with a new object
     *
     * @param newOnPremisesConditionalAccessSettings the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnPremisesConditionalAccessSettings> putAsync(@Nonnull final OnPremisesConditionalAccessSettings newOnPremisesConditionalAccessSettings) {
        return sendAsync(HttpMethod.PUT, newOnPremisesConditionalAccessSettings);
    }

    /**
     * Creates a OnPremisesConditionalAccessSettings with a new object
     *
     * @param newOnPremisesConditionalAccessSettings the object to create/update
     * @return the created OnPremisesConditionalAccessSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnPremisesConditionalAccessSettings put(@Nonnull final OnPremisesConditionalAccessSettings newOnPremisesConditionalAccessSettings) throws ClientException {
        return send(HttpMethod.PUT, newOnPremisesConditionalAccessSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OnPremisesConditionalAccessSettingsRequest select(@Nonnull final String value) {
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
     public OnPremisesConditionalAccessSettingsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

