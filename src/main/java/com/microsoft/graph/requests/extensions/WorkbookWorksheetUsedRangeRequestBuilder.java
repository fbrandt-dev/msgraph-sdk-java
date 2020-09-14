// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetUsedRangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetUsedRangeRequest;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Used Range Request Builder.
 */
public class WorkbookWorksheetUsedRangeRequestBuilder extends BaseFunctionRequestBuilder implements IWorkbookWorksheetUsedRangeRequestBuilder {

    /**
     * The request builder for this WorkbookWorksheetUsedRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookWorksheetUsedRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this WorkbookWorksheetUsedRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param valuesOnly the valuesOnly
     */
    public WorkbookWorksheetUsedRangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Boolean valuesOnly) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("valuesOnly", valuesOnly));
    }

    /**
     * Creates the IWorkbookWorksheetUsedRangeRequest
     *
     * @return the IWorkbookWorksheetUsedRangeRequest instance
     */
    public IWorkbookWorksheetUsedRangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookWorksheetUsedRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookWorksheetUsedRangeRequest instance
     */
    public IWorkbookWorksheetUsedRangeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookWorksheetUsedRangeRequest request = new WorkbookWorksheetUsedRangeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }

    /**
     * Gets the request builder for WorkbookRangeFormat
     *
     * @return the IWorkbookRangeFormatRequestBuilder instance
     */
    public IWorkbookRangeFormatRequestBuilder format() {
        return new WorkbookRangeFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookRangeSort
     *
     * @return the IWorkbookRangeSortRequestBuilder instance
     */
    public IWorkbookRangeSortRequestBuilder sort() {
        return new WorkbookRangeSortRequestBuilder(getRequestUrlWithAdditionalSegment("sort"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the IWorkbookWorksheetRequestBuilder instance
     */
    public IWorkbookWorksheetRequestBuilder worksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }
}
