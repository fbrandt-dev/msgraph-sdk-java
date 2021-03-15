// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.PrinterLocation;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Connector.
 */
public class PrintConnector extends Entity implements IJsonBackedObject {


    /**
     * The App Version.
     * The connector's version.
     */
    @SerializedName(value = "appVersion", alternate = {"AppVersion"})
    @Expose
	@Nullable
    public String appVersion;

    /**
     * The Display Name.
     * The name of the connector.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Fully Qualified Domain Name.
     * The connector machine's hostname.
     */
    @SerializedName(value = "fullyQualifiedDomainName", alternate = {"FullyQualifiedDomainName"})
    @Expose
	@Nullable
    public String fullyQualifiedDomainName;

    /**
     * The Location.
     * The physical and/or organizational location of the connector.
     */
    @SerializedName(value = "location", alternate = {"Location"})
    @Expose
	@Nullable
    public PrinterLocation location;

    /**
     * The Operating System.
     * The connector machine's operating system version.
     */
    @SerializedName(value = "operatingSystem", alternate = {"OperatingSystem"})
    @Expose
	@Nullable
    public String operatingSystem;

    /**
     * The Registered Date Time.
     * The DateTimeOffset when the connector was registered.
     */
    @SerializedName(value = "registeredDateTime", alternate = {"RegisteredDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime registeredDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
