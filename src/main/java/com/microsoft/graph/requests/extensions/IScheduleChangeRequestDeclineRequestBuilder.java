// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IScheduleChangeRequestDeclineRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Schedule Change Request Decline Request Builder.
 */
public interface IScheduleChangeRequestDeclineRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IScheduleChangeRequestDeclineRequest
     *
     * @return the IScheduleChangeRequestDeclineRequest instance
     */
    IScheduleChangeRequestDeclineRequest buildRequest();

    /**
     * Creates the IScheduleChangeRequestDeclineRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IScheduleChangeRequestDeclineRequest instance
     */
    IScheduleChangeRequestDeclineRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
