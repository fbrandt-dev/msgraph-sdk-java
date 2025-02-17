// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ListItemVersionRestoreVersionRequest;
import com.microsoft.graph.models.ListItemVersion;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Version Restore Version Request Builder.
 */
public class ListItemVersionRestoreVersionRequestBuilder extends BaseActionRequestBuilder<ListItemVersion> {

    /**
     * The request builder for this ListItemVersionRestoreVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListItemVersionRestoreVersionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ListItemVersionRestoreVersionRequest
     *
     * @param requestOptions the options for the request
     * @return the ListItemVersionRestoreVersionRequest instance
     */
    @Nonnull
    public ListItemVersionRestoreVersionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ListItemVersionRestoreVersionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ListItemVersionRestoreVersionRequest instance
     */
    @Nonnull
    public ListItemVersionRestoreVersionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ListItemVersionRestoreVersionRequest request = new ListItemVersionRestoreVersionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
