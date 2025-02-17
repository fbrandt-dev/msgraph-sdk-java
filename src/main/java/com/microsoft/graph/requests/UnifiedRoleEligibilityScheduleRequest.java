// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRoleEligibilitySchedule;
import com.microsoft.graph.models.RoleEligibilityScheduleFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Schedule Request.
 */
public class UnifiedRoleEligibilityScheduleRequest extends BaseRequest<UnifiedRoleEligibilitySchedule> {
	
    /**
     * The request for the UnifiedRoleEligibilitySchedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleEligibilityScheduleRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleEligibilitySchedule.class);
    }

    /**
     * Gets the UnifiedRoleEligibilitySchedule from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilitySchedule> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UnifiedRoleEligibilitySchedule from the service
     *
     * @return the UnifiedRoleEligibilitySchedule from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleEligibilitySchedule get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilitySchedule> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UnifiedRoleEligibilitySchedule delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UnifiedRoleEligibilitySchedule with a source
     *
     * @param sourceUnifiedRoleEligibilitySchedule the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilitySchedule> patchAsync(@Nonnull final UnifiedRoleEligibilitySchedule sourceUnifiedRoleEligibilitySchedule) {
        return sendAsync(HttpMethod.PATCH, sourceUnifiedRoleEligibilitySchedule);
    }

    /**
     * Patches this UnifiedRoleEligibilitySchedule with a source
     *
     * @param sourceUnifiedRoleEligibilitySchedule the source object with updates
     * @return the updated UnifiedRoleEligibilitySchedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleEligibilitySchedule patch(@Nonnull final UnifiedRoleEligibilitySchedule sourceUnifiedRoleEligibilitySchedule) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleEligibilitySchedule);
    }

    /**
     * Creates a UnifiedRoleEligibilitySchedule with a new object
     *
     * @param newUnifiedRoleEligibilitySchedule the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilitySchedule> postAsync(@Nonnull final UnifiedRoleEligibilitySchedule newUnifiedRoleEligibilitySchedule) {
        return sendAsync(HttpMethod.POST, newUnifiedRoleEligibilitySchedule);
    }

    /**
     * Creates a UnifiedRoleEligibilitySchedule with a new object
     *
     * @param newUnifiedRoleEligibilitySchedule the new object to create
     * @return the created UnifiedRoleEligibilitySchedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleEligibilitySchedule post(@Nonnull final UnifiedRoleEligibilitySchedule newUnifiedRoleEligibilitySchedule) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleEligibilitySchedule);
    }

    /**
     * Creates a UnifiedRoleEligibilitySchedule with a new object
     *
     * @param newUnifiedRoleEligibilitySchedule the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilitySchedule> putAsync(@Nonnull final UnifiedRoleEligibilitySchedule newUnifiedRoleEligibilitySchedule) {
        return sendAsync(HttpMethod.PUT, newUnifiedRoleEligibilitySchedule);
    }

    /**
     * Creates a UnifiedRoleEligibilitySchedule with a new object
     *
     * @param newUnifiedRoleEligibilitySchedule the object to create/update
     * @return the created UnifiedRoleEligibilitySchedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleEligibilitySchedule put(@Nonnull final UnifiedRoleEligibilitySchedule newUnifiedRoleEligibilitySchedule) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleEligibilitySchedule);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UnifiedRoleEligibilityScheduleRequest select(@Nonnull final String value) {
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
     public UnifiedRoleEligibilityScheduleRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

