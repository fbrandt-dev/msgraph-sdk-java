// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceComplianceUserOverview;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance User Overview Request.
 */
public class DeviceComplianceUserOverviewRequest extends BaseRequest<DeviceComplianceUserOverview> {
	
    /**
     * The request for the DeviceComplianceUserOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceUserOverviewRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceUserOverview.class);
    }

    /**
     * Gets the DeviceComplianceUserOverview from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceUserOverview> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceComplianceUserOverview from the service
     *
     * @return the DeviceComplianceUserOverview from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceUserOverview get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceUserOverview> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceComplianceUserOverview delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceComplianceUserOverview with a source
     *
     * @param sourceDeviceComplianceUserOverview the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceUserOverview> patchAsync(@Nonnull final DeviceComplianceUserOverview sourceDeviceComplianceUserOverview) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceComplianceUserOverview);
    }

    /**
     * Patches this DeviceComplianceUserOverview with a source
     *
     * @param sourceDeviceComplianceUserOverview the source object with updates
     * @return the updated DeviceComplianceUserOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceUserOverview patch(@Nonnull final DeviceComplianceUserOverview sourceDeviceComplianceUserOverview) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceComplianceUserOverview);
    }

    /**
     * Creates a DeviceComplianceUserOverview with a new object
     *
     * @param newDeviceComplianceUserOverview the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceUserOverview> postAsync(@Nonnull final DeviceComplianceUserOverview newDeviceComplianceUserOverview) {
        return sendAsync(HttpMethod.POST, newDeviceComplianceUserOverview);
    }

    /**
     * Creates a DeviceComplianceUserOverview with a new object
     *
     * @param newDeviceComplianceUserOverview the new object to create
     * @return the created DeviceComplianceUserOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceUserOverview post(@Nonnull final DeviceComplianceUserOverview newDeviceComplianceUserOverview) throws ClientException {
        return send(HttpMethod.POST, newDeviceComplianceUserOverview);
    }

    /**
     * Creates a DeviceComplianceUserOverview with a new object
     *
     * @param newDeviceComplianceUserOverview the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceUserOverview> putAsync(@Nonnull final DeviceComplianceUserOverview newDeviceComplianceUserOverview) {
        return sendAsync(HttpMethod.PUT, newDeviceComplianceUserOverview);
    }

    /**
     * Creates a DeviceComplianceUserOverview with a new object
     *
     * @param newDeviceComplianceUserOverview the object to create/update
     * @return the created DeviceComplianceUserOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceUserOverview put(@Nonnull final DeviceComplianceUserOverview newDeviceComplianceUserOverview) throws ClientException {
        return send(HttpMethod.PUT, newDeviceComplianceUserOverview);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceComplianceUserOverviewRequest select(@Nonnull final String value) {
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
     public DeviceComplianceUserOverviewRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

