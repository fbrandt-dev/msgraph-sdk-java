// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.UserInstallStateSummary;
import com.microsoft.graph.requests.extensions.DeviceInstallStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceInstallStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Install State Summary Request.
 */
public class UserInstallStateSummaryRequest extends BaseRequest<UserInstallStateSummary> {
	
    /**
     * The request for the UserInstallStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserInstallStateSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserInstallStateSummary.class);
    }

    /**
     * Gets the UserInstallStateSummary from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserInstallStateSummary> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserInstallStateSummary from the service
     *
     * @return the UserInstallStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserInstallStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserInstallStateSummary> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UserInstallStateSummary delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserInstallStateSummary with a source
     *
     * @param sourceUserInstallStateSummary the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserInstallStateSummary> patchAsync(@Nonnull final UserInstallStateSummary sourceUserInstallStateSummary) {
        return sendAsync(HttpMethod.PATCH, sourceUserInstallStateSummary);
    }

    /**
     * Patches this UserInstallStateSummary with a source
     *
     * @param sourceUserInstallStateSummary the source object with updates
     * @return the updated UserInstallStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserInstallStateSummary patch(@Nonnull final UserInstallStateSummary sourceUserInstallStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserInstallStateSummary);
    }

    /**
     * Creates a UserInstallStateSummary with a new object
     *
     * @param newUserInstallStateSummary the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserInstallStateSummary> postAsync(@Nonnull final UserInstallStateSummary newUserInstallStateSummary) {
        return sendAsync(HttpMethod.POST, newUserInstallStateSummary);
    }

    /**
     * Creates a UserInstallStateSummary with a new object
     *
     * @param newUserInstallStateSummary the new object to create
     * @return the created UserInstallStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserInstallStateSummary post(@Nonnull final UserInstallStateSummary newUserInstallStateSummary) throws ClientException {
        return send(HttpMethod.POST, newUserInstallStateSummary);
    }

    /**
     * Creates a UserInstallStateSummary with a new object
     *
     * @param newUserInstallStateSummary the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserInstallStateSummary> putAsync(@Nonnull final UserInstallStateSummary newUserInstallStateSummary) {
        return sendAsync(HttpMethod.PUT, newUserInstallStateSummary);
    }

    /**
     * Creates a UserInstallStateSummary with a new object
     *
     * @param newUserInstallStateSummary the object to create/update
     * @return the created UserInstallStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserInstallStateSummary put(@Nonnull final UserInstallStateSummary newUserInstallStateSummary) throws ClientException {
        return send(HttpMethod.PUT, newUserInstallStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserInstallStateSummaryRequest select(@Nonnull final String value) {
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
     public UserInstallStateSummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

