// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookPivotTableRefreshAllRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Pivot Table Refresh All Request Builder.
 */
public interface IWorkbookPivotTableRefreshAllRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookPivotTableRefreshAllRequest
     *
     * @return the IWorkbookPivotTableRefreshAllRequest instance
     */
    IWorkbookPivotTableRefreshAllRequest buildRequest();

    /**
     * Creates the IWorkbookPivotTableRefreshAllRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookPivotTableRefreshAllRequest instance
     */
    IWorkbookPivotTableRefreshAllRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
