// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.Channel;
import com.microsoft.graph.requests.ChannelCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ChannelCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel Collection Page.
 */
public class ChannelCollectionPage extends BaseCollectionPage<Channel, ChannelCollectionRequestBuilder> {

    /**
     * A collection page for Channel
     *
     * @param response the serialized ChannelCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ChannelCollectionPage(@Nonnull final ChannelCollectionResponse response, @Nonnull final ChannelCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Channel
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ChannelCollectionPage(@Nonnull final java.util.List<Channel> pageContents, @Nullable final ChannelCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
