// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsF_DistRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions F_Dist Request Builder.
 */
public interface IWorkbookFunctionsF_DistRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsF_DistRequest
     *
     * @return the IWorkbookFunctionsF_DistRequest instance
     */
    IWorkbookFunctionsF_DistRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsF_DistRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsF_DistRequest instance
     */
    IWorkbookFunctionsF_DistRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
