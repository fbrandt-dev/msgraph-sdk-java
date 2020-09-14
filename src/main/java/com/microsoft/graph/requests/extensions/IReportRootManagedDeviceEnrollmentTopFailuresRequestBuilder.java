// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentTopFailuresRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Managed Device Enrollment Top Failures Request Builder.
 */
public interface IReportRootManagedDeviceEnrollmentTopFailuresRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootManagedDeviceEnrollmentTopFailuresRequest
     *
     * @return the IReportRootManagedDeviceEnrollmentTopFailuresRequest instance
     */
    IReportRootManagedDeviceEnrollmentTopFailuresRequest buildRequest();

    /**
     * Creates the IReportRootManagedDeviceEnrollmentTopFailuresRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootManagedDeviceEnrollmentTopFailuresRequest instance
     */
    IReportRootManagedDeviceEnrollmentTopFailuresRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
