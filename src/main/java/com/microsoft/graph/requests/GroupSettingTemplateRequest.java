// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.GroupSettingTemplate;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Setting Template Request.
 */
public class GroupSettingTemplateRequest extends BaseRequest<GroupSettingTemplate> {
	
    /**
     * The request for the GroupSettingTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupSettingTemplateRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupSettingTemplate.class);
    }

    /**
     * Gets the GroupSettingTemplate from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupSettingTemplate> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the GroupSettingTemplate from the service
     *
     * @return the GroupSettingTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupSettingTemplate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupSettingTemplate> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public GroupSettingTemplate delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this GroupSettingTemplate with a source
     *
     * @param sourceGroupSettingTemplate the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupSettingTemplate> patchAsync(@Nonnull final GroupSettingTemplate sourceGroupSettingTemplate) {
        return sendAsync(HttpMethod.PATCH, sourceGroupSettingTemplate);
    }

    /**
     * Patches this GroupSettingTemplate with a source
     *
     * @param sourceGroupSettingTemplate the source object with updates
     * @return the updated GroupSettingTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupSettingTemplate patch(@Nonnull final GroupSettingTemplate sourceGroupSettingTemplate) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupSettingTemplate);
    }

    /**
     * Creates a GroupSettingTemplate with a new object
     *
     * @param newGroupSettingTemplate the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupSettingTemplate> postAsync(@Nonnull final GroupSettingTemplate newGroupSettingTemplate) {
        return sendAsync(HttpMethod.POST, newGroupSettingTemplate);
    }

    /**
     * Creates a GroupSettingTemplate with a new object
     *
     * @param newGroupSettingTemplate the new object to create
     * @return the created GroupSettingTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupSettingTemplate post(@Nonnull final GroupSettingTemplate newGroupSettingTemplate) throws ClientException {
        return send(HttpMethod.POST, newGroupSettingTemplate);
    }

    /**
     * Creates a GroupSettingTemplate with a new object
     *
     * @param newGroupSettingTemplate the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupSettingTemplate> putAsync(@Nonnull final GroupSettingTemplate newGroupSettingTemplate) {
        return sendAsync(HttpMethod.PUT, newGroupSettingTemplate);
    }

    /**
     * Creates a GroupSettingTemplate with a new object
     *
     * @param newGroupSettingTemplate the object to create/update
     * @return the created GroupSettingTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupSettingTemplate put(@Nonnull final GroupSettingTemplate newGroupSettingTemplate) throws ClientException {
        return send(HttpMethod.PUT, newGroupSettingTemplate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public GroupSettingTemplateRequest select(@Nonnull final String value) {
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
     public GroupSettingTemplateRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

