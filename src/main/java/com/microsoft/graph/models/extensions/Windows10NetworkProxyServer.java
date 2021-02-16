// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Network Proxy Server.
 */
public class Windows10NetworkProxyServer implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Address.
     * Address to the proxy server. Specify an address in the format [':']
     */
    @SerializedName(value = "address", alternate = {"Address"})
    @Expose
    public String address;

    /**
     * The Exceptions.
     * Addresses that should not use the proxy server. The system will not use the proxy server for addresses beginning with what is specified in this node.
     */
    @SerializedName(value = "exceptions", alternate = {"Exceptions"})
    @Expose
    public java.util.List<String> exceptions;

    /**
     * The Use For Local Addresses.
     * Specifies whether the proxy server should be used for local (intranet) addresses.
     */
    @SerializedName(value = "useForLocalAddresses", alternate = {"UseForLocalAddresses"})
    @Expose
    public Boolean useForLocalAddresses;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
