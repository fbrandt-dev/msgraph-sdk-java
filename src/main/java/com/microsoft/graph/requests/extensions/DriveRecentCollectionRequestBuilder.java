// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.DriveItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.DriveRecentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRecentCollectionRequest;
import com.microsoft.graph.requests.extensions.DriveRecentCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Recent Collection Request Builder.
 */
public class DriveRecentCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<DriveItem, DriveRecentCollectionRequestBuilder, DriveRecentCollectionResponse, DriveRecentCollectionPage, DriveRecentCollectionRequest> {

    /**
     * The request builder for this collection of Drive
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveRecentCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DriveRecentCollectionRequestBuilder.class, DriveRecentCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DriveRecentCollectionRequest instance
     */
    @Override
    @Nonnull
    public DriveRecentCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DriveRecentCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
