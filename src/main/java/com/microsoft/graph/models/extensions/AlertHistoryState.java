// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AlertFeedback;
import com.microsoft.graph.models.generated.AlertStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alert History State.
 */
public class AlertHistoryState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The App Id.
     * The Application ID of the calling application that submitted an update (PATCH) to the alert. The appId should be extracted from the auth token and not entered manually by the calling application.
     */
    @SerializedName(value = "appId", alternate = {"AppId"})
    @Expose
    public String appId;

    /**
     * The Assigned To.
     * UPN of user the alert was assigned to (note: alert.assignedTo only stores the last value/UPN).
     */
    @SerializedName(value = "assignedTo", alternate = {"AssignedTo"})
    @Expose
    public String assignedTo;

    /**
     * The Comments.
     * Comment entered by signed-in user.
     */
    @SerializedName(value = "comments", alternate = {"Comments"})
    @Expose
    public java.util.List<String> comments;

    /**
     * The Feedback.
     * Analyst feedback on the alert in this update. Possible values are: unknown, truePositive, falsePositive, benignPositive.
     */
    @SerializedName(value = "feedback", alternate = {"Feedback"})
    @Expose
    public AlertFeedback feedback;

    /**
     * The Status.
     * Alert status value (if updated). Possible values are: unknown, newAlert, inProgress, resolved, dismissed.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public AlertStatus status;

    /**
     * The Updated Date Time.
     * Date and time of the alert update. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "updatedDateTime", alternate = {"UpdatedDateTime"})
    @Expose
    public java.util.Calendar updatedDateTime;

    /**
     * The User.
     * UPN of the signed-in user that updated the alert (taken from the bearer token - if in user/delegated auth mode).
     */
    @SerializedName(value = "user", alternate = {"User"})
    @Expose
    public String user;


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
