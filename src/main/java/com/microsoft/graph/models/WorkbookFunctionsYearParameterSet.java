// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Year Parameter Set.
 */
public class WorkbookFunctionsYearParameterSet {
    /**
     * The serial Number.
     * 
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement serialNumber;


    /**
     * Instiaciates a new WorkbookFunctionsYearParameterSet
     */
    public WorkbookFunctionsYearParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsYearParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsYearParameterSet(@Nonnull final WorkbookFunctionsYearParameterSetBuilder builder) {
        this.serialNumber = builder.serialNumber;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsYearParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsYearParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsYearParameterSet
     */
    public static final class WorkbookFunctionsYearParameterSetBuilder {
        /**
         * The serialNumber parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement serialNumber;
        /**
         * Sets the SerialNumber
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsYearParameterSetBuilder withSerialNumber(@Nullable final com.google.gson.JsonElement val) {
            this.serialNumber = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsYearParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsYearParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsYearParameterSet build() {
            return new WorkbookFunctionsYearParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.serialNumber != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("serialNumber", serialNumber));
        }
        return result;
    }
}
