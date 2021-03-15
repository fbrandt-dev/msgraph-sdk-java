// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.TokenIssuancePolicy;
import com.microsoft.graph.requests.TokenIssuancePolicyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.TokenIssuancePolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Issuance Policy Collection Page.
 */
public class TokenIssuancePolicyCollectionPage extends BaseCollectionPage<TokenIssuancePolicy, TokenIssuancePolicyCollectionRequestBuilder> {

    /**
     * A collection page for TokenIssuancePolicy
     *
     * @param response the serialized TokenIssuancePolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TokenIssuancePolicyCollectionPage(@Nonnull final TokenIssuancePolicyCollectionResponse response, @Nonnull final TokenIssuancePolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for TokenIssuancePolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TokenIssuancePolicyCollectionPage(@Nonnull final java.util.List<TokenIssuancePolicy> pageContents, @Nullable final TokenIssuancePolicyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
