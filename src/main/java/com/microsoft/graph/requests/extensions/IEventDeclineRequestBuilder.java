// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEventDeclineRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Event Decline Request Builder.
 */
public interface IEventDeclineRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IEventDeclineRequest
     *
     * @return the IEventDeclineRequest instance
     */
    IEventDeclineRequest buildRequest();

    /**
     * Creates the IEventDeclineRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IEventDeclineRequest instance
     */
    IEventDeclineRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
