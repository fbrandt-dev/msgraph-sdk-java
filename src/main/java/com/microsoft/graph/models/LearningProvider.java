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
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.LearningContentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Learning Provider.
 */
public class LearningProvider extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The display name that appears in Viva Learning. Required.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Login Web Url.
     * Authentication URL to access the courses for the provider. Optional.
     */
    @SerializedName(value = "loginWebUrl", alternate = {"LoginWebUrl"})
    @Expose
	@Nullable
    public String loginWebUrl;

    /**
     * The Long Logo Web Url For Dark Theme.
     * The long logo URL for the dark mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     */
    @SerializedName(value = "longLogoWebUrlForDarkTheme", alternate = {"LongLogoWebUrlForDarkTheme"})
    @Expose
	@Nullable
    public String longLogoWebUrlForDarkTheme;

    /**
     * The Long Logo Web Url For Light Theme.
     * The long logo URL for the light mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     */
    @SerializedName(value = "longLogoWebUrlForLightTheme", alternate = {"LongLogoWebUrlForLightTheme"})
    @Expose
	@Nullable
    public String longLogoWebUrlForLightTheme;

    /**
     * The Square Logo Web Url For Dark Theme.
     * The square logo URL for the dark mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     */
    @SerializedName(value = "squareLogoWebUrlForDarkTheme", alternate = {"SquareLogoWebUrlForDarkTheme"})
    @Expose
	@Nullable
    public String squareLogoWebUrlForDarkTheme;

    /**
     * The Square Logo Web Url For Light Theme.
     * The square logo URL for the light mode that needs to be a publicly accessible image. This image would be saved to the blob storage of Viva Learning for rendering within the Viva Learning app. Required.
     */
    @SerializedName(value = "squareLogoWebUrlForLightTheme", alternate = {"SquareLogoWebUrlForLightTheme"})
    @Expose
	@Nullable
    public String squareLogoWebUrlForLightTheme;

    /**
     * The Learning Contents.
     * Learning catalog items for the provider.
     */
    @SerializedName(value = "learningContents", alternate = {"LearningContents"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.LearningContentCollectionPage learningContents;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("learningContents")) {
            learningContents = serializer.deserializeObject(json.get("learningContents"), com.microsoft.graph.requests.LearningContentCollectionPage.class);
        }
    }
}
