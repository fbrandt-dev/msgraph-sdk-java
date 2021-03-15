// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AgreementAcceptance;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.AgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.AgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.AgreementAcceptanceCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement Acceptance Collection Request Builder.
 */
public class AgreementAcceptanceCollectionRequestBuilder extends BaseCollectionRequestBuilder<AgreementAcceptance, AgreementAcceptanceRequestBuilder, AgreementAcceptanceCollectionResponse, AgreementAcceptanceCollectionPage, AgreementAcceptanceCollectionRequest> {

    /**
     * The request builder for this collection of AgreementAcceptance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AgreementAcceptanceCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AgreementAcceptanceRequestBuilder.class, AgreementAcceptanceCollectionRequest.class);
    }



    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
