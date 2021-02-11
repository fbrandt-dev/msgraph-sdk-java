// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OutlookCategory;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook Category Request.
 */
public class OutlookCategoryRequest extends BaseRequest<OutlookCategory> {
	
    /**
     * The request for the OutlookCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookCategoryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OutlookCategory.class);
    }

    /**
     * Gets the OutlookCategory from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutlookCategory> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OutlookCategory from the service
     *
     * @return the OutlookCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutlookCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutlookCategory> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OutlookCategory delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OutlookCategory with a source
     *
     * @param sourceOutlookCategory the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutlookCategory> patchAsync(@Nonnull final OutlookCategory sourceOutlookCategory) {
        return sendAsync(HttpMethod.PATCH, sourceOutlookCategory);
    }

    /**
     * Patches this OutlookCategory with a source
     *
     * @param sourceOutlookCategory the source object with updates
     * @return the updated OutlookCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutlookCategory patch(@Nonnull final OutlookCategory sourceOutlookCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceOutlookCategory);
    }

    /**
     * Creates a OutlookCategory with a new object
     *
     * @param newOutlookCategory the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutlookCategory> postAsync(@Nonnull final OutlookCategory newOutlookCategory) {
        return sendAsync(HttpMethod.POST, newOutlookCategory);
    }

    /**
     * Creates a OutlookCategory with a new object
     *
     * @param newOutlookCategory the new object to create
     * @return the created OutlookCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutlookCategory post(@Nonnull final OutlookCategory newOutlookCategory) throws ClientException {
        return send(HttpMethod.POST, newOutlookCategory);
    }

    /**
     * Creates a OutlookCategory with a new object
     *
     * @param newOutlookCategory the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutlookCategory> putAsync(@Nonnull final OutlookCategory newOutlookCategory) {
        return sendAsync(HttpMethod.PUT, newOutlookCategory);
    }

    /**
     * Creates a OutlookCategory with a new object
     *
     * @param newOutlookCategory the object to create/update
     * @return the created OutlookCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutlookCategory put(@Nonnull final OutlookCategory newOutlookCategory) throws ClientException {
        return send(HttpMethod.PUT, newOutlookCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OutlookCategoryRequest select(@Nonnull final String value) {
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
     public OutlookCategoryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

