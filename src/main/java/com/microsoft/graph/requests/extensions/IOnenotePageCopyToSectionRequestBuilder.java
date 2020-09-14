// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IOnenotePageCopyToSectionRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Onenote Page Copy To Section Request Builder.
 */
public interface IOnenotePageCopyToSectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IOnenotePageCopyToSectionRequest
     *
     * @return the IOnenotePageCopyToSectionRequest instance
     */
    IOnenotePageCopyToSectionRequest buildRequest();

    /**
     * Creates the IOnenotePageCopyToSectionRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IOnenotePageCopyToSectionRequest instance
     */
    IOnenotePageCopyToSectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
