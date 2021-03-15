// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WorkbookRangeBorder;
import com.microsoft.graph.requests.WorkbookRangeBorderCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.WorkbookRangeBorderCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Border Collection Page.
 */
public class WorkbookRangeBorderCollectionPage extends BaseCollectionPage<WorkbookRangeBorder, WorkbookRangeBorderCollectionRequestBuilder> {

    /**
     * A collection page for WorkbookRangeBorder
     *
     * @param response the serialized WorkbookRangeBorderCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookRangeBorderCollectionPage(@Nonnull final WorkbookRangeBorderCollectionResponse response, @Nonnull final WorkbookRangeBorderCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WorkbookRangeBorder
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WorkbookRangeBorderCollectionPage(@Nonnull final java.util.List<WorkbookRangeBorder> pageContents, @Nullable final WorkbookRangeBorderCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
