// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.TeamsAppInstallation;
import com.microsoft.graph.requests.extensions.TeamsAppRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Installation Request.
 */
public class TeamsAppInstallationRequest extends BaseRequest<TeamsAppInstallation> {
	
    /**
     * The request for the TeamsAppInstallation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public TeamsAppInstallationRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends TeamsAppInstallation> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the TeamsAppInstallation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppInstallationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAppInstallation.class);
    }

    /**
     * Gets the TeamsAppInstallation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppInstallation> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TeamsAppInstallation from the service
     *
     * @return the TeamsAppInstallation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppInstallation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppInstallation> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TeamsAppInstallation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TeamsAppInstallation with a source
     *
     * @param sourceTeamsAppInstallation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppInstallation> patchAsync(@Nonnull final TeamsAppInstallation sourceTeamsAppInstallation) {
        return sendAsync(HttpMethod.PATCH, sourceTeamsAppInstallation);
    }

    /**
     * Patches this TeamsAppInstallation with a source
     *
     * @param sourceTeamsAppInstallation the source object with updates
     * @return the updated TeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppInstallation patch(@Nonnull final TeamsAppInstallation sourceTeamsAppInstallation) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsAppInstallation);
    }

    /**
     * Creates a TeamsAppInstallation with a new object
     *
     * @param newTeamsAppInstallation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppInstallation> postAsync(@Nonnull final TeamsAppInstallation newTeamsAppInstallation) {
        return sendAsync(HttpMethod.POST, newTeamsAppInstallation);
    }

    /**
     * Creates a TeamsAppInstallation with a new object
     *
     * @param newTeamsAppInstallation the new object to create
     * @return the created TeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppInstallation post(@Nonnull final TeamsAppInstallation newTeamsAppInstallation) throws ClientException {
        return send(HttpMethod.POST, newTeamsAppInstallation);
    }

    /**
     * Creates a TeamsAppInstallation with a new object
     *
     * @param newTeamsAppInstallation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppInstallation> putAsync(@Nonnull final TeamsAppInstallation newTeamsAppInstallation) {
        return sendAsync(HttpMethod.PUT, newTeamsAppInstallation);
    }

    /**
     * Creates a TeamsAppInstallation with a new object
     *
     * @param newTeamsAppInstallation the object to create/update
     * @return the created TeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppInstallation put(@Nonnull final TeamsAppInstallation newTeamsAppInstallation) throws ClientException {
        return send(HttpMethod.PUT, newTeamsAppInstallation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TeamsAppInstallationRequest select(@Nonnull final String value) {
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
     public TeamsAppInstallationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

