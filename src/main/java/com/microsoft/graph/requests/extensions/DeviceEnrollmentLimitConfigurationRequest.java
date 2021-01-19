// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.DeviceEnrollmentLimitConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Limit Configuration Request.
 */
public class DeviceEnrollmentLimitConfigurationRequest extends BaseRequest<DeviceEnrollmentLimitConfiguration> {
	
    /**
     * The request for the DeviceEnrollmentLimitConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceEnrollmentLimitConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceEnrollmentLimitConfiguration.class);
    }

    /**
     * Gets the DeviceEnrollmentLimitConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentLimitConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceEnrollmentLimitConfiguration from the service
     *
     * @return the DeviceEnrollmentLimitConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentLimitConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentLimitConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceEnrollmentLimitConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceEnrollmentLimitConfiguration with a source
     *
     * @param sourceDeviceEnrollmentLimitConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentLimitConfiguration> patchAsync(@Nonnull final DeviceEnrollmentLimitConfiguration sourceDeviceEnrollmentLimitConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceEnrollmentLimitConfiguration);
    }

    /**
     * Patches this DeviceEnrollmentLimitConfiguration with a source
     *
     * @param sourceDeviceEnrollmentLimitConfiguration the source object with updates
     * @return the updated DeviceEnrollmentLimitConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentLimitConfiguration patch(@Nonnull final DeviceEnrollmentLimitConfiguration sourceDeviceEnrollmentLimitConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceEnrollmentLimitConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentLimitConfiguration with a new object
     *
     * @param newDeviceEnrollmentLimitConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentLimitConfiguration> postAsync(@Nonnull final DeviceEnrollmentLimitConfiguration newDeviceEnrollmentLimitConfiguration) {
        return sendAsync(HttpMethod.POST, newDeviceEnrollmentLimitConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentLimitConfiguration with a new object
     *
     * @param newDeviceEnrollmentLimitConfiguration the new object to create
     * @return the created DeviceEnrollmentLimitConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentLimitConfiguration post(@Nonnull final DeviceEnrollmentLimitConfiguration newDeviceEnrollmentLimitConfiguration) throws ClientException {
        return send(HttpMethod.POST, newDeviceEnrollmentLimitConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentLimitConfiguration with a new object
     *
     * @param newDeviceEnrollmentLimitConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentLimitConfiguration> putAsync(@Nonnull final DeviceEnrollmentLimitConfiguration newDeviceEnrollmentLimitConfiguration) {
        return sendAsync(HttpMethod.PUT, newDeviceEnrollmentLimitConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentLimitConfiguration with a new object
     *
     * @param newDeviceEnrollmentLimitConfiguration the object to create/update
     * @return the created DeviceEnrollmentLimitConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentLimitConfiguration put(@Nonnull final DeviceEnrollmentLimitConfiguration newDeviceEnrollmentLimitConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newDeviceEnrollmentLimitConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceEnrollmentLimitConfigurationRequest select(@Nonnull final String value) {
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
     public DeviceEnrollmentLimitConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

