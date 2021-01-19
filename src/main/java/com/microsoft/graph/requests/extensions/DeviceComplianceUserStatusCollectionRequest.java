// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.DeviceComplianceUserStatus;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance User Status Collection Request.
 */
public class DeviceComplianceUserStatusCollectionRequest extends BaseEntityCollectionRequest<DeviceComplianceUserStatus, DeviceComplianceUserStatusCollectionResponse, DeviceComplianceUserStatusCollectionPage> {

    /**
     * The request builder for this collection of DeviceComplianceUserStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceUserStatusCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceUserStatusCollectionResponse.class, DeviceComplianceUserStatusCollectionPage.class, DeviceComplianceUserStatusCollectionRequestBuilder.class);
    }

    /**
     * Creates a new DeviceComplianceUserStatus
     * @param newDeviceComplianceUserStatus the DeviceComplianceUserStatus to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceUserStatus> postAsync(@Nonnull final DeviceComplianceUserStatus newDeviceComplianceUserStatus) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceComplianceUserStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newDeviceComplianceUserStatus);
    }

    /**
     * Creates a new DeviceComplianceUserStatus
     * @param newDeviceComplianceUserStatus the DeviceComplianceUserStatus to create
     * @return the newly created object
     */
    @Nonnull
    public DeviceComplianceUserStatus post(@Nonnull final DeviceComplianceUserStatus newDeviceComplianceUserStatus) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceComplianceUserStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceComplianceUserStatus);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceUserStatusCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceUserStatusCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceUserStatusCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceUserStatusCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceUserStatusCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceUserStatusCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceUserStatusCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceUserStatusCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceUserStatusCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

