// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.PlannerBucketTaskBoardTaskFormat;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Bucket Task Board Task Format Request.
 */
public class PlannerBucketTaskBoardTaskFormatRequest extends BaseRequest<PlannerBucketTaskBoardTaskFormat> {
	
    /**
     * The request for the PlannerBucketTaskBoardTaskFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerBucketTaskBoardTaskFormatRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerBucketTaskBoardTaskFormat.class);
    }

    /**
     * Gets the PlannerBucketTaskBoardTaskFormat from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerBucketTaskBoardTaskFormat> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PlannerBucketTaskBoardTaskFormat from the service
     *
     * @return the PlannerBucketTaskBoardTaskFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerBucketTaskBoardTaskFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerBucketTaskBoardTaskFormat> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PlannerBucketTaskBoardTaskFormat delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PlannerBucketTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerBucketTaskBoardTaskFormat the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerBucketTaskBoardTaskFormat> patchAsync(@Nonnull final PlannerBucketTaskBoardTaskFormat sourcePlannerBucketTaskBoardTaskFormat) {
        return sendAsync(HttpMethod.PATCH, sourcePlannerBucketTaskBoardTaskFormat);
    }

    /**
     * Patches this PlannerBucketTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerBucketTaskBoardTaskFormat the source object with updates
     * @return the updated PlannerBucketTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerBucketTaskBoardTaskFormat patch(@Nonnull final PlannerBucketTaskBoardTaskFormat sourcePlannerBucketTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerBucketTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerBucketTaskBoardTaskFormat with a new object
     *
     * @param newPlannerBucketTaskBoardTaskFormat the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerBucketTaskBoardTaskFormat> postAsync(@Nonnull final PlannerBucketTaskBoardTaskFormat newPlannerBucketTaskBoardTaskFormat) {
        return sendAsync(HttpMethod.POST, newPlannerBucketTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerBucketTaskBoardTaskFormat with a new object
     *
     * @param newPlannerBucketTaskBoardTaskFormat the new object to create
     * @return the created PlannerBucketTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerBucketTaskBoardTaskFormat post(@Nonnull final PlannerBucketTaskBoardTaskFormat newPlannerBucketTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.POST, newPlannerBucketTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerBucketTaskBoardTaskFormat with a new object
     *
     * @param newPlannerBucketTaskBoardTaskFormat the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerBucketTaskBoardTaskFormat> putAsync(@Nonnull final PlannerBucketTaskBoardTaskFormat newPlannerBucketTaskBoardTaskFormat) {
        return sendAsync(HttpMethod.PUT, newPlannerBucketTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerBucketTaskBoardTaskFormat with a new object
     *
     * @param newPlannerBucketTaskBoardTaskFormat the object to create/update
     * @return the created PlannerBucketTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerBucketTaskBoardTaskFormat put(@Nonnull final PlannerBucketTaskBoardTaskFormat newPlannerBucketTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.PUT, newPlannerBucketTaskBoardTaskFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PlannerBucketTaskBoardTaskFormatRequest select(@Nonnull final String value) {
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
     public PlannerBucketTaskBoardTaskFormatRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

