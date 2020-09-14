// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImCoshRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Im Cosh Request Builder.
 */
public interface IWorkbookFunctionsImCoshRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsImCoshRequest
     *
     * @return the IWorkbookFunctionsImCoshRequest instance
     */
    IWorkbookFunctionsImCoshRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsImCoshRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImCoshRequest instance
     */
    IWorkbookFunctionsImCoshRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
