// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ReportRootGetYammerDeviceUsageUserCountsRequest;
import com.microsoft.graph.models.ReportRoot;
import com.microsoft.graph.models.Report;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.ReportRootGetYammerDeviceUsageUserCountsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Yammer Device Usage User Counts Request Builder.
 */
public class ReportRootGetYammerDeviceUsageUserCountsRequestBuilder extends BaseFunctionRequestBuilder<Report> {

    /**
     * The request builder for this ReportRootGetYammerDeviceUsageUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetYammerDeviceUsageUserCountsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this ReportRootGetYammerDeviceUsageUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetYammerDeviceUsageUserCountsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetYammerDeviceUsageUserCountsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the ReportRootGetYammerDeviceUsageUserCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetYammerDeviceUsageUserCountsRequest instance
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageUserCountsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ReportRootGetYammerDeviceUsageUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetYammerDeviceUsageUserCountsRequest instance
     */
    @Nonnull
    public ReportRootGetYammerDeviceUsageUserCountsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetYammerDeviceUsageUserCountsRequest request = new ReportRootGetYammerDeviceUsageUserCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }
}
