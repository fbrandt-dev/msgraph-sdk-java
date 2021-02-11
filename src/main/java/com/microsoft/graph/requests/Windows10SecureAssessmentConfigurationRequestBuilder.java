// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Windows10SecureAssessmentConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Secure Assessment Configuration Request Builder.
 */
public class Windows10SecureAssessmentConfigurationRequestBuilder extends BaseRequestBuilder<Windows10SecureAssessmentConfiguration> {

    /**
     * The request builder for the Windows10SecureAssessmentConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10SecureAssessmentConfigurationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the Windows10SecureAssessmentConfigurationRequest instance
     */
    @Nonnull
    public Windows10SecureAssessmentConfigurationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the Windows10SecureAssessmentConfigurationRequest instance
     */
    @Nonnull
    public Windows10SecureAssessmentConfigurationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.Windows10SecureAssessmentConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DeviceConfigurationAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new DeviceConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfigurationAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceConfigurationAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new DeviceConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SettingStateDeviceSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries() {
        return new SettingStateDeviceSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the SettingStateDeviceSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(@Nonnull final String id) {
        return new SettingStateDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceConfigurationDeviceStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new DeviceConfigurationDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfigurationDeviceStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceConfigurationDeviceStatusRequestBuilder deviceStatuses(@Nonnull final String id) {
        return new DeviceConfigurationDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationDeviceOverview
     *
     * @return the DeviceConfigurationDeviceOverviewRequestBuilder instance
     */
    @Nonnull
    public DeviceConfigurationDeviceOverviewRequestBuilder deviceStatusOverview() {
        return new DeviceConfigurationDeviceOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusOverview"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceConfigurationUserStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceConfigurationUserStatusCollectionRequestBuilder userStatuses() {
        return new DeviceConfigurationUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfigurationUserStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceConfigurationUserStatusRequestBuilder userStatuses(@Nonnull final String id) {
        return new DeviceConfigurationUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationUserOverview
     *
     * @return the DeviceConfigurationUserOverviewRequestBuilder instance
     */
    @Nonnull
    public DeviceConfigurationUserOverviewRequestBuilder userStatusOverview() {
        return new DeviceConfigurationUserOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusOverview"), getClient(), null);
    }
}
