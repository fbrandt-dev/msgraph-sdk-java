// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WorkbookTableItemAtRequest;
import com.microsoft.graph.models.WorkbookTable;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.WorkbookTableItemAtParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Item At Request Builder.
 */
public class WorkbookTableItemAtRequestBuilder extends BaseFunctionRequestBuilder<WorkbookTable> {

    /**
     * The request builder for this WorkbookTableItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookTableItemAtRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookTableItemAtParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the WorkbookTableItemAtRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookTableItemAtRequest instance
     */
    @Nonnull
    public WorkbookTableItemAtRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookTableItemAtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookTableItemAtRequest instance
     */
    @Nonnull
    public WorkbookTableItemAtRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WorkbookTableItemAtRequest request = new WorkbookTableItemAtRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }
    /**
     *  Gets a request builder for the WorkbookTableColumn collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WorkbookTableColumnCollectionRequestBuilder columns() {
        return new WorkbookTableColumnCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("columns"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkbookTableColumn item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WorkbookTableColumnRequestBuilder columns(@Nonnull final String id) {
        return new WorkbookTableColumnRequestBuilder(getRequestUrlWithAdditionalSegment("columns") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WorkbookTableRow collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WorkbookTableRowCollectionRequestBuilder rows() {
        return new WorkbookTableRowCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rows"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkbookTableRow item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WorkbookTableRowRequestBuilder rows(@Nonnull final String id) {
        return new WorkbookTableRowRequestBuilder(getRequestUrlWithAdditionalSegment("rows") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookTableSort
     *
     * @return the WorkbookTableSortRequestBuilder instance
     */
    @Nonnull
    public WorkbookTableSortRequestBuilder sort() {
        return new WorkbookTableSortRequestBuilder(getRequestUrlWithAdditionalSegment("sort"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the WorkbookWorksheetRequestBuilder instance
     */
    @Nonnull
    public WorkbookWorksheetRequestBuilder worksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }
}
