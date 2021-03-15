// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Trending;
import com.microsoft.graph.requests.EntityWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trending Request Builder.
 */
public class TrendingRequestBuilder extends BaseRequestBuilder<Trending> {

    /**
     * The request builder for the Trending
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrendingRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TrendingRequest instance
     */
    @Nonnull
    public TrendingRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the TrendingRequest instance
     */
    @Nonnull
    public TrendingRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.TrendingRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Entity
     *
     * @return the EntityWithReferenceRequestBuilder instance
     */
    @Nonnull
    public EntityWithReferenceRequestBuilder resource() {
        return new EntityWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("resource"), getClient(), null);
    }
}
