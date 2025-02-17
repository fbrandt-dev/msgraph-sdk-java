// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageAssignmentPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Policy Request Builder.
 */
public class AccessPackageAssignmentPolicyRequestBuilder extends BaseRequestBuilder<AccessPackageAssignmentPolicy> {

    /**
     * The request builder for the AccessPackageAssignmentPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentPolicyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AccessPackageAssignmentPolicyRequest instance
     */
    @Nonnull
    public AccessPackageAssignmentPolicyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AccessPackageAssignmentPolicyRequest instance
     */
    @Nonnull
    public AccessPackageAssignmentPolicyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AccessPackageAssignmentPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for AccessPackage
     *
     * @return the AccessPackageWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessPackageWithReferenceRequestBuilder accessPackage() {
        return new com.microsoft.graph.requests.AccessPackageWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackage"), getClient(), null);
    }

    /**
     * Gets the request builder for AccessPackageCatalog
     *
     * @return the AccessPackageCatalogWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessPackageCatalogWithReferenceRequestBuilder catalog() {
        return new com.microsoft.graph.requests.AccessPackageCatalogWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("catalog"), getClient(), null);
    }
    /**
     *  Gets a request builder for the AccessPackageQuestion collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessPackageQuestionCollectionRequestBuilder questions() {
        return new com.microsoft.graph.requests.AccessPackageQuestionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("questions"), getClient(), null);
    }

    /**
     * Gets a request builder for the AccessPackageQuestion item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessPackageQuestionRequestBuilder questions(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AccessPackageQuestionRequestBuilder(getRequestUrlWithAdditionalSegment("questions") + "/" + id, getClient(), null);
    }
}
