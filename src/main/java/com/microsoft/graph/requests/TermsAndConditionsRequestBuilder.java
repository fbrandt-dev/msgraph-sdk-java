// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TermsAndConditions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Request Builder.
 */
public class TermsAndConditionsRequestBuilder extends BaseRequestBuilder<TermsAndConditions> {

    /**
     * The request builder for the TermsAndConditions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermsAndConditionsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TermsAndConditionsRequest instance
     */
    @Nonnull
    public TermsAndConditionsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the TermsAndConditionsRequest instance
     */
    @Nonnull
    public TermsAndConditionsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.TermsAndConditionsRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the TermsAndConditionsAcceptanceStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.TermsAndConditionsAcceptanceStatusCollectionRequestBuilder acceptanceStatuses() {
        return new com.microsoft.graph.requests.TermsAndConditionsAcceptanceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("acceptanceStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the TermsAndConditionsAcceptanceStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.TermsAndConditionsAcceptanceStatusRequestBuilder acceptanceStatuses(@Nonnull final String id) {
        return new com.microsoft.graph.requests.TermsAndConditionsAcceptanceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("acceptanceStatuses") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TermsAndConditionsAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.TermsAndConditionsAssignmentCollectionRequestBuilder assignments() {
        return new com.microsoft.graph.requests.TermsAndConditionsAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the TermsAndConditionsAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.TermsAndConditionsAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new com.microsoft.graph.requests.TermsAndConditionsAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
}
