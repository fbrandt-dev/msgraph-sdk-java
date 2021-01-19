// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.WorkbookChartDataLabels;
import com.microsoft.graph.requests.extensions.WorkbookChartDataLabelFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Data Labels Request Builder.
 */
public class WorkbookChartDataLabelsRequestBuilder extends BaseRequestBuilder<WorkbookChartDataLabels> {

    /**
     * The request builder for the WorkbookChartDataLabels
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartDataLabelsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartDataLabelsRequest instance
     */
    @Nonnull
    public WorkbookChartDataLabelsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartDataLabelsRequest instance
     */
    @Nonnull
    public WorkbookChartDataLabelsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookChartDataLabelsRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartDataLabelFormat
     *
     * @return the WorkbookChartDataLabelFormatRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartDataLabelFormatRequestBuilder format() {
        return new WorkbookChartDataLabelFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }
}
