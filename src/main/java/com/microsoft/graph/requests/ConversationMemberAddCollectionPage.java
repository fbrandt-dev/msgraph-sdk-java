// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ConversationMember;
import com.microsoft.graph.models.ActionResultPart;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ConversationMemberAddCollectionRequestBuilder;
import com.microsoft.graph.requests.ConversationMemberAddCollectionPage;
import com.microsoft.graph.requests.ConversationMemberAddCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Member Add Collection Page.
 */
public class ConversationMemberAddCollectionPage extends BaseCollectionPage<ActionResultPart, ConversationMemberAddCollectionRequestBuilder> {

    /**
     * A collection page for ActionResultPart.
     *
     * @param response The serialized ConversationMemberAddCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ConversationMemberAddCollectionPage(@Nonnull final ConversationMemberAddCollectionResponse response, @Nonnull final ConversationMemberAddCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ConversationMemberAdd
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ConversationMemberAddCollectionPage(@Nonnull final java.util.List<ActionResultPart> pageContents, @Nullable final ConversationMemberAddCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
