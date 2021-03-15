// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.CalendarGroup;
import com.microsoft.graph.requests.CalendarGroupCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.CalendarGroupCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Group Collection Page.
 */
public class CalendarGroupCollectionPage extends BaseCollectionPage<CalendarGroup, CalendarGroupCollectionRequestBuilder> {

    /**
     * A collection page for CalendarGroup
     *
     * @param response the serialized CalendarGroupCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CalendarGroupCollectionPage(@Nonnull final CalendarGroupCollectionResponse response, @Nonnull final CalendarGroupCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for CalendarGroup
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CalendarGroupCollectionPage(@Nonnull final java.util.List<CalendarGroup> pageContents, @Nullable final CalendarGroupCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
