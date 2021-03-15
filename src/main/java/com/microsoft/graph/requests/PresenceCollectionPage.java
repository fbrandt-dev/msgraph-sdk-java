// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.Presence;
import com.microsoft.graph.requests.PresenceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.PresenceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Presence Collection Page.
 */
public class PresenceCollectionPage extends BaseCollectionPage<Presence, PresenceCollectionRequestBuilder> {

    /**
     * A collection page for Presence
     *
     * @param response the serialized PresenceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PresenceCollectionPage(@Nonnull final PresenceCollectionResponse response, @Nonnull final PresenceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Presence
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PresenceCollectionPage(@Nonnull final java.util.List<Presence> pageContents, @Nullable final PresenceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
