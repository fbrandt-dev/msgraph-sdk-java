// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Site;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.SiteAddCollectionRequestBuilder;
import com.microsoft.graph.requests.SiteAddCollectionRequest;
import com.microsoft.graph.requests.SiteAddCollectionResponse;
import com.microsoft.graph.models.SiteAddParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Add Collection Request Builder.
 */
public class SiteAddCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<Site, SiteAddCollectionRequestBuilder, SiteAddCollectionResponse, SiteAddCollectionPage, SiteAddCollectionRequest> {

    /**
     * The request builder for this collection of Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteAddCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SiteAddCollectionRequestBuilder.class, SiteAddCollectionRequest.class);
    }
    private SiteAddParameterSet body;
    /**
     * The request builder for this collection of Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public SiteAddCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final SiteAddParameterSet parameters) {
        super(requestUrl, client, requestOptions, SiteAddCollectionRequestBuilder.class, SiteAddCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SiteAddCollectionRequest instance
     */
    @Override
    @Nonnull
    public SiteAddCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SiteAddCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
