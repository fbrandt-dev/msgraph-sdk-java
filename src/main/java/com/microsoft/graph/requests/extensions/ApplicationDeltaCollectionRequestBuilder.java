// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.Application;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ApplicationDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.ApplicationDeltaCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Delta Collection Request Builder.
 */
public class ApplicationDeltaCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<Application, ApplicationDeltaCollectionRequestBuilder, ApplicationDeltaCollectionResponse, ApplicationDeltaCollectionPage, ApplicationDeltaCollectionRequest> {

    /**
     * The request builder for this collection of Application
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApplicationDeltaCollectionRequestBuilder.class, ApplicationDeltaCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ApplicationDeltaCollectionRequest instance
     */
    @Override
    @Nonnull
    public ApplicationDeltaCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ApplicationDeltaCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
