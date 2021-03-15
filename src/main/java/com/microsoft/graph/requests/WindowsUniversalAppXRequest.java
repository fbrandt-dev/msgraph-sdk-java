// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsUniversalAppX;
import com.microsoft.graph.models.MobileAppAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Universal App XRequest.
 */
public class WindowsUniversalAppXRequest extends BaseRequest<WindowsUniversalAppX> {
	
    /**
     * The request for the WindowsUniversalAppX
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsUniversalAppXRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsUniversalAppX.class);
    }

    /**
     * Gets the WindowsUniversalAppX from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsUniversalAppX> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WindowsUniversalAppX from the service
     *
     * @return the WindowsUniversalAppX from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsUniversalAppX get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsUniversalAppX> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WindowsUniversalAppX delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsUniversalAppX with a source
     *
     * @param sourceWindowsUniversalAppX the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsUniversalAppX> patchAsync(@Nonnull final WindowsUniversalAppX sourceWindowsUniversalAppX) {
        return sendAsync(HttpMethod.PATCH, sourceWindowsUniversalAppX);
    }

    /**
     * Patches this WindowsUniversalAppX with a source
     *
     * @param sourceWindowsUniversalAppX the source object with updates
     * @return the updated WindowsUniversalAppX
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsUniversalAppX patch(@Nonnull final WindowsUniversalAppX sourceWindowsUniversalAppX) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsUniversalAppX);
    }

    /**
     * Creates a WindowsUniversalAppX with a new object
     *
     * @param newWindowsUniversalAppX the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsUniversalAppX> postAsync(@Nonnull final WindowsUniversalAppX newWindowsUniversalAppX) {
        return sendAsync(HttpMethod.POST, newWindowsUniversalAppX);
    }

    /**
     * Creates a WindowsUniversalAppX with a new object
     *
     * @param newWindowsUniversalAppX the new object to create
     * @return the created WindowsUniversalAppX
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsUniversalAppX post(@Nonnull final WindowsUniversalAppX newWindowsUniversalAppX) throws ClientException {
        return send(HttpMethod.POST, newWindowsUniversalAppX);
    }

    /**
     * Creates a WindowsUniversalAppX with a new object
     *
     * @param newWindowsUniversalAppX the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsUniversalAppX> putAsync(@Nonnull final WindowsUniversalAppX newWindowsUniversalAppX) {
        return sendAsync(HttpMethod.PUT, newWindowsUniversalAppX);
    }

    /**
     * Creates a WindowsUniversalAppX with a new object
     *
     * @param newWindowsUniversalAppX the object to create/update
     * @return the created WindowsUniversalAppX
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsUniversalAppX put(@Nonnull final WindowsUniversalAppX newWindowsUniversalAppX) throws ClientException {
        return send(HttpMethod.PUT, newWindowsUniversalAppX);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsUniversalAppXRequest select(@Nonnull final String value) {
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
     public WindowsUniversalAppXRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

