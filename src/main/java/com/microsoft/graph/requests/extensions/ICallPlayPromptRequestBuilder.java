// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICallPlayPromptRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Call Play Prompt Request Builder.
 */
public interface ICallPlayPromptRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ICallPlayPromptRequest
     *
     * @return the ICallPlayPromptRequest instance
     */
    ICallPlayPromptRequest buildRequest();

    /**
     * Creates the ICallPlayPromptRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ICallPlayPromptRequest instance
     */
    ICallPlayPromptRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
