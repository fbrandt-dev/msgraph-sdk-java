// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.Conversation;
import com.microsoft.graph.requests.ConversationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ConversationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Collection Page.
 */
public class ConversationCollectionPage extends BaseCollectionPage<Conversation, ConversationCollectionRequestBuilder> {

    /**
     * A collection page for Conversation
     *
     * @param response the serialized ConversationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ConversationCollectionPage(@Nonnull final ConversationCollectionResponse response, @Nonnull final ConversationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Conversation
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ConversationCollectionPage(@Nonnull final java.util.List<Conversation> pageContents, @Nullable final ConversationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
