// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.AssignedLicense;
import com.microsoft.graph.models.ResourceSpecificPermissionGrant;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Request.
 */
public class GroupRequest extends BaseRequest<Group> {
	
    /**
     * The request for the Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Group.class);
    }

    /**
     * Gets the Group from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Group> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Group from the service
     *
     * @return the Group from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Group get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Group> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Group delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Group with a source
     *
     * @param sourceGroup the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Group> patchAsync(@Nonnull final Group sourceGroup) {
        return sendAsync(HttpMethod.PATCH, sourceGroup);
    }

    /**
     * Patches this Group with a source
     *
     * @param sourceGroup the source object with updates
     * @return the updated Group
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Group patch(@Nonnull final Group sourceGroup) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroup);
    }

    /**
     * Creates a Group with a new object
     *
     * @param newGroup the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Group> postAsync(@Nonnull final Group newGroup) {
        return sendAsync(HttpMethod.POST, newGroup);
    }

    /**
     * Creates a Group with a new object
     *
     * @param newGroup the new object to create
     * @return the created Group
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Group post(@Nonnull final Group newGroup) throws ClientException {
        return send(HttpMethod.POST, newGroup);
    }

    /**
     * Creates a Group with a new object
     *
     * @param newGroup the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Group> putAsync(@Nonnull final Group newGroup) {
        return sendAsync(HttpMethod.PUT, newGroup);
    }

    /**
     * Creates a Group with a new object
     *
     * @param newGroup the object to create/update
     * @return the created Group
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Group put(@Nonnull final Group newGroup) throws ClientException {
        return send(HttpMethod.PUT, newGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public GroupRequest select(@Nonnull final String value) {
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
     public GroupRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

