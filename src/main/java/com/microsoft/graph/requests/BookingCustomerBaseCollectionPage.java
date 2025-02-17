// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.BookingCustomerBase;
import com.microsoft.graph.requests.BookingCustomerBaseCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.BookingCustomerBaseCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Customer Base Collection Page.
 */
public class BookingCustomerBaseCollectionPage extends BaseCollectionPage<BookingCustomerBase, BookingCustomerBaseCollectionRequestBuilder> {

    /**
     * A collection page for BookingCustomerBase
     *
     * @param response the serialized BookingCustomerBaseCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BookingCustomerBaseCollectionPage(@Nonnull final BookingCustomerBaseCollectionResponse response, @Nonnull final BookingCustomerBaseCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for BookingCustomerBase
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public BookingCustomerBaseCollectionPage(@Nonnull final java.util.List<BookingCustomerBase> pageContents, @Nullable final BookingCustomerBaseCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
