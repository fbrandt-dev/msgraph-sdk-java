// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ChannelGetAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.requests.ChannelGetAllMessagesCollectionRequest;
import com.microsoft.graph.requests.ChannelGetAllMessagesCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel Get All Messages Collection Request Builder.
 */
public class ChannelGetAllMessagesCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<ChatMessage, ChannelGetAllMessagesCollectionRequestBuilder, ChannelGetAllMessagesCollectionResponse, ChannelGetAllMessagesCollectionPage, ChannelGetAllMessagesCollectionRequest> {

    /**
     * The request builder for this collection of Channel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChannelGetAllMessagesCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ChannelGetAllMessagesCollectionRequestBuilder.class, ChannelGetAllMessagesCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ChannelGetAllMessagesCollectionRequest instance
     */
    @Override
    @Nonnull
    public ChannelGetAllMessagesCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ChannelGetAllMessagesCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
