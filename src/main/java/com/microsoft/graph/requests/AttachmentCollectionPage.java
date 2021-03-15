// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.Attachment;
import com.microsoft.graph.requests.AttachmentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AttachmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attachment Collection Page.
 */
public class AttachmentCollectionPage extends BaseCollectionPage<Attachment, AttachmentCollectionRequestBuilder> {

    /**
     * A collection page for Attachment
     *
     * @param response the serialized AttachmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AttachmentCollectionPage(@Nonnull final AttachmentCollectionResponse response, @Nonnull final AttachmentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Attachment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AttachmentCollectionPage(@Nonnull final java.util.List<Attachment> pageContents, @Nullable final AttachmentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
