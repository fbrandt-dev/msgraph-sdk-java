// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsTimeRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Time Request Builder.
 */
public interface IWorkbookFunctionsTimeRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsTimeRequest
     *
     * @return the IWorkbookFunctionsTimeRequest instance
     */
    IWorkbookFunctionsTimeRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsTimeRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTimeRequest instance
     */
    IWorkbookFunctionsTimeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
