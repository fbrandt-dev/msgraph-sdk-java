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
import com.microsoft.graph.models.SecurityReportsRoot;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root.
 */
public class ReportRoot implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Daily Print Usage By Printer.
     * 
     */
    @SerializedName(value = "dailyPrintUsageByPrinter", alternate = {"DailyPrintUsageByPrinter"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.PrintUsageByPrinterCollectionPage dailyPrintUsageByPrinter;

    /**
     * The Daily Print Usage By User.
     * 
     */
    @SerializedName(value = "dailyPrintUsageByUser", alternate = {"DailyPrintUsageByUser"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.PrintUsageByUserCollectionPage dailyPrintUsageByUser;

    /**
     * The Monthly Print Usage By Printer.
     * 
     */
    @SerializedName(value = "monthlyPrintUsageByPrinter", alternate = {"MonthlyPrintUsageByPrinter"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.PrintUsageByPrinterCollectionPage monthlyPrintUsageByPrinter;

    /**
     * The Monthly Print Usage By User.
     * 
     */
    @SerializedName(value = "monthlyPrintUsageByUser", alternate = {"MonthlyPrintUsageByUser"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.PrintUsageByUserCollectionPage monthlyPrintUsageByUser;

    /**
     * The Security.
     * 
     */
    @SerializedName(value = "security", alternate = {"Security"})
    @Expose
	@Nullable
    public SecurityReportsRoot security;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("dailyPrintUsageByPrinter")) {
            dailyPrintUsageByPrinter = serializer.deserializeObject(json.get("dailyPrintUsageByPrinter"), com.microsoft.graph.requests.PrintUsageByPrinterCollectionPage.class);
        }

        if (json.has("dailyPrintUsageByUser")) {
            dailyPrintUsageByUser = serializer.deserializeObject(json.get("dailyPrintUsageByUser"), com.microsoft.graph.requests.PrintUsageByUserCollectionPage.class);
        }

        if (json.has("monthlyPrintUsageByPrinter")) {
            monthlyPrintUsageByPrinter = serializer.deserializeObject(json.get("monthlyPrintUsageByPrinter"), com.microsoft.graph.requests.PrintUsageByPrinterCollectionPage.class);
        }

        if (json.has("monthlyPrintUsageByUser")) {
            monthlyPrintUsageByUser = serializer.deserializeObject(json.get("monthlyPrintUsageByUser"), com.microsoft.graph.requests.PrintUsageByUserCollectionPage.class);
        }
    }
}
