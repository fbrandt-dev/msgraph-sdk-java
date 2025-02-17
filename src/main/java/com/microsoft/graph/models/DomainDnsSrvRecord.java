// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DomainDnsRecord;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Srv Record.
 */
public class DomainDnsSrvRecord extends DomainDnsRecord implements IJsonBackedObject {


    /**
     * The Name Target.
     * Value to use when configuring the Target property of the SRV record at the DNS host.
     */
    @SerializedName(value = "nameTarget", alternate = {"NameTarget"})
    @Expose
	@Nullable
    public String nameTarget;

    /**
     * The Port.
     * Value to use when configuring the port property of the SRV record at the DNS host.
     */
    @SerializedName(value = "port", alternate = {"Port"})
    @Expose
	@Nullable
    public Integer port;

    /**
     * The Priority.
     * Value to use when configuring the priority property of the SRV record at the DNS host.
     */
    @SerializedName(value = "priority", alternate = {"Priority"})
    @Expose
	@Nullable
    public Integer priority;

    /**
     * The Protocol.
     * Value to use when configuring the protocol property of the SRV record at the DNS host.
     */
    @SerializedName(value = "protocol", alternate = {"Protocol"})
    @Expose
	@Nullable
    public String protocol;

    /**
     * The Service.
     * Value to use when configuring the service property of the SRV record at the DNS host.
     */
    @SerializedName(value = "service", alternate = {"Service"})
    @Expose
	@Nullable
    public String service;

    /**
     * The Weight.
     * Value to use when configuring the weight property of the SRV record at the DNS host.
     */
    @SerializedName(value = "weight", alternate = {"Weight"})
    @Expose
	@Nullable
    public Integer weight;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
