// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MultiValueLegacyExtendedProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Multi Value Legacy Extended Property Request.
 */
public class MultiValueLegacyExtendedPropertyRequest extends BaseRequest<MultiValueLegacyExtendedProperty> {
	
    /**
     * The request for the MultiValueLegacyExtendedProperty
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MultiValueLegacyExtendedPropertyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MultiValueLegacyExtendedProperty.class);
    }

    /**
     * Gets the MultiValueLegacyExtendedProperty from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MultiValueLegacyExtendedProperty> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the MultiValueLegacyExtendedProperty from the service
     *
     * @return the MultiValueLegacyExtendedProperty from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MultiValueLegacyExtendedProperty get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MultiValueLegacyExtendedProperty> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public MultiValueLegacyExtendedProperty delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this MultiValueLegacyExtendedProperty with a source
     *
     * @param sourceMultiValueLegacyExtendedProperty the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MultiValueLegacyExtendedProperty> patchAsync(@Nonnull final MultiValueLegacyExtendedProperty sourceMultiValueLegacyExtendedProperty) {
        return sendAsync(HttpMethod.PATCH, sourceMultiValueLegacyExtendedProperty);
    }

    /**
     * Patches this MultiValueLegacyExtendedProperty with a source
     *
     * @param sourceMultiValueLegacyExtendedProperty the source object with updates
     * @return the updated MultiValueLegacyExtendedProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MultiValueLegacyExtendedProperty patch(@Nonnull final MultiValueLegacyExtendedProperty sourceMultiValueLegacyExtendedProperty) throws ClientException {
        return send(HttpMethod.PATCH, sourceMultiValueLegacyExtendedProperty);
    }

    /**
     * Creates a MultiValueLegacyExtendedProperty with a new object
     *
     * @param newMultiValueLegacyExtendedProperty the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MultiValueLegacyExtendedProperty> postAsync(@Nonnull final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty) {
        return sendAsync(HttpMethod.POST, newMultiValueLegacyExtendedProperty);
    }

    /**
     * Creates a MultiValueLegacyExtendedProperty with a new object
     *
     * @param newMultiValueLegacyExtendedProperty the new object to create
     * @return the created MultiValueLegacyExtendedProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MultiValueLegacyExtendedProperty post(@Nonnull final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty) throws ClientException {
        return send(HttpMethod.POST, newMultiValueLegacyExtendedProperty);
    }

    /**
     * Creates a MultiValueLegacyExtendedProperty with a new object
     *
     * @param newMultiValueLegacyExtendedProperty the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MultiValueLegacyExtendedProperty> putAsync(@Nonnull final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty) {
        return sendAsync(HttpMethod.PUT, newMultiValueLegacyExtendedProperty);
    }

    /**
     * Creates a MultiValueLegacyExtendedProperty with a new object
     *
     * @param newMultiValueLegacyExtendedProperty the object to create/update
     * @return the created MultiValueLegacyExtendedProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MultiValueLegacyExtendedProperty put(@Nonnull final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty) throws ClientException {
        return send(HttpMethod.PUT, newMultiValueLegacyExtendedProperty);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MultiValueLegacyExtendedPropertyRequest select(@Nonnull final String value) {
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
     public MultiValueLegacyExtendedPropertyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

