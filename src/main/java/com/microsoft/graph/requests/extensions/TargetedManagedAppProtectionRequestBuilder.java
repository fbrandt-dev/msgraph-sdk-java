// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.TargetedManagedAppProtection;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.TargetedManagedAppProtectionAssignParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Protection Request Builder.
 */
public class TargetedManagedAppProtectionRequestBuilder extends BaseRequestBuilder<TargetedManagedAppProtection> {

    /**
     * The request builder for the TargetedManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TargetedManagedAppProtectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TargetedManagedAppProtectionRequest instance
     */
    @Nonnull
    public TargetedManagedAppProtectionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the TargetedManagedAppProtectionRequest instance
     */
    @Nonnull
    public TargetedManagedAppProtectionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.TargetedManagedAppProtectionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the TargetedManagedAppPolicyAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TargetedManagedAppPolicyAssignmentCollectionRequestBuilder assignments() {
        return new TargetedManagedAppPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the TargetedManagedAppPolicyAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TargetedManagedAppPolicyAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new TargetedManagedAppPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public TargetedManagedAppProtectionAssignRequestBuilder assign(@Nonnull final TargetedManagedAppProtectionAssignParameterSet parameters) {
        return new TargetedManagedAppProtectionAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }
}
