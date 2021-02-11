// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserActivity;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.UserActivityRecentCollectionRequestBuilder;
import com.microsoft.graph.requests.UserActivityRecentCollectionRequest;
import com.microsoft.graph.requests.UserActivityRecentCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Activity Recent Collection Request Builder.
 */
public class UserActivityRecentCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<UserActivity, UserActivityRecentCollectionRequestBuilder, UserActivityRecentCollectionResponse, UserActivityRecentCollectionPage, UserActivityRecentCollectionRequest> {

    /**
     * The request builder for this collection of UserActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserActivityRecentCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserActivityRecentCollectionRequestBuilder.class, UserActivityRecentCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserActivityRecentCollectionRequest instance
     */
    @Override
    @Nonnull
    public UserActivityRecentCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UserActivityRecentCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
