// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsPhone81CompliancePolicy;
import com.microsoft.graph.models.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.models.DeviceComplianceScheduledActionForRule;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81Compliance Policy Request.
 */
public class WindowsPhone81CompliancePolicyRequest extends BaseRequest<WindowsPhone81CompliancePolicy> {
	
    /**
     * The request for the WindowsPhone81CompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81CompliancePolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhone81CompliancePolicy.class);
    }

    /**
     * Gets the WindowsPhone81CompliancePolicy from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsPhone81CompliancePolicy> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WindowsPhone81CompliancePolicy from the service
     *
     * @return the WindowsPhone81CompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsPhone81CompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsPhone81CompliancePolicy> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WindowsPhone81CompliancePolicy delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsPhone81CompliancePolicy with a source
     *
     * @param sourceWindowsPhone81CompliancePolicy the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsPhone81CompliancePolicy> patchAsync(@Nonnull final WindowsPhone81CompliancePolicy sourceWindowsPhone81CompliancePolicy) {
        return sendAsync(HttpMethod.PATCH, sourceWindowsPhone81CompliancePolicy);
    }

    /**
     * Patches this WindowsPhone81CompliancePolicy with a source
     *
     * @param sourceWindowsPhone81CompliancePolicy the source object with updates
     * @return the updated WindowsPhone81CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsPhone81CompliancePolicy patch(@Nonnull final WindowsPhone81CompliancePolicy sourceWindowsPhone81CompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsPhone81CompliancePolicy);
    }

    /**
     * Creates a WindowsPhone81CompliancePolicy with a new object
     *
     * @param newWindowsPhone81CompliancePolicy the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsPhone81CompliancePolicy> postAsync(@Nonnull final WindowsPhone81CompliancePolicy newWindowsPhone81CompliancePolicy) {
        return sendAsync(HttpMethod.POST, newWindowsPhone81CompliancePolicy);
    }

    /**
     * Creates a WindowsPhone81CompliancePolicy with a new object
     *
     * @param newWindowsPhone81CompliancePolicy the new object to create
     * @return the created WindowsPhone81CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsPhone81CompliancePolicy post(@Nonnull final WindowsPhone81CompliancePolicy newWindowsPhone81CompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newWindowsPhone81CompliancePolicy);
    }

    /**
     * Creates a WindowsPhone81CompliancePolicy with a new object
     *
     * @param newWindowsPhone81CompliancePolicy the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsPhone81CompliancePolicy> putAsync(@Nonnull final WindowsPhone81CompliancePolicy newWindowsPhone81CompliancePolicy) {
        return sendAsync(HttpMethod.PUT, newWindowsPhone81CompliancePolicy);
    }

    /**
     * Creates a WindowsPhone81CompliancePolicy with a new object
     *
     * @param newWindowsPhone81CompliancePolicy the object to create/update
     * @return the created WindowsPhone81CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsPhone81CompliancePolicy put(@Nonnull final WindowsPhone81CompliancePolicy newWindowsPhone81CompliancePolicy) throws ClientException {
        return send(HttpMethod.PUT, newWindowsPhone81CompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsPhone81CompliancePolicyRequest select(@Nonnull final String value) {
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
     public WindowsPhone81CompliancePolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

