// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserDetailRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Teams Device Usage User Detail Request Builder.
 */
public interface IReportRootGetTeamsDeviceUsageUserDetailRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetTeamsDeviceUsageUserDetailRequest
     *
     * @return the IReportRootGetTeamsDeviceUsageUserDetailRequest instance
     */
    IReportRootGetTeamsDeviceUsageUserDetailRequest buildRequest();

    /**
     * Creates the IReportRootGetTeamsDeviceUsageUserDetailRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetTeamsDeviceUsageUserDetailRequest instance
     */
    IReportRootGetTeamsDeviceUsageUserDetailRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
