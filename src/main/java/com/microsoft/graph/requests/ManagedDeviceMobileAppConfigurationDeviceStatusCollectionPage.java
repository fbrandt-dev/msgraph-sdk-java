// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfigurationDeviceStatus;
import com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Device Status Collection Page.
 */
public class ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage extends BaseCollectionPage<ManagedDeviceMobileAppConfigurationDeviceStatus, ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder> {

    /**
     * A collection page for ManagedDeviceMobileAppConfigurationDeviceStatus
     *
     * @param response the serialized ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage(@Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse response, @Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ManagedDeviceMobileAppConfigurationDeviceStatus
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage(@Nonnull final java.util.List<ManagedDeviceMobileAppConfigurationDeviceStatus> pageContents, @Nullable final ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
