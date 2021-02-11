// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WorkbookRangeViewItemAtRequest;
import com.microsoft.graph.models.WorkbookRangeView;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.WorkbookRangeViewItemAtParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range View Item At Request Builder.
 */
public class WorkbookRangeViewItemAtRequestBuilder extends BaseFunctionRequestBuilder<WorkbookRangeView> {

    /**
     * The request builder for this WorkbookRangeViewItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookRangeViewItemAtRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookRangeViewItemAtParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the WorkbookRangeViewItemAtRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRangeViewItemAtRequest instance
     */
    @Nonnull
    public WorkbookRangeViewItemAtRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookRangeViewItemAtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRangeViewItemAtRequest instance
     */
    @Nonnull
    public WorkbookRangeViewItemAtRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WorkbookRangeViewItemAtRequest request = new WorkbookRangeViewItemAtRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }
    /**
     *  Gets a request builder for the WorkbookRangeView collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WorkbookRangeViewCollectionRequestBuilder rows() {
        return new WorkbookRangeViewCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rows"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkbookRangeView item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WorkbookRangeViewRequestBuilder rows(@Nonnull final String id) {
        return new WorkbookRangeViewRequestBuilder(getRequestUrlWithAdditionalSegment("rows") + "/" + id, getClient(), null);
    }
}
