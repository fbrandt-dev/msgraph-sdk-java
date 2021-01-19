// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.MobileAppContent;
import com.microsoft.graph.requests.extensions.MobileAppContentFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content Request.
 */
public class MobileAppContentRequest extends BaseRequest<MobileAppContent> {
	
    /**
     * The request for the MobileAppContent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppContentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppContent.class);
    }

    /**
     * Gets the MobileAppContent from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppContent> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the MobileAppContent from the service
     *
     * @return the MobileAppContent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppContent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppContent> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public MobileAppContent delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this MobileAppContent with a source
     *
     * @param sourceMobileAppContent the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppContent> patchAsync(@Nonnull final MobileAppContent sourceMobileAppContent) {
        return sendAsync(HttpMethod.PATCH, sourceMobileAppContent);
    }

    /**
     * Patches this MobileAppContent with a source
     *
     * @param sourceMobileAppContent the source object with updates
     * @return the updated MobileAppContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppContent patch(@Nonnull final MobileAppContent sourceMobileAppContent) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppContent);
    }

    /**
     * Creates a MobileAppContent with a new object
     *
     * @param newMobileAppContent the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppContent> postAsync(@Nonnull final MobileAppContent newMobileAppContent) {
        return sendAsync(HttpMethod.POST, newMobileAppContent);
    }

    /**
     * Creates a MobileAppContent with a new object
     *
     * @param newMobileAppContent the new object to create
     * @return the created MobileAppContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppContent post(@Nonnull final MobileAppContent newMobileAppContent) throws ClientException {
        return send(HttpMethod.POST, newMobileAppContent);
    }

    /**
     * Creates a MobileAppContent with a new object
     *
     * @param newMobileAppContent the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppContent> putAsync(@Nonnull final MobileAppContent newMobileAppContent) {
        return sendAsync(HttpMethod.PUT, newMobileAppContent);
    }

    /**
     * Creates a MobileAppContent with a new object
     *
     * @param newMobileAppContent the object to create/update
     * @return the created MobileAppContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppContent put(@Nonnull final MobileAppContent newMobileAppContent) throws ClientException {
        return send(HttpMethod.PUT, newMobileAppContent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MobileAppContentRequest select(@Nonnull final String value) {
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
     public MobileAppContentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

