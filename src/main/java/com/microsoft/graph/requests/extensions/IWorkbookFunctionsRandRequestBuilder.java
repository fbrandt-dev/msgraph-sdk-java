// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRandRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Rand Request Builder.
 */
public interface IWorkbookFunctionsRandRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsRandRequest
     *
     * @return the IWorkbookFunctionsRandRequest instance
     */
    IWorkbookFunctionsRandRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsRandRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRandRequest instance
     */
    IWorkbookFunctionsRandRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
