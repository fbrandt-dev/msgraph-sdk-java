// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.LearningProvider;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Learning Provider Request Builder.
 */
public class LearningProviderRequestBuilder extends BaseRequestBuilder<LearningProvider> {

    /**
     * The request builder for the LearningProvider
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LearningProviderRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the LearningProviderRequest instance
     */
    @Nonnull
    public LearningProviderRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the LearningProviderRequest instance
     */
    @Nonnull
    public LearningProviderRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.LearningProviderRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the LearningContent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.LearningContentCollectionRequestBuilder learningContents() {
        return new com.microsoft.graph.requests.LearningContentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("learningContents"), getClient(), null);
    }

    /**
     * Gets a request builder for the LearningContent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.LearningContentRequestBuilder learningContents(@Nonnull final String id) {
        return new com.microsoft.graph.requests.LearningContentRequestBuilder(getRequestUrlWithAdditionalSegment("learningContents") + "/" + id, getClient(), null);
    }
}
