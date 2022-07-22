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
import com.microsoft.graph.models.NotificationTemplateBrandingOptions;
import com.microsoft.graph.models.LocalizedNotificationMessage;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.LocalizedNotificationMessageCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notification Message Template.
 */
public class NotificationMessageTemplate extends Entity implements IJsonBackedObject {


    /**
     * The Branding Options.
     * The Message Template Branding Options. Branding is defined in the Intune Admin Console. Possible values are: none, includeCompanyLogo, includeCompanyName, includeContactInformation, includeCompanyPortalLink, includeDeviceDetails.
     */
    @SerializedName(value = "brandingOptions", alternate = {"BrandingOptions"})
    @Expose
	@Nullable
    public EnumSet<NotificationTemplateBrandingOptions> brandingOptions;

    /**
     * The Default Locale.
     * The default locale to fallback onto when the requested locale is not available.
     */
    @SerializedName(value = "defaultLocale", alternate = {"DefaultLocale"})
    @Expose
	@Nullable
    public String defaultLocale;

    /**
     * The Display Name.
     * Display name for the Notification Message Template.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified Date Time.
     * DateTime the object was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Localized Notification Messages.
     * The list of localized messages for this Notification Message Template.
     */
    @SerializedName(value = "localizedNotificationMessages", alternate = {"LocalizedNotificationMessages"})
    @Expose
	@Nullable
    public LocalizedNotificationMessageCollectionPage localizedNotificationMessages;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("localizedNotificationMessages")) {
            localizedNotificationMessages = serializer.deserializeObject(json.get("localizedNotificationMessages"), LocalizedNotificationMessageCollectionPage.class);
        }
    }
}
