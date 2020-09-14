// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICallKeepAliveRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Call Keep Alive Request Builder.
 */
public interface ICallKeepAliveRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ICallKeepAliveRequest
     *
     * @return the ICallKeepAliveRequest instance
     */
    ICallKeepAliveRequest buildRequest();

    /**
     * Creates the ICallKeepAliveRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ICallKeepAliveRequest instance
     */
    ICallKeepAliveRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
