// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.DetectedAppPlatformType;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ManagedDeviceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Detected App.
 */
public class DetectedApp extends Entity implements IJsonBackedObject {


    /**
     * The Device Count.
     * The number of devices that have installed this application
     */
    @SerializedName(value = "deviceCount", alternate = {"DeviceCount"})
    @Expose
	@Nullable
    public Integer deviceCount;

    /**
     * The Display Name.
     * Name of the discovered application. Read-only
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Platform.
     * Indicates the operating system / platform of the discovered application.  Some possible values are Windows, iOS, macOS. The default value is unknown (0). Possible values are: unknown, windows, windowsMobile, windowsHolographic, ios, macOS, chromeOS, androidOSP, androidDeviceAdministrator, androidWorkProfile, androidDedicatedAndFullyManaged.
     */
    @SerializedName(value = "platform", alternate = {"Platform"})
    @Expose
	@Nullable
    public DetectedAppPlatformType platform;

    /**
     * The Publisher.
     * Indicates the publisher of the discovered application. For example: 'Microsoft'.  The default value is an empty string.
     */
    @SerializedName(value = "publisher", alternate = {"Publisher"})
    @Expose
	@Nullable
    public String publisher;

    /**
     * The Size In Byte.
     * Discovered application size in bytes. Read-only
     */
    @SerializedName(value = "sizeInByte", alternate = {"SizeInByte"})
    @Expose
	@Nullable
    public Long sizeInByte;

    /**
     * The Version.
     * Version of the discovered application. Read-only
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public String version;

    /**
     * The Managed Devices.
     * The devices that have the discovered application installed
     */
	@Nullable
    public com.microsoft.graph.requests.ManagedDeviceCollectionPage managedDevices;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("managedDevices")) {
            managedDevices = serializer.deserializeObject(json.get("managedDevices"), com.microsoft.graph.requests.ManagedDeviceCollectionPage.class);
        }
    }
}
