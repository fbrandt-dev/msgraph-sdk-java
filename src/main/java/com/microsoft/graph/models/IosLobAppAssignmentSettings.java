// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MobileAppAssignmentSettings;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Lob App Assignment Settings.
 */
public class IosLobAppAssignmentSettings extends MobileAppAssignmentSettings implements IJsonBackedObject {


    /**
     * The Is Removable.
     * When TRUE, indicates that the app can be uninstalled by the user. When FALSE, indicates that the app cannot be uninstalled by the user. By default, this property is set to null which internally is treated as TRUE.
     */
    @SerializedName(value = "isRemovable", alternate = {"IsRemovable"})
    @Expose
	@Nullable
    public Boolean isRemovable;

    /**
     * The Uninstall On Device Removal.
     * When TRUE, indicates that the app should be uninstalled when the device is removed from Intune. When FALSE, indicates that the app will not be uninstalled when the device is removed from Intune. By default, property is set to null which internally is treated as TRUE.
     */
    @SerializedName(value = "uninstallOnDeviceRemoval", alternate = {"UninstallOnDeviceRemoval"})
    @Expose
	@Nullable
    public Boolean uninstallOnDeviceRemoval;

    /**
     * The Vpn Configuration Id.
     * This is the unique identifier (Id) of the VPN Configuration to apply to the app.
     */
    @SerializedName(value = "vpnConfigurationId", alternate = {"VpnConfigurationId"})
    @Expose
	@Nullable
    public String vpnConfigurationId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
