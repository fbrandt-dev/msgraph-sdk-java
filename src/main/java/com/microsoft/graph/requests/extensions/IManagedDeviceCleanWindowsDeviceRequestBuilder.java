// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceCleanWindowsDeviceRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Clean Windows Device Request Builder.
 */
public interface IManagedDeviceCleanWindowsDeviceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IManagedDeviceCleanWindowsDeviceRequest
     *
     * @return the IManagedDeviceCleanWindowsDeviceRequest instance
     */
    IManagedDeviceCleanWindowsDeviceRequest buildRequest();

    /**
     * Creates the IManagedDeviceCleanWindowsDeviceRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceCleanWindowsDeviceRequest instance
     */
    IManagedDeviceCleanWindowsDeviceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
