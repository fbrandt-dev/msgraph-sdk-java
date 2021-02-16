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
 * The class for the Conditional Access Applications.
 */
public class ConditionalAccessApplications implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Exclude Applications.
     * The list of application IDs explicitly excluded from the policy.
     */
    @SerializedName(value = "excludeApplications", alternate = {"ExcludeApplications"})
    @Expose
    public java.util.List<String> excludeApplications;

    /**
     * The Include Applications.
     * The list of application IDs the policy applies to, unless explicitly excluded (in excludeApplications). Can also be set to All.
     */
    @SerializedName(value = "includeApplications", alternate = {"IncludeApplications"})
    @Expose
    public java.util.List<String> includeApplications;

    /**
     * The Include User Actions.
     * User actions to include. Supported values are urn:user:registersecurityinfo and urn:user:registerdevice
     */
    @SerializedName(value = "includeUserActions", alternate = {"IncludeUserActions"})
    @Expose
    public java.util.List<String> includeUserActions;


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
