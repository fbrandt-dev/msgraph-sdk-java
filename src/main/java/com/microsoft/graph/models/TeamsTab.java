// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.TeamsTabConfiguration;
import com.microsoft.graph.models.TeamsApp;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Tab.
 */
public class TeamsTab extends Entity implements IJsonBackedObject {


    /**
     * The Configuration.
     * Container for custom settings applied to a tab. The tab is considered configured only once this property is set.
     */
    @SerializedName(value = "configuration", alternate = {"Configuration"})
    @Expose
	@Nullable
    public TeamsTabConfiguration configuration;

    /**
     * The Display Name.
     * Name of the tab.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Web Url.
     * Deep link URL of the tab instance. Read only.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
	@Nullable
    public String webUrl;

    /**
     * The Teams App.
     * The application that is linked to the tab. This cannot be changed after tab creation.
     */
    @SerializedName(value = "teamsApp", alternate = {"TeamsApp"})
    @Expose
	@Nullable
    public TeamsApp teamsApp;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
