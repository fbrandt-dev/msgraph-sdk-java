// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WorkbookWorksheet;
import com.microsoft.graph.requests.WorkbookWorksheetCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.WorkbookWorksheetCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Collection Page.
 */
public class WorkbookWorksheetCollectionPage extends BaseCollectionPage<WorkbookWorksheet, WorkbookWorksheetCollectionRequestBuilder> {

    /**
     * A collection page for WorkbookWorksheet
     *
     * @param response the serialized WorkbookWorksheetCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookWorksheetCollectionPage(@Nonnull final WorkbookWorksheetCollectionResponse response, @Nonnull final WorkbookWorksheetCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WorkbookWorksheet
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WorkbookWorksheetCollectionPage(@Nonnull final java.util.List<WorkbookWorksheet> pageContents, @Nullable final WorkbookWorksheetCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
